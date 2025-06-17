/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio.relogio;

/**
 *
 * @author Pichau
 */
public class ExercicioRelogio {

    public static void main(String[] args) {
        Clock brClock = new BRClock();
        brClock.setSecond(0);
        brClock.setMinute(0);
        brClock.setHour(25);
        
        System.out.println(brClock.getTime());
        
        System.err.println(new USClock().convert(brClock).getTime());
    }
}

/*

📦 1. Classes e Herança
Na classe Clock (arquivo 1), encontramos a definição de uma superclasse abstrata e selada:

public sealed abstract class Clock permits BRClock, USClock

    Isso significa que Clock não pode ser instanciada diretamente e só pode ser estendida pelas classes autorizadas: BRClock e USClock (como visto nas partes 2 e 3).

    O uso de sealed junto com permits define uma hierarquia fechada e controlada, útil para cenários onde a extensão da lógica precisa ser previsível e segura.

As subclasses BRClock e USClock são marcadas como non-sealed, permitindo que elas sim possam ser estendidas, caso o projeto evolua. Isso mostra como o Java permite 
flexibilidade seletiva na herança.

Ambas as subclasses implementam o método abstrato:

abstract Clock convert(Clock clock);

Esse método define um contrato comum para que cada classe possa se converter entre formatos de hora (BR ↔ US), exemplificando polimorfismo: o mesmo método com comportamentos 
diferentes dependendo da subclasse.

🔐 2. Encapsulamento
A classe Clock (parte 1) contém três atributos protegidos:

protected int hour;
protected int minute;
protected int second;

O uso de protected permite que as subclasses acessem diretamente os campos, sem expô-los ao restante do sistema. Isso mantém os atributos encapsulados, mas com certa abertura 
para herança.
A manipulação desses atributos é feita através de métodos get e set, como setHour(int hour), que inclui validação:

if(hour >= 24){
    this.hour = 24;
    return;
}

Esse tipo de lógica protege o objeto contra valores inválidos, demonstrando boas práticas de encapsulamento.
Na classe USClock (parte 3), temos um exemplo adicional:

private String periodIndicator;

Aqui, o atributo é privado, reforçando o encapsulamento total. O acesso é feito via getPeriodIndicator(), e sua modificação por métodos como setAfterMidday() e 
setBeforeMidday() — um bom exemplo de controle interno do estado, sem expor os detalhes de implementação.

🔄 3. Conversão e Polimorfismo
Tanto BRClock (parte 2) quanto USClock (parte 3) sobrescrevem o método convert(Clock clock) de formas distintas:
    BRClock (linha ~6 da parte 2) usa um switch pattern matching para identificar o tipo de relógio a ser convertido, e ajusta a hora conforme a lógica de 24 horas 
ou 12 horas + período (AM/PM).

    USClock (linha ~24 da parte 3) também usa switch, mas incorpora a lógica de período no método setHour(int hour), demonstrando encapsulamento do comportamento relacionado 
à formatação americana.

Este uso de switch (clock) com case USClock e case BRClock é um exemplo de desempacotamento com pattern matching em Java moderno, que colabora com o polimorfismo e a leitura 
clara da lógica de conversão.

🧪4. Sobrescrita e Especialização
O método getTime() é sobrescrito em USClock:

public String getTime() {
    return super.getTime() + ":" + this.getPeriodIndicator();
}

Esse é um exemplo clássico de especialização de comportamento: enquanto a versão base (Clock, parte 1) retorna a hora em formato HH:MM:SS, a versão americana inclui o 
indicador AM/PM. Isso reforça como o uso de herança e sobrescrita permite construir comportamentos mais ricos a partir de uma base comum.

📌 Conclusão
Este projeto apresenta, de forma clara e bem estruturada, os princípios da POO:

| Conceito            | Onde aparece no projeto                                           |
| ------------------- | ----------------------------------------------------------------- |
| **Classe Abstrata** | `Clock` (parte 1) define a estrutura base comum para relógios     |
| **Encapsulamento**  | Uso de `private`, `protected` e métodos `get/set` nas três partes |
| **Herança**         | `BRClock` e `USClock` estendem `Clock` com `non-sealed`           |
| **Polimorfismo**    | Método abstrato `convert()` é implementado de formas diferentes   |
| **Sobrescrita**     | `getTime()` em `USClock` redefine o comportamento base            |


*/