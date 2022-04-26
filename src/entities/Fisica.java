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

		return 0;
	}

}
