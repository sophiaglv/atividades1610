package relacao;

public class Professor {
	private String nome;
	private Departamento departamento;
	
	public Professor(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirInfo() {
		System.out.println("Professor: " + nome + "| Departamento: " + departamento.getNome());
	}
	
	public void exibirInfo2() {
		System.out.println("Professor: " + nome);
	}
}
