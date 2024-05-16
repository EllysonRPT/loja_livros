package br.com.diogotb.loja_livros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.diogotb.loja_livros.Repository.LivrosRepository;
import br.com.diogotb.loja_livros.Model.Livro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RestController
public class LivrosController {
    
    @Autowired
    LivrosRepository livrosRepository;

    @GetMapping("/livros")
    public List<Livro> list() {
        return (List<Livro>) this.livrosRepository.findAll();    
    }

    @PostMapping("/livros")
    public ModelAndView create(@RequestBody Livro livro) {
        ModelAndView mv = new ModelAndView();
        livrosRepository.save(livro);
        return mv;
    }
    


    

}
