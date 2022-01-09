package memedlyaev.Controllers.CRUDControllers;

import memedlyaev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("main/read")
public class ReadController {
    PersonService personService;
    @Autowired
    public void setClientService(PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/readById")
    public String readById(){
        return "read_page/readById";
    }

    @PostMapping("/readById")
    public String readByIdReady(@RequestParam String sourceText){
        return "redirect:/main/read/readById/"+sourceText;
    }

    @GetMapping("/readAll")
    public String readAll(Model model){
        model.addAttribute("persons",personService.getAll());

        return "read_page/show";
    }

    @GetMapping("/readById/{id}")
    public String index(@PathVariable("id") Long id, Model model){
        model.addAttribute("persons",personService.getById(id));
        return "read_page/show";
    }

}
