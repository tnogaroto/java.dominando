package terceiro1;

import terceiro1.novo.Gato;

public class terceiro {

	public static void main(String[] args) {
		/*int a = 2;
		int b = 3;
		
		System.out.println("soma é : " + (a+b));*/
		
		Gato gato = new Gato();
		livros livros = new livros();
		System.out.println(gato);
		System.out.println(livros);
	}

}

class livros {
	private String nome;
	private String npag;
}