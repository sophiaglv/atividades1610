package relacao;

public class PrincipalComposicao {

	public static void main(String[] args) {
		Livro livro = new Livro("Biblia", "Jesus");

		System.out.println(livro.getTitulo() + ", " + livro.getAutor());
	}

}
