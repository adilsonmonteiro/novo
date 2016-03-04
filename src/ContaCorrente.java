/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valmir
 */
public class ContaCorrente {
    
    int conta;
    float saldo=0;
    String agencia,nomeCliente;
    
    int sacar(float valor)
    {
        if(valor<saldo){
            saldo-=valor;
          return 1;
        }
        else
            return 0;
        }
    
    
    
    
    
    void depositar(float valor)
    {
        if(valor>=saldo)
        saldo+=valor;
      
        else
            System.out.println("Não foi possível depositar");
    }
    
    
    void imprimir()
    {
        System.out.println("O nome do cliente: "+nomeCliente+"\nA Conta: "
                + conta+"\nA Agencia: "+agencia+"\nO Saldo Atual: "+saldo);
    }
    
    
}
