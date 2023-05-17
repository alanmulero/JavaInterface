package byteBankInterface.principal.Contas;

import byteBankInterface.principal.CadastroConta;

public class ContaCorrente extends CadastroConta {
	
	private double encargos = super.getJuros() * 0.13;

	public ContaCorrente(String nome, int numeroConta, double saldo) {
		super(nome, numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

}
