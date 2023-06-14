package Application;

import java.util.ArrayList;

import Entities.CalcImposto;
import Entities.DestinarioRemetente;
import Entities.Endereco;
import Entities.Fatura;
import Entities.Imposto;
import Entities.Interface;
import Entities.NotaFiscal;
import Entities.Produtos;
import Entities.Telefone;
import Entities.Transporte;

public class MenuPrincipal implements Interface {

	ArrayList<Fatura> listaFatura = new ArrayList<Fatura>();
	ArrayList<DestinarioRemetente> listaDestinario = new ArrayList<DestinarioRemetente>();
	ArrayList<NotaFiscal> listaNota = new ArrayList<NotaFiscal>();
	ArrayList<Produtos> listaProduto = new ArrayList<Produtos>();
	ArrayList<Transporte> listaTransporte = new ArrayList<Transporte>();
	ArrayList<CalcImposto> listaCalc = new ArrayList<CalcImposto>();
	ArrayList<Imposto> listaImposto = new ArrayList<Imposto>();

	Fatura fatura = new Fatura();
	DestinarioRemetente destinario = new DestinarioRemetente();
	NotaFiscal nota = new NotaFiscal();
	Produtos produto = new Produtos();
	Transporte transporte = new Transporte();
	CalcImposto calc = new CalcImposto();
	Imposto imposto = new Imposto();

	int num;
	String nome;
	double sono;
	int quant = 10;
	int opcao;
	char opcao2;

	public void fakerDestinario(int quant) {

		for (int i = 1; i <= quant; i++) {

			DestinarioRemetente destinario = new DestinarioRemetente();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();

			endereco.setLogradouro("Rua do Demônio " + i);
			endereco.setNumero("66-" + i);
			endereco.setComplemento("Casa" + i);
			endereco.setBairro("Cracolandia" + i);
			endereco.setCidade("Cidade da sua Amante" + i);
			endereco.setEstado("RS");
			endereco.setCep("17123-112" + i);

			telefone.setDdd(i);
			telefone.setNumero(891829812);

			destinario.setIdPessoa(i);
			destinario.setRazaoSocial("a" + i);
			destinario.setCnpjCpf("456.654.525-25" + i);
			destinario.setIncricaoEstadual(13232 + i);
			destinario.setEndereco(endereco);
			destinario.setTelefone(telefone);
			destinario.setDataEmissao("23/10/202" + i);
			destinario.setDataSaida("25/10/202" + i);
			destinario.setHoraSaida("10:3");

			listaDestinario.add(destinario);

		}
	}

	public void alterarDestinario(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			num = leia.nextInt();
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

		for (NotaFiscal nota : listaNota) {
			if (nota.getNumero() == num) {
				destinario.entrar();
				encontrado = true;

				System.out.println("Alteração concluida com sucesso");
			}
		}
		if (!encontrado) {
			System.out.println("Nf-e = " + num + " Não Encontrado !!!");
		}

	}

	public void fakerTransporte(int quant) {

		for (int i = 1; i <= quant; i++) {

			Transporte transporte = new Transporte();
			Endereco endereco = new Endereco();

			endereco.setLogradouro("Rua do Demônio " + i);
			endereco.setNumero("66-" + i);
			endereco.setComplemento("Casa" + i);
			endereco.setBairro("Cracolandia" + i);
			endereco.setCidade("Cidade da sua Amante" + i);
			endereco.setEstado("RS");
			endereco.setCep("17123-112" + i);

			transporte.setIdPessoa(i);
			transporte.setEndereco(endereco);

			transporte.setFrete("Cliente" + i);
			transporte.setCodigoAntt(564545 + i);
			transporte.setPlaca("GGG-8840" + i);
			transporte.setQuantidade(i);
			transporte.setEspecie("Caixão" + i);
			transporte.setMarca("D-60 com motor da ford" + i);
			transporte.setNumeracao(1212 + i);
			transporte.setPesoBruto(500 + i);
			transporte.setPesoLiquido(370 + i);

			listaTransporte.add(transporte);

		}

	}

