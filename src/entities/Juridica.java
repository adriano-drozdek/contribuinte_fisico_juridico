package entities;

public class Juridica extends Contribuinte {

	private Integer quantidadePessoas;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, Integer quantidadePessoas) {
		super(nome, rendaAnual);
		this.quantidadePessoas = quantidadePessoas;
	}

	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	@Override
	public double imposto() {
		if (quantidadePessoas > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}
}
