
public class GMCarro {

	public static void main(String[] args) {
		Carro gm = new GM();
		
		gm.setPreco(10000);
		System.out.println("Pre�o GM: " + gm.getPreco());
		System.out.print("Pre�o GM ap�s ajuste: " + gm.getAjustaValor());

	}

}
