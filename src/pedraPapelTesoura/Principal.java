package pedraPapelTesoura;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("PEDRA, PAPEL OU TESOURA\n");
		
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("1 - Iniciar o jogo\n2 - Pontuação\n3 - Sair\n");
			
			opcao = teclado.nextInt();
			if(opcao == 1) {
			Escolha.usuarioSeleciona();
			Escolha.randInt();
			Escolha.compara();
			}else if(opcao == 2) {
			Escolha.pegaPontos();
			}else if (opcao != 3) {
				System.out.println("Você selecionou uma opção inválida. Tente novamente!\n");
			}
		} while (opcao !=3);
		
	}
}
