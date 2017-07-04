package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FAQController {

    private static final Logger logger = LoggerFactory.getLogger(FAQController.class);

    @RequestMapping(value="/faq", method= RequestMethod.GET)
    public String getArticlesPage()
    {
        return "faq";
    }
}
