package com.soit;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSoitController {

	
	//Controller method to view the form 
	@RequestMapping("/viewform")	
	public String viewForm() {
		
		return "hellosoitform";
	}
	
	
	
	//Controller method to process the form (read form data and add data to the model)
	@RequestMapping("/processForm")
	public String processForm(@RequestParam ("facultyName") String name, Model model)
	{
		//Read the request parameter from the html form
	//	String name = request.getParameter("facultyName");
		
		//Convert the inserted data to all caps
		name = name.toUpperCase();
		
		
		//Create message for the result
		String result = "Hello Professor! " + name;
		
		
		//Add message to the result
		model.addAttribute("message", result);
		
		return "hellosoit";
	}
	
	
}
