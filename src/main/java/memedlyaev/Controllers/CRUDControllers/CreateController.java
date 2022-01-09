package memedlyaev.Controllers.CRUDControllers;

import memedlyaev.Entity.Person;
import memedlyaev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CreateController {

    PersonService personService;
    @Autowired
    public void setClientService(PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/create")
    public String newUser(@ModelAttribute("person") Person person){
        return "create";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person){
        System.out.println(person);
        personService.save(person);
        return "redirect:/main";
    }
}
