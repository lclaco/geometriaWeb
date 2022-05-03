/**
 * 
 */
package modelo;

/**
 * @author Infoseg
 *
 */
public class Circulo {
	private double diametro;

	/**
	 * 
	 */
	public Circulo() {
	}

	/**
	 * @param diametro
	 */
	public Circulo(double diametro) {
		this.diametro = diametro;
	}
	
	public double calcularArea() {
		double radio = diametro/2;
		return Math.PI * Math.pow(radio, 2);
	}	
			
	
	public double calcularPerimetro() {
		return Math.PI * this.diametro;
	}

	/**
	 * @return the diametro
	 */
	public double getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Circulo [diametro=" + diametro + "]";
	}
	
	
}
