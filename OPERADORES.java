import javax.swing.JOptionPane;

public class OPERADORES{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Ns1, Ns2;
		
		Double Ni1, Ni2;
		
		
		Ns1 = JOptionPane.showInputDialog("Insira um número.");
		
		Ns2 = JOptionPane.showInputDialog("Insira um outro número.");
				
		Ni1 = Double.parseDouble(Ns1);
		
		Ni2 = Double.parseDouble(Ns2);
		
		
		JOptionPane.showMessageDialog(null, "A soma dos números é igual a: "+ (Ni1+Ni2));
		
		JOptionPane.showMessageDialog(null, "A subtração dos números é igual a: "+ (Ni1-Ni2));
	
		JOptionPane.showMessageDialog(null, "O produto dos números é igual a: "+ Ni1*Ni2);
		
		JOptionPane.showMessageDialog(null, "A divisão dos números é igual a: "+ Ni1/Ni2);

		System.exit(0);
		
	}

}
