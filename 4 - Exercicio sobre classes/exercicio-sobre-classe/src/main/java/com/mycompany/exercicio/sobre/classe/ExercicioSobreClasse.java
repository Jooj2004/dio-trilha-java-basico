/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio.sobre.classe;

/*
# Exercícios
Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
   - Dar banho no pet;
   - Abastecer com água;
   - Abastecer com shampoo;
   - verificar nivel de água;
   - verificar nivel de shampoo;
   - verificar se tem pet no banho;
   - colocar pet na maquina;
   - retirar pet da máquina;
   - limpar maquina.

Siga as seguintes regras para implementação

   - A maquina de banho deve permitir somente 1 pet por vez;
   - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
   - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
   - Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
   - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
   - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
*/

/**
 *
 * @author Pichau
 */


import java.util.Scanner;
import classes.Pet;

public class ExercicioSobreClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual opcao? [e-1][e-2][e-3]");
        String op = scanner.next();

        ExercicioSobreClasse exercicio = new ExercicioSobreClasse(); // cria instância

        switch (op) {
            case "e-1":
                exercicio.Exer1();
                break;
            case "e-2":
                exercicio.Exer2();
                break;
            case "e-3":
                exercicio.Exer3();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
        scanner.close(); // boa prática
    }

    public void Exer1() {
        System.out.println("exer-1");
    }

    public void Exer2() {
        System.out.println("exer-2");
    }

    public void Exer3() {
        Scanner scanner = new Scanner(System.in);
        var option = -1;
        do{
            System.err.println("===Escolha uma das opcoes===");
            System.err.println("1 - Dar banho no pet");
            System.err.println("2 - Abastecer a maquina com agua");
            System.err.println("3 - Abastecer a maquina com shampoo");
            System.err.println("4 - Verificar a agua");
            System.err.println("5 - Verificar o shampoo");
            System.err.println("6 - Verificar se tem pet no banho");
            System.err.println("7 - Colocar pet na maquina");
            System.err.println("8 - Retirar pet da maquina");
            System.err.println("9 - Limpar a maquina");
            System.err.println("0 - Sair");
            option = scanner.nextInt();
        }while(option != 0);
        
        //Incompleto, seguir no minuto 33
    }
}
