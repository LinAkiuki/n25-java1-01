package br.com.senaisp.bauru.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vlr01 = 10;
		int vlr02 = vlr01;
		System.out.println("Vlr01: " + vlr01);
		System.out.println("Vlr02: " + vlr02);
		//Strings
		String str01 = "Abelha";
		String str02 = "Abelha";
		System.out.println("Str01: " + str01);
		System.out.println("Str02: " + str02);
		//Nessa comparação, é feita de endereço de memória, não o conteúdo
		System.out.println(str01==str02);
		//Para comparar conteúdo usamos equals ou compare
		System.out.println(str01.equals(str02));
	}

}
