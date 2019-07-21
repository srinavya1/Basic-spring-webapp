package springMVC.webapp_javaonly.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.webapp_javaonly.Model.student;
@org.springframework.stereotype.Controller
@RequestMapping("hello")
public class Controller {

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
	public String showpage2(Model m) {
			//System.out.println("inside");
		m.addAttribute("st", new student());
		return "cls";
}	
	@RequestMapping("/processfrm")
	public String process( @ModelAttribute("st") student s) {
		
		System.out.println("s :"+s.fname);
		return "final";
}	
}
