package br.com.knaak;

public class Word {

	private String word;
	//Construtor
	public Word(String word) {
		super();
		this.word = word;
	}
	//Método Get
	public String getWord() {
		return word;
	}
	//Método Set
	public void setWord(String word) {
		this.word = word;
	}
	//Método que retorna o tamanho da string
	public int wordSize() {
		return this.word.length() - 1;

	}
	//Método que retorna o índice do caracter
	public char letter(int i) {

		return this.word.charAt(i);

	}

}
