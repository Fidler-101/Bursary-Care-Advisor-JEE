/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author boika
 */
public class Funding {
 
    private int officeID;
    private double accommodationExpense;
    private double mealAllowance;
    private double tuitionExpense;
    private double boolAllowance;
    private double transportAllowance;
    

    public Funding(double accommodationExpense, double mealAllowance, double tuitionExpense, double boolAllowance, double transportAllowance, int officeID) {
        this.accommodationExpense = accommodationExpense;
        this.mealAllowance = mealAllowance;
        this.tuitionExpense = tuitionExpense;
        this.boolAllowance = boolAllowance;
        this.transportAllowance = transportAllowance;
        this.officeID = officeID;
    }

    public double getAccommodationExpense() {
        return accommodationExpense;
    }

    public void setAccommodationExpense(double accommodationExpense) {
        this.accommodationExpense = accommodationExpense;
    }

    public double getMealAllowance() {
        return mealAllowance;
    }

    public void setMealAllowance(double mealAllowance) {
        this.mealAllowance = mealAllowance;
    }

    public double getTuitionExpense() {
        return tuitionExpense;
    }

    public void setTuitionExpense(double tuitionExpense) {
        this.tuitionExpense = tuitionExpense;
    }

    public double getBoolAllowance() {
        return boolAllowance;
    }

    public void setBoolAllowance(double boolAllowance) {
        this.boolAllowance = boolAllowance;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }
     
}
