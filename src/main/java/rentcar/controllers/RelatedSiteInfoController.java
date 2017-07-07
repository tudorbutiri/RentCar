package rentcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Info pages were merged into one controller class

@Controller
public class RelatedSiteInfoController {

    //About section
    @RequestMapping(value="/about" , method = RequestMethod.GET)
    public String getRegister()
    {
        return "about";
    }

    //Articles section
    @RequestMapping(value="/articles", method= RequestMethod.GET)
    public String getArticlesPage()
    {
        return "articles";
    }

    @RequestMapping(value="/reasons", method = RequestMethod.GET)
    public String getArticleReasons()
    {
        return "articlesreasons";
    }

    @RequestMapping(value="/pickluxury", method= RequestMethod.GET)
    public String getArticleLuxury()
    {
        return "pickluxury";
    }

    @RequestMapping(value="primeluxury", method = RequestMethod.GET)
    public String getArticlePrimeLuxury()
    {
        return "primeluxury";
    }

    //FAQ section
    @RequestMapping(value="/faq", method= RequestMethod.GET)
    public String getFAQpage()
    {
        return "faq";
    }

    //Terms and conditions
    @RequestMapping(value = "/terms", method = RequestMethod.GET)
    public String getTermsConditionsPage()
    {
        return "terms";
    }
}
