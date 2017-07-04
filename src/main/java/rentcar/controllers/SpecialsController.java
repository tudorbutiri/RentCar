package rentcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpecialsController {
    @RequestMapping(value="/specials" , method = RequestMethod.GET)
    public String getRegister()
    {
        return "carselection";
    }
}
