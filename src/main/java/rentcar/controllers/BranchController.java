package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.BranchData;
import rentcar.services.BranchDataService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BranchController {

    private static final Logger logger = LoggerFactory.getLogger(BranchController.class);

    @Autowired
    BranchDataService branchDataService;

    @RequestMapping(value="/branches" , method = RequestMethod.GET)
    public ModelAndView getReservationView()
    {
        List<BranchData> branchData = branchDataService.getAllBranchData();

        ModelAndView page = new ModelAndView();
        page.addObject("allBranches", branchData);
        page.addObject("sizeAllBranches", branchData.size());
        page.setViewName("branches");
        return page;
    }
}
