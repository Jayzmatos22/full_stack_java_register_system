package Teste_sistema_cadastro.demo.controller;

import Teste_sistema_cadastro.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {

    private final Service service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Construtor
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestParam String nome, @RequestParam String email,
                            @RequestParam String senha, @RequestParam String faculdade) {
        try {
            service.salvarAluno(nome, email, senha, faculdade);
            return "redirect:/sucesso";
        } catch (RuntimeException e) {
            //
            return "redirect:/?duplicado=true";
        }
    }

    @GetMapping("/sucesso")
    public String paginaSucesso() {
        return "login_sucesso";
    }



}