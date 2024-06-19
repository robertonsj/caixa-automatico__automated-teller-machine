package caixa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Conta {
	private String numeroDaConta;
	private String pin;
	private double saldo = 0;
	
//	Scanner input = new Scanner(System.in);
//	DecimalFormat moneyFormat = new DecimalFormat("'R$'###.##0,00");
		
	public Conta(String numeroDaConta, String pin, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.pin = pin;
		this.saldo = saldo;
	}
	
	
}
