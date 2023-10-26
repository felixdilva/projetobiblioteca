package ifrn.pi.biblioteca.models;

public class Aluno {

	private String Nome;
	private String Cpf;
	private String Endereço;
	private String Matricula;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

}
