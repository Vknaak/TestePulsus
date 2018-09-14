package br.com.knaak;

import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {

		String word;

		System.out.println("===========================================================");
		System.out.println("==== Verify the highest sequence of repeated characters ===");
		System.out.println("===========================================================");

		// apresentando no console mensagem para o usu�rio
		System.out.println("Enter a word =>");
		@SuppressWarnings("resource")

		// criando objeto Scanner
		Scanner scanner = new Scanner(System.in);

		// variavel word recebendo string informada pelo usu�rio
		word = scanner.nextLine();

		// criando novo objeto word
		Word w = new Word(word);

		System.out.println("============= Result ===============");
		// apresenta no console a palavra inserida pelo usu�rio
		System.out.println("==> Word imputed: [" + word + "]");
		// apresentando no console a maior sequencia de caracteres repetidos informada
		// pelo usu�rio
		System.out.println("==> Highest Sequence of repeated letters imputed was: {" + caracterSequencial(w) + "}");

	}

	// M�todo respons�vel por retornar a maior sequencia de caracteres da string
	private static String caracterSequencial(Word w) {

		String add, sequency;
		sequency = "";

		// percorre a string at� chegar no ultimo caracter
		for (int i = 0; i < w.wordSize(); i++) {

			// variavel add recebe o caracter
			add = Character.toString(w.letter(i));

			// condi��o que compara se o caracter do caracter � igual e implementa
			while (w.letter(i) == w.letter(i + 1)) {

				add = add + w.letter(i + 1);
				i++;

			}
			// condi��o responsavel por checar a maior sequencia
			if (add.length() > sequency.length()) {
				sequency = add;
			}
		}

		return sequency;
	}

}
