package logica;

public class Cubo extends Cuadrado implements Cuerpo {

    public Cubo(double valor1) {
        super(valor1);
    }

    public Cubo() {
        super();
    }

    
    public double volumen() {
        return Math.pow(valor1, 3);
    }
    
} 