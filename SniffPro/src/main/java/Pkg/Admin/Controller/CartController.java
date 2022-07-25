package Pkg.Admin.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class CartController {
	
	@RequestMapping("Carts")
	public String goCart() {
		
		return "Admin/Cart";
		
	}

}
