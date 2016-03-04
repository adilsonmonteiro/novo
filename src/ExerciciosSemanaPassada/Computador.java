/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosSemanaPassada;

/**
 *
 * @author Valmir
 */
public class Computador {

    float preco;
    String marca, cor, modelo, num_serie;

    void imprimir() {
        System.out.println("\nCOR: "+cor+""
                + "\nMARCA: "+marca+""
                + "\nMODELO: "+modelo+""
                + "\nNUMERO DE SERIE: "+num_serie+""
                + "\nPRECO: "+preco);
    }

    void calcularValor() {
        if (!marca.equalsIgnoreCase("HP")) {
            preco = ((preco * 30) / 100) + preco;
            System.out.println("O preco aumentou 30%");
        }
       else if (marca.equalsIgnoreCase("IBM")) {
            preco = ((preco * 50) / 100) + preco;
            System.out.println("O preco aumentou 50%");
        }
       else{
            System.out.println("O preco é o mesmo");
       }

    }

    int alterarValor(float valor) {
        if(valor > 0){
            preco += valor;
        return 1;
        }
        else
        return 0;
    }

}
