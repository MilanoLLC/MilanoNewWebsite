package com.milanopalace.website.productionWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewsController {
	

	
	
	
	@GetMapping("/fitout")
	public String portfoliodetails() {
		return "fitoutProfile";
	}
	
	
	
	@GetMapping("/proposaldcaa")
	public String proposaldcaa() {
		return "proposaldcaa";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/index")
	public String indexpath() {
		return "index";
	}
	  
	@GetMapping("/events")
	public String events() {
		return "corporate events";
	}
	
	@GetMapping("/wedding")
	public String wedding() {
		return "wedding events";
	}
	
	@GetMapping("/marketingDm")
	public String marketingDm() {
		return "digital marketing";
	}
	
	@GetMapping("/marketingSm")
	public String marketingSm() {
		return "social media marketing";
	}
	
	@GetMapping("/marketingGa")
	public String marketingGa() {
		return "google ads";
	} 
	  
	
	@GetMapping("/marketingWd")
	public String marketingWd() {   
		return "web design"; 
	}  
	  
	@GetMapping("/itSolutions")    
	public String itSolutions() {  
		return "itSolutions";
	} 
	
	@GetMapping("/itSolution")    
	public String itSolution() {  
		return "itSol";
	} 
	  
	@GetMapping("/marketingApps")
	public String marketingApps() {
		return "app development"; 
	}   
	 
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/testing")  
	public String testing() {
		return "testing"; 
	}     
	   
}   
    