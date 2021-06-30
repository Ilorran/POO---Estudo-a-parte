
public class RegistraCarro {

	private double soma;
	
	public void RegistraCarro(Carro c) {
		double vtotal = c.getAjustaValor();
		this.soma = this.soma + vtotal;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
