/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Pichau
 */
public class Pet {
    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    
    
}
