/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Peixoto
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        float n, s = 0;
        float media;
        int tv = 0, tp =0, ti =0, tMaisQue100 = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
            
            s = s + n;
            
            if(n == 0 ){
            tv++;
          
            media = s/tv; 
            
            if(n % 2 == 0){
                tp++;
            } else{
                ti++;
            }
  
            if( n > 100){
                tMaisQue100 ++;
            }
            }
           
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <hr> "
                + "<br>Somatório vale " + s 
                + "<br>Total de valores é: " + tv
                + "<br>Total de pares é: " + tp
                + "<br>Total de ímpares é: " + ti
                + "<br>Valores maiores que 100: " + tMaisQue100
                + "<br>Média dos valores: " + media + "</html>");
    }  
    
}
