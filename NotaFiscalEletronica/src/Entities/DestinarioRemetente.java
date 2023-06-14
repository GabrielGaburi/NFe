package Entities;

import java.util.ArrayList;

public class DestinarioRemetente extends Pessoa implements Interface {

	private String dataEmissao;
	private String dataSaida;
	private String horaSaida;
	private Endereco endereco = new Endereco();
	private Telefone telefone = new Telefone();
	

	ArrayList<DestinarioRemetente> listaDestinario = new ArrayList<>();

	public DestinarioRemetente() {
		super();
	}

	public DestinarioRemetente(String dataEmissao, String dataSaida, String horaSaida, Endereco endereco,
			Telefone telefone) {
		super();

		this.dataEmissao = dataEmissao;
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public void entrar() {
		super.entrar();
		endereco.entrar();
		telefone.entrar();
		System.out.println("Digíte a data de emissão: ");
		dataEmissao = leia.next();
		System.out.println("Digíte a data de saída: ");
		dataSaida = leia.next();
		System.out.println("Digíte a hora da saída: ");
		horaSaida = leia.next();

	}

	@Override

	public void imprimir() {
		super.imprimir();
		endereco.imprimir();
		telefone.imprimir();
		System.out.println("Data de emissão: " + getDataEmissao());
		System.out.println("Data de saída: " + getDataSaida());
		System.out.println("Hora da saída:" + getHoraSaida());

	}
}
	