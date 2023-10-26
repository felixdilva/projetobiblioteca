package ifrn.pi.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmprestimoController {
	
	@RequestMapping("/Emprestimo/form")
	public String form( ) {
		return "formAluno";
		
	}
	

}
