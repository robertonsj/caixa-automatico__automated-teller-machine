package caixa;

import javax.swing.JOptionPane;

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
	
	public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public boolean validarPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso! Novo saldo: R$" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Quantia para depósito inválida!");
        }
    }
    
    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Novo saldo: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Quantia de saque inválido ou saque insuficiente!");
        }
    }

	@Override
	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", pin=" + pin + ", saldo=" + saldo + "]";
	}
	
	
}
