package br.com.jardielsousa.criacionais.factory_method;

public class LogisticaMaritima extends Logistica {

	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}
}
