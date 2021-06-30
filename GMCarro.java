
public class GMCarro {

	public static void main(String[] args) {
		Carro gm = new GM();
		
		gm.setPreco(10000);
		System.out.println("Preço GM: " + gm.getPreco());
		System.out.print("Preço GM após ajuste: " + gm.getAjustaValor());

	}

}
