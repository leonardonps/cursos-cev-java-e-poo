/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Leonardo
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1001);
       p1.setDono("Jubileu");
       p1.abrirConta("CC");
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(1002);
       p2.setDono("Creuzia");
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p2.depositar(500);
       
       p1.estadoAtual();
       p2.estadoAtual();
       
    }
    
}
