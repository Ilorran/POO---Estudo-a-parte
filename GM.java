
public class GM extends Carro{

	public double getAjustaValor() {
		return super.getAjustaValor() + (super.getPreco() * 1.1);
	}
}

