/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relogio;

/**
 *
 * @author Pichau
 */
public non-sealed class BRClock extends Clock {
    
    
    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock ->this.hour = (usClock.getPeriodIndicator().equals("PM"))?
                                                    usClock.getHour() + 12 :
                                                    usClock.getHour();
            case BRClock brClock -> this.hour = brClock.getHour();
        }
        return this;
    }
    
}
