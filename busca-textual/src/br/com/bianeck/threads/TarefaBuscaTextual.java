package br.com.bianeck.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nome;

	public TarefaBuscaTextual(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numeroLinha = 1;
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				//usa uma express�o regular para encontrar os nomes na lista
				if(linha.matches(nome)) {
					System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
				}
				numeroLinha++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
