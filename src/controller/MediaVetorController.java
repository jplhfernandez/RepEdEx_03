package controller;

public class MediaVetorController {

	public MediaVetorController() {
		// TODO Auto-generated constructor stub
	}

	public int mediaVetor(int[] vetor) {
		// TODO Auto-generated method stub
		int media = 0;
		int cont = 0;
		for(int i = 0; i < vetor.length; i ++ ) {
			media += vetor[i];
			cont++;
		}
		media /= cont;
		return media;
	}

}
