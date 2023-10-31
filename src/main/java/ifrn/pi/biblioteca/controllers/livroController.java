package ifrn.pi.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.biblioteca.models.livro;
import ifrn.pi.biblioteca.repositories.livroRepository;


@Controller
public class livroController {
	
	@Autowired
	private livroRepository li;
	
	@RequestMapping("/livro/form")
	public String form() {
		return "biblioteca/formlivro";
	}
 
	@PostMapping("/livro")
	public String adicionar(livro livro) {
		
		System.out.println(livro);
	   li.save(livro);
		
		return "biblioteca/aluno-cadastrado";
	  
  
  }
}
	
	


