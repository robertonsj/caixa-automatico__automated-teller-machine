package caixa;

import javax.swing.JOptionPane;

public class CaixaAutomatica {
	private Conta conta;
	
	public CaixaAutomatica(Conta conta) {
		this.conta = conta;
	}
	
	public void iniciar() {
		
		String inputPin = JOptionPane.showInputDialog("Digite o seu PIN: ");
		
		if(conta.validarPin(inputPin)) {
			
			String[] options = {
					"Visualizar Saldo", "Depositar", "Sacar", "Sair"
			};
			
			while(true) {
				int choice = JOptionPane.showOptionDialog(
						null, "Selecione uma Opção: ", "Caixa Automática",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null, options, options[0]
				);
				
				switch(choice) {
				case 0: //Visualizar saldo
					JOptionPane.showMessageDialog(null, "Saldo atual: R$" + conta.getSaldo());
					break;
					
				case 1: //Depositar
					
					//Input/quantia digitada pelo usuário. 
					String depositAmountStr = JOptionPane.showInputDialog(
							"Quantia para Deposito:"
					);
					double depositAmount = Double.parseDouble(depositAmountStr);
					conta.depositar(depositAmount);
					break;
					
				case 2: //Sacar
					
					//Input/quantia digitada pelo usuário para saque.
					String withdrawAmountStr = JOptionPane.showInputDialog(
							"Quantia para Saque:"
					);
					double withdrawAmount = Double.parseDouble(withdrawAmountStr);
					conta.sacar(withdrawAmount);
					break;
					
				case 3: // Sair
					JOptionPane.showMessageDialog(
							null, "Obrigado por Usar o Caixa Automático. Até Mais!"
					);
					break;
					
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida!");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "PIN Inválido! Acesso negado.");
		}
		
	}
	
	
}
