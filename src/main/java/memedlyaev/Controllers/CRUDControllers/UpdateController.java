package memedlyaev.Controllers.CRUDControllers;

import memedlyaev.Entity.Person;
import memedlyaev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("main")
public class UpdateController {
    public static String field;
    PersonService personService;
    @Autowired
    public void setClientService(PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/update")
    public String updateButton(){
        return "update-page/update";
    }

    @GetMapping("/update-name")
    public String updateName(Model model){
        model.addAttribute("field","Name");
        field="Name";
        return "update-page/update-form";
    }

    @GetMapping("/update-status")
    public String updateStatus(Model model){
        model.addAttribute("field","Status");
        field="Status";
        return "update-page/update-form";
    }

    @PostMapping()
    public String update(@RequestParam Long id, @RequestParam String newField){
        if(field.equals("Name")){
            personService.updateName(id,newField);
        }
        else if(field.equals("Status")){
            personService.updateStatus(id,newField);
        }
        field=null;
        return "redirect:/main";
    }
}
