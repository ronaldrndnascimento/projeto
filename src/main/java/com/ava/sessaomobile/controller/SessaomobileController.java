package com.ava.sessaomobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ava.sessaomobile.model.SessaomobileModel;
import com.ava.sessaomobile.repository.SessaomobileRepository;

@Controller
@RequestMapping("/sessaomobile")
public class SessaomobileController {

	@Autowired
	private SessaomobileRepository repo;
	
	
    @GetMapping
    @ResponseBody
    public String home() {
        return "funcionando sessaomobile pagina inicial";
    }
    
        @PostMapping("/salvar")
        public String salvar(@ModelAttribute SessaomobileModel sessaomobile) {
            repo.save(sessaomobile);
            return "redirect:/sessaomobile/listar";
        }
	

        @GetMapping("/cadastrar")
        public String forms() {
            return "sessaomobile_forms";
        }
	
        @GetMapping("/listar")
        public String listar(Model model) {
            model.addAttribute("sessaomobile", repo.findAll());
            return "sessaomobile_listar";
        }

        @GetMapping("/lista/{id}")
        public String buscar(@PathVariable Integer id, Model model) {
            model.addAttribute("sessaomobile", repo.findById(id).orElse(null));
            return "sessaomobile_listar";
        }
        
        
        
}
