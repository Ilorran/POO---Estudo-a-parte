
public class VolvoCarro {

	public static void main(String[] args) {
		
		Carro volvo = new Volvo();
		volvo.setPreco(20000);
		System.out.println("Pre�o volvo: " + volvo.getPreco());
		System.out.print("Pre�o Volvo ap�s ajuste: " + volvo.getAjustaValor());

	}

}
