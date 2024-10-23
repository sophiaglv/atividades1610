package relacao;

public class Biblioteca {
	private Livro livro;
	
	public Biblioteca(String livro) {
		this.livro = new Livro(livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
}
