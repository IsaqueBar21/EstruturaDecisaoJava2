package exercicios;

import javax.swing.JOptionPane;

public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaração variaveis
		String nome;
		float nota1, nota2, media;
		
		//entradas
		nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual a primeira nota do aluno? "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual a primeira nota do aluno? "));
		
		//processamento
		media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi aprovado com média " + media);
		}
				
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado com média " + media);
		
	}

}
