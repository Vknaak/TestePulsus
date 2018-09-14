package br.com.knaak;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaElementos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// delaração de varial tipo inteiro
		Integer number = 0;

		// criação de objeto do tipo arrayList de inteiros
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		// apresentando mensagem no console para o usuário
		System.out.println("Type a number and press enter or type '00' to finish this program.");

		// populando o array com inteiros informados pelo usuário
		do {
			// criando objeto Scanner para ler dados inseridos
			Scanner scanner = new Scanner(System.in);

			// atribuindo valor informado a variavel number
			number = scanner.nextInt();

			// condição que verifica o numero informado, caso seja diferente de 00 adiciona o
			// numero ao array
			if (number != 00) {
				numberList.add(number);

			}

		} while (number != 00);
		
		// apresenta no console o array de inteiros inseridos pelo usuário
		System.out.println("List of integer: " + numberList);
		// apresentando resultado no console
		System.out.println("Result of subset is: " + subset(numberList));
		

	}

	// Método que recebe o conjunto de inteiros e retorna o subconjunto
	private static ArrayList<String> subset(ArrayList<Integer> numberList) {
		
		// criação de objeto arrayList
		ArrayList<String> subSetReturn = new ArrayList<String>();
		
		// declaração de variávies
		int valueTotal = 0, valueAtual = -1, index = 0, indexInitial = 0, indexFinal = 0;
		
		// percorre o array de inteiros
		for (int i = 0; i < numberList.size(); i++) {
			
			// atualiza valor atual
			valueAtual = valueAtual + numberList.get(i);

			// Condição que verifica o resultado da soma e atualiza o índice do subconjunto
			if (numberList.get(i) > valueAtual) {
				valueAtual = numberList.get(i);
				index = i;
			}

			// Condição que atualiza a soma total e os índices do array
			if (valueAtual > valueTotal) {
				valueTotal = valueAtual;
				indexInitial = index;
				indexFinal = i;
			}
			// adiciona na lista
			subSetReturn.add(numberList.get(i).toString());
		}

		// Atualiza a posição inicial e final do array
		subSetReturn.set(indexInitial, "**" + numberList.get(indexInitial).toString());
		subSetReturn.set(indexFinal, numberList.get(indexFinal).toString() + "**");
		
		// retorna nova lista
		return subSetReturn;
	}

}
