package br.edu.univas.vo;

public class CLT extends Funcionario {
	
	public CLT(float salarioBase){
		super(salarioBase);
	}
	
	//o sal�rio � fixo
	@Override
	public float calculaSalario() {
		
		return 0;
	}
}