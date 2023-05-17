package byteBankInterface.principal.Contas;

import byteBankInterface.principal.CadastroConta;

public class ContaPoupanca extends CadastroConta {
	
	private double encargos = super.getJuros() * 0.05;

	public ContaPoupanca(String nome, int numeroConta, double saldo) {
		super(nome, numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

}
