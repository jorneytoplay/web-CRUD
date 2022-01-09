package memedlyaev.Controllers;

import memedlyaev.Entity.Person;
import memedlyaev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class MainController {
    private PersonService personService;

    @GetMapping("/main")
    public String homePage(){
        return "main";
    }




}
