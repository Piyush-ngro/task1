package com.maven_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.service.CalculatorService;


@Controller
public class calculatorController {
	
	 @RequestMapping("/calculatorForm")
	    public String showForm() {
	        // Return the name of the JSP or view
	        return "calculatorForm"; // This corresponds to /WEB-INF/views/calculatorForm.jsp
	    }
	 
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") double num1, 
                                  @RequestParam("num2") double num2, 
                                  @RequestParam("operation") String operation) {
        double result = 0;
        switch (operation) {
            case "add":
                result = calculatorService.add(num1, num2);
                break;
            case "subtract":
                result = calculatorService.subtract(num1, num2);
                break;
            case "multiply":
                result = calculatorService.multiply(num1, num2);
                break;
            case "divide":
                result = calculatorService.divide(num1, num2);
                break;
        }
        ModelAndView modelAndView = new ModelAndView("calculatorForm");
        modelAndView.addObject("result", result);
        modelAndView.setViewName("calculatorForm");
        return modelAndView;
    }
}

