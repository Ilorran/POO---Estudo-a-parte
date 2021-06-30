
public class Testa_todos {

	public static void main(String[] args) {
		
		Carro vw = new VolksCarro();
		vw.setPreco(15000);
		
		Carro vlv = new Volvo();
		vlv.setPreco(20000);
		
		Carro gm = new GM();
		gm.setPreco(10000);
		
		RegistraCarro registra = new RegistraCarro();
		registra.RegistraCarro(gm);
		registra.RegistraCarro(vlv);
		registra.RegistraCarro(vw);
		
		System.out.print("Soma de veículos: " + registra.getSoma());
	}

}
