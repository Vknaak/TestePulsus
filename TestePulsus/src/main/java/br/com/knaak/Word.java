package br.com.knaak;

public class Word {

	private String word;
	//Construtor
	public Word(String word) {
		super();
		this.word = word;
	}
	//M�todo Get
	public String getWord() {
		return word;
	}
	//M�todo Set
	public void setWord(String word) {
		this.word = word;
	}
	//M�todo que retorna o tamanho da string
	public int wordSize() {
		return this.word.length() - 1;

	}
	//M�todo que retorna o �ndice do caracter
	public char letter(int i) {

		return this.word.charAt(i);

	}

}
