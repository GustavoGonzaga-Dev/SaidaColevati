package view;

import controller.ThreadSaida;

public class Principal {
	public static void main(String[] args) {

		for (int idThread = 0; idThread <5; idThread++) {
		
			Thread threadId = new ThreadSaida();
			threadId.start();
		}
	}
}
