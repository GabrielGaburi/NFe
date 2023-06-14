package Entities;

public class NotaFiscal implements Interface {

	DestinarioRemetente destinario = new DestinarioRemetente();
	Transporte transportadora = new Transporte();
	CalcImposto calc = new CalcImposto();
	Produtos produtos = new Produtos();
	Imposto imposto = new Imposto();
	Fatura fatura = new Fatura();

	private int chave;
	private int numero;

	public NotaFiscal() {

	}

	public NotaFiscal(DestinarioRemetente destinario, Transporte transportadora, CalcImposto calc, Produtos produtos,
			Imposto imposto, Fatura fatura, int chave, int numero) {
		super();
		this.destinario = destinario;
		this.transportadora = transportadora;
		this.calc = calc;
		this.produtos = produtos;
		this.imposto = imposto;
		this.fatura = fatura;
		this.chave = chave;
		this.numero = numero;
	}

	public DestinarioRemetente getDestinario() {
		return destinario;
	}

	public void setDestinario(DestinarioRemetente destinario) {
		this.destinario = destinario;
	}

	public Transporte getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transporte transportadora) {
		this.transportadora = transportadora;
	}

	public CalcImposto getCalc() {
		return calc;
	}

	public void setCalc(CalcImposto calc) {
		this.calc = calc;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void entrar() {
		System.out.println(
				"Informações da Nota:................................................................................................................................................................................................. ");
		System.out.println("Digíte a chave de acesso: ");
		chave = leia.nextInt();
		System.out.println("Dugíte o número da nota: ");
		numero = leia.nextInt();
		System.out.println(
				"Informações do Remetente/Destinario:..................................................................................................................................................................................");
		destinario.entrar();
		System.out.println(
				"Informações da Transportadora:..................................................................................................................................................................................");
		transportadora.entrar();
		System.out.println(
				"Informações do Calculo dos Impostos:..................................................................................................................................................................................");
		calc.entrar();
		System.out.println(
				"Informações dos Produtos:..................................................................................................................................................................................");
		produtos.entrar();
		System.out.println(
				"Informações dos Impostos e outros Gastos:..................................................................................................................................................................................");
		imposto.entrar();
		System.out.println(
				"Informações da Fatura:..................................................................................................................................................................................");
		fatura.entrar();

	}

	public void imprimir() {
		System.out.println(
				"Informações da Nota:................................................................................................................................................................................................. ");
		System.out.println("Chave de acesso: " + chave);
		System.out.println("Numero da nota: " + numero);
		System.out.println(
				"Informações do Remetente/Destinario:..................................................................................................................................................................................");
		destinario.imprimir();
		System.out.println(
				"Informações da Transportadora:..................................................................................................................................................................................");
		transportadora.imprimir();
		System.out.println(
				"Informações do Calculo dos Impostos:..................................................................................................................................................................................");
		calc.imprimir();
		System.out.println(
				"Informações dos Produtos:..................................................................................................................................................................................");
		produtos.imprimir();
		System.out.println(
				"Informações dos Impostos e outros Gastos:..................................................................................................................................................................................");
		imposto.imprimir();
		System.out.println(
				"Informações da Fatura:..................................................................................................................................................................................");
		fatura.imprimir();
		System.out.println("Valor Total: " + String.format("%.2f", imposto.getValorTotalNota()));

	}
}
