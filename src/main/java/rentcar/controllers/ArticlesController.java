package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class ArticlesController {

    private static final Logger logger = LoggerFactory.getLogger(ArticlesController.class);

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
}
