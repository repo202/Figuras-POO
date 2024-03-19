package logica;

public class Cuadrado extends Figura {

	public Cuadrado(double valor1) {
		super(valor1);
	}
	
	public Cuadrado() {
		super();
	}

	@Override
	public double area() {
            return Math.pow(valor1, 2);
	}

	@Override
	public double perimetro() {
            return 4*valor1;
	}

}
