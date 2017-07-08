package rentcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Info pages were merged into one controller class

@Controller
public class RelatedSiteInfoController {

    //About section
    @RequestMapping(value="/about" , method = RequestMethod.GET)
    public ModelAndView getRegister()
    {
        return new ModelAndView("about");
    }

    //Articles section
    @RequestMapping(value="/articles", method= RequestMethod.GET)
    public ModelAndView getArticlesPage()
    {
        return new ModelAndView("articles");
    }

    @RequestMapping(value="/reasons", method = RequestMethod.GET)
    public ModelAndView getArticleReasons()
    {
        return new ModelAndView("articlesreasons");
    }

    @RequestMapping(value="/pickluxury", method= RequestMethod.GET)
    public ModelAndView getArticleLuxury()
    {
        return new ModelAndView("pickluxury");
    }

    @RequestMapping(value="primeluxury", method = RequestMethod.GET)
    public ModelAndView getArticlePrimeLuxury()
    {
        return new ModelAndView("primeluxury");
    }

    //FAQ section
    @RequestMapping(value="/faq", method= RequestMethod.GET)
    public ModelAndView getFAQpage()
    {
        return new ModelAndView("faq");
    }

    //Terms and conditions
    @RequestMapping(value = "/terms", method = RequestMethod.GET)
    public ModelAndView getTermsConditionsPage()
    {
        return new ModelAndView("terms");
    }
}
