package br.com.diogotb.loja_livros.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;


@Controller
public class indexController {
    @GetMapping("/")
    public ModelAndView getIndex() {
        ModelAndView mv = new ModelAndView("index");
             return mv ;
    }
    

    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView mv = new ModelAndView("index");
             return mv ;
    }
    @GetMapping("/livros-add")
    public ModelAndView getLivrosAdd() {
        ModelAndView mv = new ModelAndView("livros-add");
             return mv ;
    }
    
}