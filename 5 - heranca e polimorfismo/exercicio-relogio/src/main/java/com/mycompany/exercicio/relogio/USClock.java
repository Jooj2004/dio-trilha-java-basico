/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relogio;

/**
 *
 * @author Pichau
 */
public non-sealed class USClock extends Clock {
    
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }
    
    public void setAfterMidday(){
        this.periodIndicator = "PM";
    }
    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }
    
    public void setHour(int hour) {
        setBeforeMidday();
        if(hour > 12 && hour <= 23){
            setAfterMidday();
            this.hour = hour - 12;
        }else if(hour >= 24){
            this.hour = 0;
        }else{
            this.hour = hour;
        }
    }
    
    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRClock brClock -> this.setHour(brClock.getHour());
        }
        return this;
    }
    
    public String getTime(){
        return super.getTime() + ":" + this.getPeriodIndicator();
    }
}
