package polimorfismo;

public class Medico extends ProfissionalSaude{
	
	private String crm;
	
	public Medico() {}
	
	public Medico (String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("Nome do médico: " + nome + "| Especialidade: " + especialidade);
		System.out.println("CRM: " + crm + "Valor da consulta: " + valorConsulta);
	}
}
