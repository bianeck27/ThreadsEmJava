package br.com.bianeck.threads;

public class ImprimeString {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Imprimindo resposta");
				
			}
		},"Thread de impressao").start();
	}

}
