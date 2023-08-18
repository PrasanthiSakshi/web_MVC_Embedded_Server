package in.sakshi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MsgController {
	
	
	@GetMapping("/")
	public String WelcomeMsg(Model model) {
		model.addAttribute("msg", "Good Evening");
		return "index";
		
		
	}

}
