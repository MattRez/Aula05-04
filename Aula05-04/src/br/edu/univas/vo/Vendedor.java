package br.edu.univas.vo;

public class Vendedor extends Funcionario {
	
	private float comissao;
	
	public Vendedor(float salarioBase, float comissao) {
		super(salarioBase);
	}
	
	//� a soma do sal�rio-base mais a porcentagem da sua comiss�o.
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