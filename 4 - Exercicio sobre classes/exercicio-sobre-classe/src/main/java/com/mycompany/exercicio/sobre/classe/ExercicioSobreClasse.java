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
import classes.petMachine;

public class ExercicioSobreClasse {
    private final static Scanner scanner = new Scanner(System.in);
    private final static petMachine PetMachine = new petMachine();

    public static void main(String[] args) {
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
            
            switch(option){
                case 1 -> PetMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampo();
                case 4 -> verifyWater();
                case 5 -> verifyShampo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> PetMachine.removePet();
                case 9 -> PetMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida!");
            }
        }while(option != 0); 
    }
    
    public static void setShampo(){
        PetMachine.addShampo();
    }
    
    public static void setWater(){
        PetMachine.addWater();
    }
    
    public static void verifyWater(){
        var amount = PetMachine.getWater();
        System.out.println("A maquina esta com litros de water: "+amount);
    }
    
    public static void verifyShampo(){
        var amount = PetMachine.getShampo();
        System.out.println("A maquina esta com litros de shampo: "+amount);
    }
    
    public static void checkIfHasPetInMachine(){
        var hasPet = PetMachine.hasPet();
        System.out.println(hasPet ?"Tem pet na maquina" : "Nao tem pet na maquina");
    }
    
    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        PetMachine.setPet(pet);
    }
}
