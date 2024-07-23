package br.com.jardielsousa.criacionais.factory_method;

public class Navio implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Entregando por mar");
	}
}
