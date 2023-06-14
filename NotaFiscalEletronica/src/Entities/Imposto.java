package Entities;

public class Imposto implements Interface {
	
	Produtos produto = new Produtos();
	Transporte transporte = new Transporte();
	CalcImposto calc = new CalcImposto();
	
	private float valorFrete;
	private float seguro;
	private float desconto;
	private float despesas;
	private float valorTotalNota;
	private float parcela;
	private float valorParcela;
	
	public Imposto() {
		super();
	}

	public Imposto(Produtos produto, Transporte transporte, float valorFrete, float seguro, float desconto,
			float despesas, float valorTotalNota) {
		super();
		this.produto = produto;
		this.transporte = transporte;
		this.valorFrete = valorFrete;
		this.seguro = seguro;
		this.desconto = desconto;
		this.despesas = despesas;
		this.valorTotalNota = valorTotalNota;
	}

	public float getParcela() {
		return parcela;
	}

	public void setParcela(float parcela) {
		this.parcela = parcela;
	}

	public float getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(float valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public float getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(float valorFrete) {
		this.valorFrete = valorFrete;
	}

	public float getSeguro() {
		return seguro;
	}

	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public float getDespesas() {
		return despesas;
	}

	public void setDespesas(float despesas) {
		this.despesas = despesas;
	}

	public float getValorTotalNota() {
		return valorTotalNota;
	}

	public void setValorTotalNota(float valorTotalNota) {
		this.valorTotalNota = valorTotalNota;
	}
	
	public void entrar () {
		System.out.println("Digíte o valor do frete: ");
		valorFrete = leia.nextFloat();
		System.out.println("Digíte o valor do seguro: ");
		seguro = leia.nextFloat();
		System.out.println("Digíte o desconto: ");
		System.out.println("Digíte a quantidade de parcela: ");
		parcela = leia.nextFloat();
		
		desconto = leia.nextFloat();
		System.out.println("Digíte o valor de outras despesas: ");
		despesas = leia.nextFloat();
		valorTotalNota = produto.getValorTotal() + getValorFrete() + getSeguro() - getDesconto() + getDespesas() * (1+ (calc.getValorIcms()) * (1 +(calc.getValorIpi())));
		valorParcela = valorTotalNota / parcela;
	}
	
	
	
	public void imprimir() {
		System.out.println("Frete: " + String.format("%.2f", getValorFrete()));
		System.out.println("Seguro: " + String.format("%.2f", getSeguro()));
		System.out.println("Descontos: " + String.format("%.2f", getDesconto()));
		System.out.println("Despesas: " + String.format("%.2f", getDespesas()));
		System.out.println("N° Parcelas: " + String.format("%.0f", getParcela()));
		System.out.println("Valor Parcelar: " + String.format("%.2f", getValorParcela()));
		
	}
	

}
