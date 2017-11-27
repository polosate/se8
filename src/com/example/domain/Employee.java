package com.example.domain;

import java.text.NumberFormat;
import com.example.business.EmployeeStockPlan;

public class Employee {
    private final int empID;
    private String name;
    private final String ssn;
    private double salary;

    public Employee(int empID, String name, String ssn, double salary) {
        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    
    public int getEmpID() {
        return this.empID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        if (name != null && !name.equals("")) {            
            this.name = name; 
        }
    }
    
    public String getSsn() {
        return this.ssn;
    }    
  
    public double getSalary() {
        return this.salary;
    }
    
    public void raiseSalary(double increase) {
        if (increase > 0) {
            this.salary += increase;
        }        
    }
    
    public int grantStock() {
        return EmployeeStockPlan.grantStock(this);
    }
    
    @Override
    public String toString() {
        return "ID: " + this.empID + 
                "Name: " + this.name + 
                "Ssn: " + this.ssn +  
                "Salary: " + NumberFormat.getCurrencyInstance().format((double) getSalary()) ;
    }
}