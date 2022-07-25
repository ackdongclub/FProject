package Pkg.Admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cart2Controller {
	
	@RequestMapping("cart")
	public String goCart2() {
		return "/Admin/Cart2";
		
	}

}
