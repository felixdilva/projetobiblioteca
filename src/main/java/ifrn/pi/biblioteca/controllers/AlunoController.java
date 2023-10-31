package ifrn.pi.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.biblioteca.models.Aluno;



@Controller
public class AlunoController {
	
	@RequestMapping("/Aluno/form")
	public String form() {
		return "formAluno";
	}
 
	@PostMapping("/aluno")
	public String adicionar(Aluno aluno) {
		
		System.out.println(aluno);
	
		
		
		return "aluno-cadastrado";
	  
  
  }
}
