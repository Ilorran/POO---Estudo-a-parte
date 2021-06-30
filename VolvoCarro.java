
public class VolvoCarro {

	public static void main(String[] args) {
		
		Carro volvo = new Volvo();
		volvo.setPreco(20000);
		System.out.println("Preço volvo: " + volvo.getPreco());
		System.out.print("Preço Volvo após ajuste: " + volvo.getAjustaValor());

	}

}
