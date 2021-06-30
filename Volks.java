
public class Volks{

	public static void main(String[] args) {
		
		Carro gol = new VolksCarro();
		
		gol.setPreco(15000);
		System.out.println("Valor do Gol: " + gol.getPreco());
		System.out.print("Valor do gol com ajuste: " + gol.getAjustaValor());
	}

}
