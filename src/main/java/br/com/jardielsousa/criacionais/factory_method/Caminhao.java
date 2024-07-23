package br.com.jardielsousa.criacionais.factory_method;

public class Caminhao implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Entregando por terra");
	}
}
