package br.com.jardielsousa.criacionais.factory_method;

public class Demo {
	public static void main(String[] args) {
		Logistica logistica = new LogisticaRodoviaria();
		logistica.planoDeTransporte();

		logistica = new LogisticaMaritima();
		logistica.planoDeTransporte();
	}
}
