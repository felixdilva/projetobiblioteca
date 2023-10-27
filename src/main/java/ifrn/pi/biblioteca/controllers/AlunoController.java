package ifrn.pi.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
	
	@RequestMapping("/Aluno/form")
	public String form() {
		return "formAluno";
	}

}
