/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author Leonardo Peixoto
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Só pode métodos abstratos se a classe for abstrata
    public abstract void emitirSom();
}
