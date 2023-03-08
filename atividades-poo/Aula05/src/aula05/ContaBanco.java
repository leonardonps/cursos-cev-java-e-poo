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
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void estadoAtual(){
        System.out.println("-------------- Conta bancária -------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Nome do cliente: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }
    
    
    //Métodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)) {
            //this.saldo = 50;
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            //this.saldo = 150;
            this.setSaldo(150);
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
       if(this.getSaldo() > 0) {
           System.out.println("Conta não pode ser fechada porque ainda tem saldo na conta.");
       } else if (this.getSaldo() < 0 ){
           System.out.println("Conta não pode ser fechada porque ainda tem débito na conta.");
       }else {
           this.setStatus(false);
           System.out.println("Conta foi fechada com sucesso!");
       }
    }
    
    public void depositar(int v) {
        if(this.getStatus () == true){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado para a conta de: " + this.getDono());
        }
        else{
            System.out.println("Conta não ativada. Não é possível fazer essa operação.");
        }
    }
    
    public void sacar(float v) {
        if(this.getStatus() == true){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                // saldo = saldo - v;
                System.out.println("Saldo realizado pela conta de: " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não ativada. Não foi possível realizar essa operação.");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        
        if(this.getTipo() == "CC") {
            //"CC".equals(this.getTipo())
            v = 12;
        } else if(this.getTipo()== "CP") {
            v = 20;
        }
        
        if(this.getStatus() == true) {
            if(this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Pagamento da mensalidade feito com sucesso.");
            }
            else {
                System.out.println("Saldo insuficiente para realizar o pagamento.");
            }
        } else {
            System.out.println("Conta desativada. Não foi possível realizar essa operação.");
        }
    }
    
    //Métodos especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
