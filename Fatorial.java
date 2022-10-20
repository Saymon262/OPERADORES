import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Num1;
		
		int Num1I, total, i;
		
		Num1 = JOptionPane.showInputDialog("Insira um número");
		
		Num1I = Integer.parseInt(Num1);
		
		total = 1;
		i = Num1I;
		
		while (i != 0) {
			total = total * i;
			i--;
		}
		
		JOptionPane.showMessageDialog(null,"O fatorial de "+ Num1I + " é igual a: " + total);
			
	}

}
