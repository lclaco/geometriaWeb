package modelo;

public class Rectangulo {
 private int base;
 private int altura;
/**
 * 
 */
public Rectangulo() {
}
/**
 * @param base
 * @param altura
 */
public Rectangulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
}

/**
 * calculo del area del rectangulo
 * @return la multipliacion de sus lados b*a
 */
public int calcularArea() {
	return base*altura;
}

/**
 * calcula el perimetro del rectangulo
 * @return la suma de sus lados 2*(a+b)
 */
public int calcularPerimetro() {
	return 2*(base+altura);
}

/**
 * @return the base
 */
public int getBase() {
	return base;
}
/**
 * @param base the base to set
 */
public void setBase(int base) {
	this.base = base;
}
/**
 * @return the altura
 */
public int getAltura() {
	return altura;
}
/**
 * @param altura the altura to set
 */
public void setAltura(int altura) {
	this.altura = altura;
}
 
 
 
}
