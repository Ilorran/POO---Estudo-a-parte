
public class Volvo extends Carro{
	
	public double getAjustaValor() {
		return super.getAjustaValor() + (super.getPreco() * 0.02);
	}	
}

