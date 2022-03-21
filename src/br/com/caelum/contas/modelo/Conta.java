package br.com.caelum.contas.modelo;

public class Conta {
	private String titular, agencia;
	private int numero, identificador;
	private double saldo;
	private Data data_abertura;
	private static int contador_de_contas = 0; //variável que não muda independente do objeto.

	public Conta(String titular){
		this.titular = titular;
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}
	public Conta(){
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Data getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(Data data_abertura) {
		this.data_abertura = data_abertura;
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	public void deposita(double valor) {
		saldo += valor;
	}
	public double calcularRendimento() {
		return saldo * 0.1;
	}
	
	public void recuperaDadosParaImpressao() {
		System.out.println("Identificador " + identificador);
		System.out.println("Nome do titular: " + titular);
		System.out.println("Número da Conta: " + numero + " | Agência: " + agencia);
		System.out.println("Saldo na conta: " + saldo);
		System.out.println("Data de abertura: " + data_abertura.formatData());
	}
}
