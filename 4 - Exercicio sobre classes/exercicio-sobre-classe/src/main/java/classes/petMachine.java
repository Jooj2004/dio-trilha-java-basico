/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Pichau
 */
public class petMachine {
    private boolean clean;
    private int water;
    private int shampo;
    private Pet pet;
    
    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            return;
        }
        this.water -= 10;
        this.shampo -= 2;
        pet.setClean(true);
        System.out.println("O pet "+pet+" esta limpo.");
    }
    
    public void addWater(){
        if(water == 30){
            System.out.println("Capacidade maxima de agua atingida");
            return;
        }
        water += 2;
    }
    
    public void addShampo(){
        if(shampo == 10){
            System.out.println("Capacidade maxima de shampoo atingida");
            return;
        }
        shampo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampo() {
        return shampo;
    }
    
    public boolean hasPet(){
        return pet!= null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja");
            return;
        }
        if(hasPet()){
            System.out.println("O pet"+this.pet.getName()+" esta no banho");
            return;
        }
        this.pet = pet;
    }
    
    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet "+this.pet.getName()+" esta limpo.");
        this.pet = null;
    }
    
    public void wash(){
        this.water -= 10;
        this.shampo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }
}
