package relacao;

public class Livro {
	private String titulo;
	private Autor autor;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = new Autor(autor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor.getNome();
	}

}
