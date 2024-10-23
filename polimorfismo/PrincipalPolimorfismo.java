package polimorfismo;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {
		Medico medico = new Medico("Robson", "Cardiologia", 300, "464814894745");
		Dentista dentista = new Dentista("Romaria", "Estomatologista", 120, "25678631587");
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("André", "Acunputura", 150, "58974314868");
		
		medico.agendarConsulta();
		dentista.agendarConsulta();
		fisioterapeuta.agendarConsulta();
	}

}
