/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author goutam
 */
public class VitalSigns {
    
    private double temprarture;// decimals
    private double bloodpressure;// decimals
    private int pulse;
    private String date;

    public double getTemprarture() {
        return temprarture;
    }

    public void setTemprarture(double temprarture) {
        this.temprarture = temprarture;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override 
    public String toString(){
        return date;
    }
    
}
