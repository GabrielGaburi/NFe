package Entities;

public class Fatura implements Interface {
	
	Imposto imposto = new Imposto();
	
	
	private int numero;
	private String dataVencimento;
	private double valor;
	
	public Fatura() {
		
	}

	public Fatura(int numero, String dataVencimento, double valor) {
		super();
		this.numero = numero;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public void entrar() {
		System.out.println("Digíte o número da nota:");
		numero = leia.nextInt();
		System.out.println("Digíte a data de vencimento: ");
		dataVencimento = leia.next();
		
		
	}
	
	@Override
	
	public void imprimir () {
		System.out.println("Número da nota: " + getNumero());
		System.out.println("Data de vencimento " + getDataVencimento());
		
	}
}
