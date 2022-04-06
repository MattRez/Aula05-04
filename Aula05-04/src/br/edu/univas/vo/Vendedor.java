package br.edu.univas.vo;

public class Vendedor extends Funcionario {
	
	private float comissao;
	
	public Vendedor(float salarioBase, float comissao) {
		super(salarioBase);
	}
	
	//é a soma do salário-base mais a porcentagem da sua comissão.
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}