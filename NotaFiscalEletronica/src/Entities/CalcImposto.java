package Entities;

public class CalcImposto implements Interface {

	private float baseCalcIcms;
	private float valorIcms;
	private float baseCalcIpi;
	private float valorIpi;
	private float valorTotalImposto;

	public CalcImposto() {

	}

	public CalcImposto(float baseCalcIcms, float valorIcms, float valorIpi, float valorTotalImposto,
			float baseCalcIpi) {
		super();
		this.baseCalcIcms = baseCalcIcms;
		this.baseCalcIpi = baseCalcIpi;
		this.valorIcms = valorIcms;
		this.valorIpi = valorIpi;
		this.valorTotalImposto = valorTotalImposto;
	}

	public float getBaseCalcIpi() {
		return baseCalcIpi;
	}

	public void setBaseCalcIpi(float baseCalcIpi) {
		this.baseCalcIpi = baseCalcIpi;
	}

	public float getBaseCalcIcms() {
		return baseCalcIcms;
	}

	public void setBaseCalcIcms(float baseCalcIcms) {
		this.baseCalcIcms = baseCalcIcms;
	}

	public float getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(float valorIcms) {
		this.valorIcms = valorIcms;
	}

	public float getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(float valorIpi) {
		this.valorIpi = valorIpi;
	}

	public float getValorTotalImposto() {
		return valorTotalImposto;
	}

	public void setValorTotalImposto(float valorTotalImposto) {
		this.valorTotalImposto = valorTotalImposto;
	}

	@Override
	public void entrar() {
		System.out.println("Digíte a porcentagem ICMS: ");
		baseCalcIcms = leia.nextFloat();
		System.out.println("Digíte a porcentagem IPI: ");
		baseCalcIpi = leia.nextFloat();
		this.valorIcms = baseCalcIcms / 100;
		this.valorIpi = baseCalcIpi / 100;
		valorTotalImposto = valorIcms + valorIpi;

	}

	@Override
	public void imprimir() {
		System.out.println("Base do Calculo do ICMS: " + getBaseCalcIcms() + "%");
		System.out.println("Base do Calculo do IPI: " + getBaseCalcIpi() + "%");
		System.out.println("Valor ICMS:" + String.format("%.2f", getValorIcms()));
		System.out.println("Valor IPI: " + String.format("%.2f", getValorIpi()));
		System.out.println("Valor Total Imposto: " + String.format("%.2f", getValorTotalImposto()));
	}

}
