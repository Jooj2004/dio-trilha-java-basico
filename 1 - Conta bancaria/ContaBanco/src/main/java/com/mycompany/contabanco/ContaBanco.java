/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando os dados
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa quebra de linha

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        // Criando objeto com os dados
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        // Exibindo mensagem formatada
        conta.exibirMensagem();

        scanner.close();
    }
}
