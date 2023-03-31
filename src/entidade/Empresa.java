package entidade;

public class Empresa extends TaxaPorPessoa {

	public int numeroDeFuncionarios;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double taxa() {
	if(numeroDeFuncionarios >10) {
		return getRendaAnual() * 0.14;
	}else {
		return getRendaAnual() * 0.16;
	}
	
	}
	
	

}
