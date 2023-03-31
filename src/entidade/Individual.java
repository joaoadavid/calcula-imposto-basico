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
		if(getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 -  gastoComSaude * 0.5;
		}else{
			return getRendaAnual() * 0.25 -  gastoComSaude * 0.5;
		}
	}

}
