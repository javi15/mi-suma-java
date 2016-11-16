import javax.swing.JOptionPane;
//import java.lang.*;
public class sumaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Num1 = JOptionPane.showInputDialog("Digitar el primer numero");
		int num1 = Integer.parseInt(Num1);
		String Num2 = JOptionPane.showInputDialog("Digitar el segundo numero");
		int num2 = Integer.parseInt(Num2);
		int suma = num1 + num2;
		
		String msj = String.format("La suma es "+ num1 +"+"+ num2 +" = %s", suma);
		
		JOptionPane.showMessageDialog(null, msj);
		// Operador condicional (?:)
		//int cal = 50;
		//System.out.println(cal >= 60 ? "Aprobado": "Reprobado");
	}

}
