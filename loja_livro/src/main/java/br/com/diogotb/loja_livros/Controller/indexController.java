package br.com.diogotb.loja_livros.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;


@Controller
public class indexController {
    @GetMapping("/")
    public ModelAndView getIndex("index") {
        ModelAndView mv = new ModelAndView();
             return mv ;
    }
    

    @GetMapping("/home")
    public ModelAndView getHome("index") {
        ModelAndView mv = new ModelAndView();
             return mv ;
    }
    
}