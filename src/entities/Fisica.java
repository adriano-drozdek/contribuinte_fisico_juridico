package entities;

public class Fisica extends Contribuinte {

	private Double despesaSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public double imposto() {

		double taxaImposto;
		if (getRendaAnual() < 20000.0) {
			taxaImposto = getRendaAnual() * 0.15;
		} 
		else {
			taxaImposto = getRendaAnual() * 0.25;
		}
		taxaImposto -= getDespesaSaude() * 0.5;
		if (taxaImposto < 0.0) {
			taxaImposto = 0.0;
		}
		return taxaImposto;
	}

}
