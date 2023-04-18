package pedraPapelTesoura;

import java.util.Scanner;

public class Escolha {
	static int pedra = 1, papel = 2, tesoura = 3, usuario, maquina, pontosUsuario, pontosMaquina, empates, totalDePartidas;
	static Scanner teclado = new Scanner(System.in);

	public static void usuarioSeleciona() {
		System.out.println("Escolha:\n1 - Pedra\n2 - Papel\n3 - Tesoura");
		usuario = teclado.nextInt();
	}

	public static void randInt() {
		java.util.Random rand = new java.util.Random();
		maquina = rand.nextInt(3) + 1;
		System.out.println("\nA máquina escolheu: " + maquina + "\n");
	}

	public static void compara() {
		// Caso de empate
		if (usuario == maquina) {
			System.out.println("Empate!\n");
			totalDePartidas++;
			empates++;
		}
		// Casos em que o usuário vence
		else if (usuario == 1 && maquina == 3) {
			System.out.println("Você venceu!\n");
			totalDePartidas++;
			pontosUsuario++;
		} else if (usuario == 2 && maquina == 1) {
			System.out.println("Você venceu!\n");
			totalDePartidas++;
			pontosUsuario++;
		} else if (usuario == 3 && maquina == 2) {
			System.out.println("Você venceu!\n");
			totalDePartidas++;
			pontosUsuario++;
		}
		// Casos em que a máquina vence
		else if (usuario == 2 && maquina == 3) {
			System.out.println("A máquina venceu!\n");
			totalDePartidas++;
			pontosMaquina++;
		} else if (usuario == 3 && maquina == 1) {
			System.out.println("A máquina venceu!\n");
			totalDePartidas++;
			pontosMaquina++;
		} else if (usuario == 1 && maquina == 2) {
			System.out.println("A máquina venceu!\n");
			totalDePartidas++;
			pontosMaquina++;
		}
	}
	
	public static void pegaPontos() {
		System.out.println("Total de partidas: " + totalDePartidas);
		System.out.println("Empates: " + empates);
		System.out.println("Seus pontos: " + pontosUsuario);
		System.out.println("Pontos da máquina: " + pontosMaquina + "\n");
	}
}
