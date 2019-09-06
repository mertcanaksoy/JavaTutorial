package com.mert.javatutorial;

class Employee{
    private String name;

    Employee(String name){
        this.name=name;
    }
    
    public String getEmployeeName(){
        return this.name;
    }
}

class Company{
    private String name;

    Company(String name){
        this.name=name;
    }

    public String getCompanyName(){
        return this.name;
    }
}

class Association{
    public static void main (String[] args){
        Employee employee = new Employee("Mert");
        Company company = new Company("Entes");

        System.out.println(employee.getEmployeeName()+" isimli kişi, "+company.getCompanyName()+" şirketinde çalışıyor.");
    }
}