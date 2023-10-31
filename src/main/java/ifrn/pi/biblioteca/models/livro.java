package ifrn.pi.biblioteca.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String titulo;
	private String autor;
	private String editora;
	private String ano;
	private String edicao;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		editora = editora;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		ano = ano;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdição(String edicao) {
		edicao = edicao;
	}

	@Override
	public String toString() {
		return "livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + ", edicao="
				+ edicao + "]";
	}

}
