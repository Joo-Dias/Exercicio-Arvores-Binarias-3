package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {

		Arvore tree = new Arvore();

		String[] vetor = { "M", "F", "S", "D", "J", "P", "U", "A", "E", "H", "Q", "T", "W", "K" };

		// Inserindo os as letras do vetor na árvore
		for (String letras : vetor) {
			tree.insert(letras);
		}

		// Removendo a letra F e U
		try {
			tree.remove("F");
			tree.remove("U");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fazendo o atravessamento da árvore por pre, in e pos
		try {
			System.out.println("Atravessamento PRE =============");
			tree.prefixSearch();
			System.out.println("");
			System.out.println("Atravessamento IN =============");
			tree.infixSearch();
			System.out.println("");
			System.out.println("Atravessamento POS =============");
			tree.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
