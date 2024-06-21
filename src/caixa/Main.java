package caixa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta("123789", "123", 2500.5);
		CaixaAutomatica caixaAutomatico = new CaixaAutomatica(conta);
		caixaAutomatico.iniciar();
	}

}
