import javax.swing.JOptionPane;

public class SeuPeso
{
   public static void main (String [] args)
   {
      double peso;
                  
      peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite seu peso:"));  
      
      String resultado = "O peso informado foi " + peso + " kg.";
      
      JOptionPane.showMessageDialog (null, resultado);
      
      System.exit(0);
   }
}