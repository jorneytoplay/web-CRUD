package memedlyaev.Controllers.CRUDControllers;

import memedlyaev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main")
public class DeleteController {

    PersonService personService;
    @Autowired
    public void setClientService(PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/delete")
    public String viewDelete(){
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id){
        personService.delete(id);
        return "redirect:/main";
    }


}
