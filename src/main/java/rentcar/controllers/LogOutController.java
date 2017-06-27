package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;

@Controller
public class LogOutController {

    private static final Logger logger = LoggerFactory.getLogger(LogOutController.class);

    @RequestMapping(value="/logout" , method = RequestMethod.GET)
    public String getLogOut(HttpSession httpSession)
    {
        httpSession.invalidate();
        return "index";
    }
}
