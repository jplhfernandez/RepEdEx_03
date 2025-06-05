package controller;

public class MediaVetorController {

	public MediaVetorController() {
		// TODO Auto-generated constructor stub
	}

	public double mediaVetor(int[] vetor) {
		// TODO Auto-generated method stub
		double media = 0;
		double cont = 0;
		for(int i = 0; i < vetor.length; i ++ ) {
			media += vetor[i];
			cont++;
		}
		media /= cont;
		return media;
	}

}
