package br.com.bianeck.threads;

public class UmAteMil {

	public static void main(String[] args) {
		
		new Thread(new TarefaImprimeNumeros(),"Thread Um").start();
		new Thread(new TarefaImprimeNumeros(),"Thread Dois").start();

	}

}
