package by.tms.sbsecurity.controller;

import by.tms.sbsecurity.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/calc")
public class CalculatorController {

    @GetMapping
    public ModelAndView modelAndView(ModelAndView modelAndView) {
        modelAndView.setViewName("calc");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView modelAndView(Calculator calculator, ModelAndView modelAndView){
        calculator.setResult(calculator.getNum1() + calculator.getNum2());
        modelAndView.addObject(calculator);
        modelAndView.setViewName("calc");
        return modelAndView;
    }
}
