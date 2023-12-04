package classes;

public class Paciente {

	//atributos
	public String nome;
	public float altura;
	public String genero;
	
	//construtor
	public Paciente (String nome, float altura, String genero) {
	super();
	this.nome = nome;
	this.altura= altura;
	this.genero = genero;
}
	
	//metodo
	public float calcularPesoIdeal() {
		if (this.genero.equals("Feminino")) {
			return (float) ((62.1 * this.altura) - 44.7);
		} else {
			return (float) ((72.7 * this.altura) - 58);
		}
		
	}
	
}

//homens