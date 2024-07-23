package br.com.jardielsousa.criacionais.factory_method;

public abstract class Logistica {

	public void planoDeTransporte() {
		final Transporte transporte = criarTransporte();
		transporte.entregar();
	}

	abstract Transporte criarTransporte();
}
