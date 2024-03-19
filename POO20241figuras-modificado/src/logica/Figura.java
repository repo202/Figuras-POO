package logica;

public abstract class Figura {
	protected double valor1;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public Figura(double valor1) {
		this.valor1 = valor1;
	}
	
	public Figura() {
		this.valor1 = 0;
	}
        
	public abstract double area();
	public abstract double perimetro();
	
}
