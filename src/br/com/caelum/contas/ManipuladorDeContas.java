package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setAgencia("4002");
		this.conta.setNumero(6969);
		this.conta.setTitular("Robin");

	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	}
}
