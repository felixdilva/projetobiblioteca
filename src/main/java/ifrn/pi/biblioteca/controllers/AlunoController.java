package ifrn.pi.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.biblioteca.models.Aluno;
import ifrn.pi.biblioteca.repositories.AlunoRepository;



@Controller
public class AlunoController {
	
	@Autowired
	private AlunoRepository er;
	
	@RequestMapping("/aluno/form")
	public String form() {
		return "biblioteca/formAluno";
	}
 
	@PostMapping("/aluno")
	public String adicionar(Aluno aluno) {
		
		System.out.println(aluno);
	    er.save(aluno);
		
		
		return "biblioteca/aluno-cadastrado";
	  
  
  }
}
