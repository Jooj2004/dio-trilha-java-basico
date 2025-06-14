/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabanco;

/**
 *
 * @author Pichau
 */
public class ContaTerminal {
     private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirMensagem() {
        System.out.println(String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco.%nSua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo));
    }
}
