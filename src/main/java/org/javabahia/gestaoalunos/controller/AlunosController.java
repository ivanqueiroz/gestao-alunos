package org.javabahia.gestaoalunos.controller;

import org.javabahia.gestaoalunos.repository.Alunos;
import org.javabahia.gestaoalunos.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ivanqueiroz
 */
@Controller
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private Alunos alunos;

    @PostMapping
    public String salvar(Aluno aluno) {
        this.alunos.save(aluno);
        return "redirect:/alunos";
    }

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaAlunos");
        modelAndView.addObject("alunos", alunos.findAll());
        modelAndView.addObject(new Aluno());
        return modelAndView;
    }

}
