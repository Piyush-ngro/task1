package com.maven_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.service.CalculatorService;

@Controller
public class CalculatorController {

    @RequestMapping("/calculatorForm")
    public String showForm() {
        return "calculatorForm"; // This corresponds to /WEB-INF/views/calculatorForm.jsp
    }

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
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
        return modelAndView;
    }
}