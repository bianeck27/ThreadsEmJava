package br.com.bianeck.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Peguei a conexão");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("comecando a tx");
				tx.begin();
			}
		}
	}

}
