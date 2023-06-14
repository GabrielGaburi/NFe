package Entities;

public class Produtos implements Interface{
	
	Transporte transporte = new Transporte();
	
	private int cst;
	private int ncw;
	private String descricao;
	private int cfop;
	private String unidade;
	private int quantidade;
	private float valorUnitario;
	private float valorTotal;
	private int codigoBarra;
	
	
	public Produtos() {
		
	}

	public Produtos(int cst, int ncw, String descricao, int cfop, String unidade, int quantidade,
			float valorUnitario, float valorTotal, int codigoBarra) {
		super();
		this.cst = cst;
		this.ncw = ncw;
		this.descricao = descricao;
		this.cfop = cfop;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.codigoBarra = codigoBarra;
	}

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}

	public int getNcw() {
		return ncw;
	}

	public void setNcw(int ncw) {
		this.ncw = ncw;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCfop() {
		return cfop;
	}

	public void setCfop(int cfop) {
		this.cfop = cfop;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(int codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	
	@Override
	
	public void entrar () {
		System.out.println("Digíte a CST: ");
		cst = leia.nextInt();
		System.out.println("Digíte a NCW: ");
		ncw = leia.nextInt();
		System.out.println("Digíte a descrição do produto: ");
		descricao = leia.next();
		System.out.println("Digíte a CFOP: ");
		cfop = leia.nextInt();
		quantidade = transporte.getQuantidade();
		System.out.println("Digíte a unidade: ");
		unidade = leia.next();
		System.out.println("Digíte o valor Unitario: ");
		valorUnitario = leia.nextFloat();
		valorTotal = valorUnitario * quantidade;
		
	}

	@Override
	public void imprimir() {
		
		System.out.println("CST: " + getCst());
		System.out.println("NCW " + getNcw());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("CFOP: " + getCfop());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Unidade: " + getUnidade());
		System.out.println("Valor unitario: " + String.format("%.2f", getValorUnitario()));
		System.out.println("Valor Total: " + String.format("%.2f", getValorTotal()));
		
	}
	
	
	
}
