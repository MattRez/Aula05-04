package br.edu.univas.vo;

public class Estagiario extends Funcionario {
	
	private float valorHora;

	public Estagiario(float salarioBase, float valorHora){
		super(salarioBase);
	}
	
	//o salário é a multiplicação do valorHora pelas horasTrabalhadas
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
}