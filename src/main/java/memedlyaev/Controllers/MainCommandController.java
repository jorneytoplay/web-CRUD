package memedlyaev.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainCommandController {

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/read")
    public String read(){
        return "read_page/read";
    }
}
