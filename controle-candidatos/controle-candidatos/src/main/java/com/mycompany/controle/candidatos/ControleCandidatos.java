/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controle.candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Pichau
 */
public class ControleCandidatos {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
            
        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA "+tentativasRealizadas+" TENTATIVA");
        }else{
            System.out.println("NAO CONSEGUIMOS CONTATO COM "+candidato+" NUMERO MAXIMO DE TENTATIVAS "+tentativasRealizadas+" REALIZADA");
        }
    }
    
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        
        for(int indice=0; indice<candidatos.length;indice++){
            System.out.println("O candidato de numero "+(indice+1)+" e "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de interacao for each");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }
    
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" Solicitou este valor de salario "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidado "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");        
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA"); 
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS"); 
        }
    }
}
