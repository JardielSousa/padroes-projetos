package br.com.jardielsousa.criacionais.factory_method;

public class LogisticaRodoviaria extends Logistica {

	@Override
	public Transporte criarTransporte() {
		return new Caminhao();
	}
}
