package view;

import controller.MediaVetorController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {15, 8, 23, 4, 42, 5, 0};
		MediaVetorController medvet = new MediaVetorController();
		double resultado = medvet.mediaVetor(vetor);
		System.out.println("A média do vetor foi de: " + resultado);
	}

}
