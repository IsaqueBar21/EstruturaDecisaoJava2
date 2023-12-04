package testes;

import javax.swing.JOptionPane;

import classes.Paciente;

public class TestaPaciente {

	public static void main(String[] args) {
		//declaração variaveis
		String nome, genero;
		float altura;
				
		//entradas
		nome = JOptionPane.showInputDialog("Qual o nome do Paciente? ");
		genero = JOptionPane.showInputDialog("Qual o gênero do Paciente? ");
		altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a altura do Paciente? "));
	
		//objeto da classe
		Paciente paciente = new Paciente(nome, altura, genero);
		
		//processamento
		paciente.calcularPesoIdeal();
		
		//saida
		JOptionPane.showMessageDialog(null, paciente.calcularPesoIdeal());
		
	}

}
