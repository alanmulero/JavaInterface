package byteBankInterface.principal;

import byteBankInterface.principal.Contas.ContaCorrente;
import byteBankInterface.principal.Contas.ContaPoupanca;

public class Executa {

	public static void main(String[] args) {
		// Instaciando objetos
		
		ContaCorrente cc = new ContaCorrente("Alan", 222, 100.0);
		
		
		// Conta Poupança
		ContaPoupanca cp = new ContaPoupanca("Pituca", 501, 20);
		cc.deposita(5);
		cc.transfere(cp, 20);
		cc.fichaCadastral();
		cp.fichaCadastral();
		

	}

}
