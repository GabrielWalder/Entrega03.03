import javax.swing.JOptionPane;

public class InverteTresPalavras
{
   public static void main (String [] args)
   {
      String palavra1;
      String palavra2;
      String palavra3;
      
      palavra1 = JOptionPane.showInputDialog ("Digite a primeira palavra:");
      palavra2 = JOptionPane.showInputDialog ("Digite a segunda palavra:");
      palavra3 = JOptionPane.showInputDialog ("Digite a terceira palavra:");  
      
      String resultado = palavra3 + " " + palavra2 + " " + palavra1;
      
      JOptionPane.showMessageDialog (null, resultado);
      
      System.exit(0);
   }
}