
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valmir
 */
public class PrincipalContaCorrente {
    static ContaCorrente conta = new ContaCorrente();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException  {
       
        int opcao;
        boolean loop = true;
        while(loop){
            System.out.println(""
                    + "Digite 1 para cadastrar"
                    + "\nDigite 2 para sacar"
                    + "\nDigite 3 para depositar"
                    + "\nDigite 4 para consultar"
                    + "\nDigite 5 para Sair");
            
            opcao = s.nextInt();
            
            switch(opcao){
                
                case 1: execCadastrar();break;
                case 2: execSacar(); break;
                case 3: execDepositar(); break;
                case 4: execConsultar(); break;
                case 5: loop = false; break;
                default: System.out.println("Este numero não está na lista"); break;
                        
            }
      
            
        }
        
        
    }
    
    
    static void execCadastrar()
    {
        System.out.println("Faça a leitura dos dados da Conta Corrente conta"
                + "\n\n");
    }
    static void execSacar() 
    {
        float valorSaque;
        System.out.println("Digite o valor que deseja sacar: ");
        valorSaque = s.nextFloat();
        int retorno = conta.sacar(valorSaque);
        if(retorno == 1)
            System.out.println("Saque realizado com Sucesso\n\n");
        else
            System.out.println("Saque não realizado\n\n");
      
    }
    static void execDepositar() throws IOException
    {
        System.out.println("Digite o valor que deseja depositar: ");
        float valorDeposito = s.nextFloat();
        conta.depositar(valorDeposito);
        System.out.println("Método Executado\n\n");
        Runtime.getRuntime().exec("cls"); 
        
    }
    static void execConsultar()
    {
        conta.imprimir();
    }
    
    
}
