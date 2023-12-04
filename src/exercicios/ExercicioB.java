package exercicios;

import javax.swing.JOptionPane;

public class ExercicioB {

	public static void main(String[] args) {
		//declarar variaveis
		int num1;
		
		//entradas
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro")); 
		
		//processamento
		if (num1 < 0 ) {
			num1 = num1 * (-1);
		}
		
		//saida
		JOptionPane.showMessageDialog(null, "Número = " + num1);
	}

}
