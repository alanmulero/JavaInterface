package byteBankInterface.principal;

public abstract class CadastroConta {
	
	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	private double taxaManutencaoConta;
	private double juros;
	
	public CadastroConta(String nomeCliente, int numeroConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaManutencaoConta() {
		return taxaManutencaoConta;
	}

	public double getJuros() {
		return juros;
	}
	
	// Metodos
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public boolean transfere(CadastroConta conta, double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.printf("Tranferencia realizado: %.2f para %s ", valor, conta.getNomeCliente());
			conta.deposita(valor);
			return true;
		}else {
			System.out.println("Saldo indisponivel.");
			return false;
		}
	}
	
	// Ficha cadastral
	
	public void fichaCadastral() {
		System.out.println("Nome titular: "+ getNomeCliente());
		System.out.println("Numero da conta: "+ getNumeroConta());
		System.out.println("Saldo: "+ getSaldo());
		System.out.println("Taxa de manutenção: "+ getTaxaManutencaoConta());
	}

}
