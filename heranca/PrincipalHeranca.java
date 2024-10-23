package heranca;

public class PrincipalHeranca {

	public static void main(String[] args) {
	Automovel automovel = new Automovel("Chevrolet", "Onix", 2022, "Branco", 4, "1.0 Turbo");
	Moto moto = new Moto("Honda", "CG 160 Titan", 2023, "Vermelha", 162);
	
	automovel.exibirInfo();
	System.out.println();
	moto.exibirInfo();
	}

}
