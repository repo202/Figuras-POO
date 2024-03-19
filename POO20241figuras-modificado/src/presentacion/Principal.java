package presentacion;

import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Figura;
import logica.Triangulo;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
                int opcion=0;
                Figura f;
                System.out.println("Ingresa:");
                System.out.println("1. Cuadrado");
                System.out.println("2. Circulo");
                System.out.println("3. Triangulo");
                System.out.println("4. Cubo");
                opcion = valor.nextInt();
                switch (opcion) {
                    case 1:
                        double area, perimetro;
                        System.out.println("Ingresa el area del cuadrado:");
                        area = valor.nextDouble();
                        f = new Cuadrado(area);
                        System.out.println("El area de este cuadrado es: " + f.area());
                        System.out.println("");
                        System.out.println("Ingresa el perimetro del cuadrado:");
                        perimetro = valor.nextDouble();
                        f = new Cuadrado(perimetro);
                        System.out.println("El perimetro de este cuadrado es: " + f.perimetro());
                        break;
                    case 2:
                        double area1, perimetro1;
                        System.out.println("Ingrese el area del circulo:");
                        area1 = valor.nextDouble();
                        f = new Circulo(area1);
                        System.out.println("El area de este circulo es: " + f.area());
                        System.out.println("Ingrese el perimetro del circulo:");
                        perimetro1 = valor.nextDouble();
                        System.out.println("El perimetro de este circulo es: " + f.perimetro());
                        break;
                    case 3:
                        double base, altura;
                        System.out.println("Ingrese la base del triangulo");
                        base = valor.nextDouble();
                        System.out.println("Ingrese la altura del triangulo:");
                        altura = valor.nextDouble();
                        f = new Triangulo(base, altura);
                        System.out.println("El area de este triangulo es: " + f.area());
                        System.out.println("El perimetro de este triangulo 'Rectangulo' es : " + f.area());
                        break;
                    case 4: 
                        double lado;
                        System.out.println("Ingrese el lado del cubo");
                        lado = valor.nextDouble();
                        Cubo c = new Cubo(lado); 
                        System.out.println("El area del cubo es: " + c.volumen());
                        break;
                    default: 
                        System.out.println("ingresa una opcion correcta");
                }
	}
}