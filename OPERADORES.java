import javax.swing.JOptionPane;

public class OPERADORES{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Ns1, Ns2;
		
		Double Ni1, Ni2;
		
		
		Ns1 = JOptionPane.showInputDialog("Insira um n�mero.");
		
		Ns2 = JOptionPane.showInputDialog("Insira um outro n�mero.");
				
		Ni1 = Double.parseDouble(Ns1);
		
		Ni2 = Double.parseDouble(Ns2);
		
		
		JOptionPane.showMessageDialog(null, "A soma dos n�meros � igual a: "+ (Ni1+Ni2));
		
		JOptionPane.showMessageDialog(null, "A subtra��o dos n�meros � igual a: "+ (Ni1-Ni2));
	
		JOptionPane.showMessageDialog(null, "O produto dos n�meros � igual a: "+ Ni1*Ni2);
		
		JOptionPane.showMessageDialog(null, "A divis�o dos n�meros � igual a: "+ Ni1/Ni2);

		System.exit(0);
		
	}

}
