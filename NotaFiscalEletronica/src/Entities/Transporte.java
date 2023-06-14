package Entities;

import java.util.ArrayList;

public class Transporte extends Pessoa implements Interface {

	private Endereco endereco = new Endereco();
	
	
	private String frete;
	private int num1;
	private int codigoAntt;
	private String placa;
	private int quantidade;
	private String especie;
	private String marca;
	private int numeracao;
	private int pesoBruto;
	private int pesoLiquido;
	ArrayList<Transporte> listaTransporte = new ArrayList<>();

	public Transporte() {

	}

	public Transporte(Endereco endereco, String frete, int codigoAntt, String placa, int quantidade, String especie,
			String marca, int numeracao, int pesoBruto, int pesoLiquido) {
		super();

		this.endereco = endereco;

		this.frete = frete;
		this.codigoAntt = codigoAntt;
		this.placa = placa;
		this.quantidade = quantidade;
		this.especie = especie;
		this.marca = marca;
		this.numeracao = numeracao;
		this.pesoBruto = pesoBruto;
		this.pesoLiquido = pesoLiquido;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public int getCodigoAntt() {
		return codigoAntt;
	}

	public void setCodigoAntt(int codigoAntt) {
		this.codigoAntt = codigoAntt;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	public int getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(int pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public int getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(int pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	@Override

	public void entrar() {
		super.entrar();
		endereco.entrar();

		while (num1 != 1 && num1 != 0) {
			System.out.println("Digite [0] se o frete será pago pelo vendedor ou [1] se será paga pelo cliente");
			if (num1 == 0) {
				frete = "Vendedor";

			} else if (num1 == 1) {
				frete = "Cliente";
			}
		}
		System.out.println("Digíte o código ANTT:");
		codigoAntt = leia.nextInt();
		System.out.println("Digíte a placa do veículo:");
		placa = leia.next();
		System.out.println("Digíte a quantidade: ");
		quantidade = leia.nextInt();
		System.out.println("Digíte a espécie: ");
		especie = leia.next();
		System.out.println("Digíte a marca do veículo:");
		marca = leia.next();
		System.out.println("Digíte a numeração do veículo");
		numeracao = leia.nextInt();
		System.out.println("Digíte o peso bruto do veículo:");
		pesoBruto = leia.nextInt();
		System.out.println("Digíte o peso liquido do veículo:");
		pesoLiquido = leia.nextInt();

	}

	@Override

	public void imprimir() {
		super.imprimir();
		endereco.imprimir();

		System.out.println("Frete:" + getFrete());
		System.out.println("Código ANTT: " + getCodigoAntt());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Quantidade:" + getQuantidade());
		System.out.println("Espécie: " + getEspecie());
		System.out.println("Marca: " + getMarca());
		System.out.println("Numeração: " + getNumeracao());
		System.out.println("Peso bruto: " + getPesoBruto());
		System.out.println("Peso liquido: " + getPesoLiquido());

	}

}
