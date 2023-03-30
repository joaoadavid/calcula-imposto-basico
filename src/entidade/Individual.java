package entidade;

public class Individual extends TaxaPorPessoa {

	private Double gastoComSaude;
	
	public Individual() {
		super();
	}
	
	public Individual(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public double taxa() {
		
		return gastoComSaude * 0.5;
	}

}
