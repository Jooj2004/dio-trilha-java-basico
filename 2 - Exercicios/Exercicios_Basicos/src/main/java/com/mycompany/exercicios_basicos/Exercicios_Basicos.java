/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_basicos;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Exercicios_Basicos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        
        System.out.println("TABUADA: ");
        System.out.println("------------------------------");
        for(var i=1; i<=10;i++){
            System.out.printf("%d x %d = %d %n", numero, i, numero*i);
        }
        System.out.println("------------------------------");
        
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();
        
        Calc_IMC pessoa = new Calc_IMC(altura,peso);
        System.out.println(pessoa.getStatus());
        System.out.println("------------------------------");
        
        while(true){
            System.out.println("Digite um numero:");
            int num1 = scanner.nextInt();
            System.out.println("Digite um numero maior que o primeiro:");
            int num2 = scanner.nextInt();
            
            if (num1 > num2){
                System.out.println("Erro! O primeiro numero é maior que o segundo");
                continue;
            }
            
            System.out.println("Deseja numero par ou impar? [par] [impar]");
            String op = scanner.next();
            
            if(op.equals("par") || op.equals("impar")){
                switch(op){
                    case "par":
                        for(var i=num1; i<= num2; i++){
                            int atual = i;
                            if(atual % 2 == 0){
                                System.out.printf(" %d -", atual);
                            }
                        }
                        break;
                    case "impar":
                        for(var i=num1; i <= num2; i++){
                            int atual = i;
                            if(atual % 2 != 0){
                                System.out.printf(" %d -", atual);
                            }
                        }
                        break;
                }
                break;
            }else{
                System.out.println("Opcao invalida. Tente novamente");
                continue;
            }
        }
    }
}
