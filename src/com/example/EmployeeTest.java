package com.example;

import com.example.domain.*;

public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);              
        emp1.toString();
        
        Manager mgr = new Manager(102, "John Smith", "333-333-333", 120_345.27, "Blablabla");
        mgr.toString();
        
        
        
    }   
}