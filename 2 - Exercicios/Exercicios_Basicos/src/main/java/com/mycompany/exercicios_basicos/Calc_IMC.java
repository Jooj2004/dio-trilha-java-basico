/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_basicos;

/**
 *
 * @author Pichau
 */
public class Calc_IMC {
    private double altura;
    private double peso;
    private String status;

    public Calc_IMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        calcularIMC();
    }

    private void calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            status = "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            status = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            status = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            status = "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            status = "Obesidade grau II";
        } else {
            status = "Obesidade grau III";
        }
    }

    public String getStatus() {
        return status;
    }
}