	public void consultarNotaTransporte(int quant) {
		boolean encontrado = false;
		try {
			System.out.println("Digíte a posição na lista:");
			num = leia.nextInt();

			for (NotaFiscal nota : listaNota) {

				if (nota.getTransportadora().getIdPessoa() == this.num) {
					nota.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Nf-e = " + num + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void alterarTransporte(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			num = leia.nextInt();
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

		for (NotaFiscal nota : listaNota) {
			if (nota.getNumero() == num) {
				transporte.entrar();
				encontrado = true;

				System.out.println("Alteração concluida com sucesso");
			}
		}
		if (!encontrado) {
			System.out.println("NF-e = " + num + " Não Encontrado !!!");
		}

	}

	public void fakeFatura() {

		for (int i = 1; i <= quant; i++) {

			Fatura fatura = new Fatura();

			fatura.setNumero(i);
			fatura.setDataVencimento("25/03/202" + i);
			fatura.setValor(i);
			listaFatura.add(fatura);
		}

	}

	public void alterarFatura(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			num = leia.nextInt();
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

		for (NotaFiscal nota : listaNota) {
			if (nota.getNumero() == num) {
				fatura.entrar();
				encontrado = true;

				System.out.println("Alteração concluida com sucesso");
			}
		}
		if (!encontrado) {
			System.out.println("NF-e = " + num + " Não Encontrado !!!");
		}

	}

	public void fakeCalcImposto() {

		for (int i = 1; i <= quant; i++) {

			CalcImposto calc = new CalcImposto();

			calc.setBaseCalcIcms(15 + i);
			calc.setBaseCalcIpi(20 + i);
			calc.setValorIpi(20 / 100 + i);
			calc.setValorIcms(15 / 100 + i);

			listaCalc.add(calc);

		}

	}

	public void alterarCalcImposto(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			num = leia.nextInt();
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

		for (NotaFiscal nota : listaNota) {
			if (nota.getChave() == num) {
				calc.entrar();
				encontrado = true;

				System.out.println("Alteração concluida com sucesso");
			}
		}
		if (!encontrado) {
			System.out.println("NF-e = " + num + " Não Encontrado !!!");
		}

	}

	public void fakeProdutos() {

		for (int i = 1; i <= quant; i++) {

			Produtos produto = new Produtos();

			produto.setCst(2323 + i);
			produto.setNcw(656 + i);
			produto.setDescricao("Maconha qualidade " + i);
			produto.setCfop(735 + i);
			produto.setUnidade("??????" + i);
			produto.setQuantidade(i);
			produto.setValorUnitario(30 + i);
			produto.setValorTotal(30 + i * i);

			listaProduto.add(produto);

		}

	}

	public void fakeImposto() {

		for (int i = 1; i <= quant; i++) {

			Imposto imposto = new Imposto();
			CalcImposto calc = new CalcImposto();

			imposto.setValorFrete(300 + i);
			imposto.setSeguro(100 + i);
			imposto.setDesconto(180 + i);
			imposto.setDespesas(250 + i);
			imposto.setValorTotalNota(produto.getValorTotal() + i + 300 + i + 100 + i - 180 + i + 250
					+ i * (1 + (calc.getValorIcms()) * (1 + (calc.getValorIpi()))));
			imposto.setParcela(i);
			imposto.setValorParcela(imposto.getValorTotalNota() / imposto.getParcela());

			listaImposto.add(imposto);

		}

	}

	public void fakeNotaFiscal(int quant) {

		for (int i = 1; i <= quant; i++) {

			NotaFiscal nota = new NotaFiscal();
			Transporte transporte = new Transporte();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();
			DestinarioRemetente destinario = new DestinarioRemetente();
			CalcImposto calc = new CalcImposto();
			Produtos produto = new Produtos();
			Imposto imposto = new Imposto();
			Fatura fatura = new Fatura();

			nota.setChave(236536323 + i);
			nota.setNumero(i);

			endereco.setLogradouro("Rua do Demônio " + i);
			endereco.setNumero("66-" + i);
			endereco.setComplemento("Casa" + i);
			endereco.setBairro("Cracolandia" + i);
			endereco.setCidade("Cidade da sua Amante" + i);
			endereco.setEstado("RS");
			endereco.setCep("17123-112" + i);

			telefone.setDdd(10 + i);
			telefone.setNumero(991751640 + i);

			destinario.setIdPessoa(i);
			destinario.setRazaoSocial("a" + i);
			destinario.setCnpjCpf("456.654.525-25" + i);
			destinario.setIncricaoEstadual(13232 + i);
			destinario.setEndereco(endereco);
			destinario.setTelefone(telefone);
			destinario.setDataEmissao("23/10/202" + i);
			destinario.setDataSaida("25/10/202" + i);
			destinario.setHoraSaida("10:3");

			destinario.setTelefone(telefone);

			endereco.setLogradouro("Rua do Diabo " + i);
			endereco.setNumero("666-" + i);
			endereco.setComplemento("Casa" + i);
			endereco.setBairro("Cracolandia Junior" + i);
			endereco.setCidade("Cidade da sua Mãe" + i);
			endereco.setEstado("RJ");
			endereco.setCep("17123-113" + i);

			transporte.setIdPessoa(i);
			transporte.setEndereco(endereco);

			transporte.setCnpjCpf("52353121" + i);
			transporte.setRazaoSocial("Transportadora Celso alcoólatras anônimos");
			transporte.setFrete("Cliente" + i);
			transporte.setCodigoAntt(564545 + i);
			transporte.setPlaca("GGG-8840" + i);
			transporte.setQuantidade(i);
			transporte.setEspecie("Caixão" + i);
			transporte.setMarca("D-60 com motor da ford" + i);
			transporte.setNumeracao(1212 + i);
			transporte.setPesoBruto(500 + i);
			transporte.setPesoLiquido(370 + i);

			calc.setBaseCalcIcms(15 + i);
			calc.setBaseCalcIpi(20 + i);
			calc.setValorIpi(20 / 100 + i);
			calc.setValorIcms(80 / 100 + i);
			calc.setValorTotalImposto(1);

			produto.setCst(2323 + i);
			produto.setNcw(656 + i);
			produto.setDescricao("Maconha qualidade " + i);
			produto.setCfop(735 + i);
			produto.setUnidade("??????" + i);
			produto.setQuantidade(i);
			produto.setValorUnitario(30 + i);
			produto.setValorTotal(30 + i * produto.getQuantidade());
			imposto.setValorFrete(300 + i);
			imposto.setSeguro(100 + i);
			imposto.setDesconto(180 + i);
			imposto.setDespesas(250 + i);
			imposto.setValorTotalNota(produto.getValorTotal() + i + 300 + i + 100 + i - 180 + i + 250
					+ i * (1 + (calc.getValorIcms()) * (1 + (calc.getValorIpi()))));
			imposto.setParcela(i);
			imposto.setValorParcela(imposto.getValorTotalNota() / imposto.getParcela());

			fatura.setNumero(i);
			fatura.setDataVencimento("25/03/202" + i);
			fatura.setValor(produto.getValorTotal());

			nota.setDestinario(destinario);
			nota.setTransportadora(transporte);
			nota.setCalc(calc);
			nota.setProdutos(produto);
			nota.setImposto(imposto);
			nota.setFatura(fatura);

			listaNota.add(nota);

		}

	}

	public void consultarNotaNumeroNfe(int quant) {
		boolean encontrado = false;
		try {

			System.out.println("Digíte o número da nota:");
			num = leia.nextInt();

			for (NotaFiscal nota : listaNota) {

				if (nota.getNumero() == this.num) {
					nota.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Nf-e = " + num + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarNotaRazaoSocial(int quant) {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o nome social:");
			nome = leia.next();

			for (NotaFiscal nota : listaNota) {

				if (nota.getDestinario().getRazaoSocial().equals(nome)) {
					nota.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Nota Razão Social = " + num + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarNotaCpfCnpj(int quant) {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o CPF ou CNPJ:");
			nome = leia.next();

			for (NotaFiscal nota : listaNota) {

				if (nota.getDestinario().getCnpjCpf().equals(nome)) {
					nota.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Nota CPF / CNPJ = " + num + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarNotaValor(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o valor total da Nota");
			sono = leia.nextDouble();

			for (NotaFiscal nota : listaNota) {

				if (nota.getImposto().getValorTotalNota() == sono) {
					nota.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Nf-e Valor Total = " + num + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarNotas() {
		boolean encontrado = false;
		try {

			System.out.println("Digíte o número da primeira nota que você gostaria de verificar: ");
			int a = leia.nextInt();
			System.out.println("Digíte o número da última nota que você gostaria de verificar: ");
			int b = leia.nextInt();

			for (NotaFiscal nota : listaNota) {

				if (nota.getNumero() >= a && nota.getNumero() <= b) {

					nota.imprimir();
					encontrado = true;
				}

			}
			if (!encontrado) {
				System.out.println("Nf-e Valor Total = " + num + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void removerNota() {
		listaNota.removeAll(listaNota);
		System.out.println("Todos os itens da lista foram removidos");
	}

	public void Menu() {
		do {
			System.out.println("Digíte para escolher entre as opções: ");
			System.out.println("1 - Incluir Nf-e: ");
			System.out.println("2 - Alterar Nf-e pelo número: ");
			System.out.println("3 - Excluir Nf-e pelo número: ");
			System.out.println("4 - Consultar Nf-e: ");
			System.out.println("5 - Consultar Multiplas Nf-e:");
			System.out.println("6 - Sair");

			opcao = leia.nextInt();

			if (opcao == 1) {

				fakeNotaFiscal(this.quant);
				System.out.println("Você incluiu itens na lista:");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}

			else if (opcao == 2) {

				System.out.println("a - Alterar destinario/remetente: ");
				System.out.println("b - Alterar Fatura: ");
				System.out.println("c - Alterar Calculo Imposto: ");
				System.out.println("d - Alterar Transportadora: ");
				System.out.println("e - Voltar ao menu principal");

				opcao2 = leia.next().charAt(0);

				if (opcao2 == 'a') {
					alterarDestinario(this.quant);
					System.out.println("Você alterou itens na lista:");
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'b') {
					alterarFatura(this.quant);
					System.out.println("Você alterou itens na lista:");
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}

				else if (opcao2 == 'c') {
					alterarCalcImposto(this.quant);
					System.out.println("Você alterou itens na lista:");
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				} else if (opcao2 == 'd') {
					alterarTransporte(this.quant);
					System.out.println("Você alterou itens na lista:");
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'e') {
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}

			else if (opcao == 3) {
				removerNota();
				System.out.println("Você removeu itens na lista:");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}

			else if (opcao == 4) {

				System.out.println("a - Consulta pelo número da NF-e:");
				System.out.println("b - Consulta pela razão social do cliente:");
				System.out.println("c - Consulta pelo CNPJ/CPF do cliente");
				System.out.println("d - Consulta pelo valor total da NF-e");
				System.out.println("e - Voltar:");

				opcao2 = leia.next().charAt(0);

				if (opcao2 == 'a') {
					consultarNotaNumeroNfe(this.quant);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'b') {
					consultarNotaRazaoSocial(this.quant);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'c') {
					consultarNotaCpfCnpj(this.quant);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'd') {
					consultarNotaValor(this.quant);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}

				else if (opcao2 == 'e') {
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}

			} else if (opcao == 5) {

				consultarNotas();
			} else if (opcao == 6) {
				System.out.println("Fim");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				break;
			}

		} while (opcao >= 1 && opcao <= 5);
	}

	public static void main(String[] args) {

		MenuPrincipal menu = new MenuPrincipal();

		menu.Menu();

	}

	@Override
	public void entrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

}
