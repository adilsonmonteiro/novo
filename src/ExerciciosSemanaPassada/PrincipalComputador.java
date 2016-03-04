/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosSemanaPassada;

import java.util.Scanner;

/**
 *
 * @author Valmir
 */
public class PrincipalComputador {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Computador pc = new Computador();
        pc.cor = "amarelo";
        pc.marca = "hp";
        pc.modelo = "nvidia";
        pc.num_serie = "1213341";
        pc.preco = 3000;
        pc.imprimir();
        pc.calcularValor();
        System.out.println("\nDigite um valor para alterar o preco: ");
        float valor = s.nextFloat();
        if(pc.alterarValor(valor) == 1)
            System.out.println("Valor Alterado");
        else
            System.out.println("Valor não Alterado");
        
        
        Computador pc2 = new Computador();
        System.out.println("\nUtilizar o método alterarValor com valor negativo:");
        if(pc2.alterarValor(-200) == 1)
            System.out.println("Valor Alterado");
        else
            System.out.println("Valor não Alterado");
        
    }
}
