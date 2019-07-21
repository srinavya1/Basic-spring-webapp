package springMVC.webapp_javaonly.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.stereotype.Controller
@RequestMapping("copy")
public class CopyOfController {

	@RequestMapping("/")
public String showpage() {
		System.out.println("inside");
	return "input";}
	
	@RequestMapping("/process")
	public String showpage1( Model model,@RequestParam("sname") String sname) {
		model.addAttribute("val", sname);
		//System.out.println("inside");
		return "helloworld";
}	
	@RequestMapping("/input")
	public String showpage2() {
			//System.out.println("inside");
		return "input";
}	
}
