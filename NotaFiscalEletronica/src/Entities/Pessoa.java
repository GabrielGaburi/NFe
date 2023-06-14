package Entities;

public abstract class Pessoa implements Interface {
	private int idPessoa;
	private String razaoSocial;
	private String cnpjCpf;
	private long inscricaoEstadual;

	public Pessoa() {

	}

	public Pessoa(int idPessoa, String razaoSocial, String cnpjCpf, long incricaoEstadual) {
		super();
		this.idPessoa = idPessoa;
		this.razaoSocial = razaoSocial;
		this.cnpjCpf = cnpjCpf;
		this.inscricaoEstadual = incricaoEstadual;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public long getIncricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setIncricaoEstadual(long inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override

	public void entrar() {
		System.out.println("Digíte o ID: ");
		idPessoa = leia.nextInt();
		System.out.println("Digíte a razão social: ");
		razaoSocial = leia.next();
		System.out.println("Digíte o CNPJ / CPF: ");
		cnpjCpf = leia.next();
		System.out.println("Digíte o número da incrição estadual: ");
		inscricaoEstadual = leia.nextLong();

	}
	@Override
	public void imprimir() {
		System.out.println("ID: " + getIdPessoa());
		System.out.println("Razão Social: " + getRazaoSocial());
		System.out.println("CNPJ / CPF: " + getCnpjCpf());
		System.out.println("Incrição Estadual: " + getIncricaoEstadual());
	}

}
