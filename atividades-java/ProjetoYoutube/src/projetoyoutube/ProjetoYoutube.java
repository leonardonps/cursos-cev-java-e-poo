/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Leonardo Peixoto
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTMLS");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
       
        Visualizacao vis [] = new Visualizacao[5]; 
        vis[0]= new Visualizacao(g[0], v[2]);
        vis[0].avaliar(87f);
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    
        
        /*System.out.println("------------ VÍDEOS ----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(" ----------- GAFANHOTOS ------------");
        System.out.println(g[0].toString());     
        System.out.println(g[1].toString());*/
    }
}