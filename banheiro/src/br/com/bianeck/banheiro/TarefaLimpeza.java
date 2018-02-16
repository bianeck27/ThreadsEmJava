package br.com.bianeck.banheiro;

public class TarefaLimpeza implements Runnable {

	private Banheiro banheiro;

	
	public TarefaLimpeza(Banheiro banheiro) {
		this.banheiro = banheiro;
	}


	@Override
	public void run() {
		while(true) {
			banheiro.limpa();
			
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
