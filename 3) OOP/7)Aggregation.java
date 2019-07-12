package com.mert.javatutorial;
import java.io.*; 
import java.util.*;

//Öğrenci sınıfı
class Student{
    String name;
    int number;
    String department;

    Student(String name, int number, String department){
        this.name=name;
        this.number=number;
        this.department=department;
    }
}

//Bölüm sınıfı. İçerisinde List of Student barındırıyor.
class Department{
    String name;
    private List<Student> students;
    Department(String name, List<Student> students){
        this.name=name;
        this.students=students;
    }

    public List<Student> getStudents(){
        return students;
    }
}

//Fakülte sınıfı. İçerisinde List of Department barındırıyor.
class Faculty{
    String facultyName;
    private List<Department> departments;

    Faculty(String facultyName, List<Department> departments){
        this.facultyName=facultyName;
        this.departments=departments;
    }

    //Fakültedeki tüm öğrencilerin sayısını döndüren metod
    public int getTotalStudentsInFaculty(){
        int numberOfStudents=0;
        List<Student> students;

        for(Department dep : departments){
            students = dep.getStudents();
            for(Student s : students){
                numberOfStudents++;
            }
        }
        return numberOfStudents;
    }
}

public class Test{
    public static void main (String[] args){
        Student s1 = new Student("Mert",1,"Bilgisayar Mühendisliği");
        Student s2 = new Student("Esma",2,"Bilgisayar Mühendisliği");
        Student s3 = new Student("Gizem",3,"Elektrik-Elektronik Mühendisliği");
        Student s4 = new Student("Tuğçe",4,"Bilgisayar Mühendisliği");
        Student s5 = new Student("Damla",5,"Elektrik-Elektronik Mühendisliği");

        List<Student> ogrBilgisayar = new ArrayList<Student>();
        ogrBilgisayar.add(s1);
        ogrBilgisayar.add(s2);
        ogrBilgisayar.add(s4);

        List<Student> ogrElektrik = new ArrayList<Student>();
        ogrElektrik.add(s3);
        ogrElektrik.add(s5);

        Department bilgisayarMuh = new Department("Bilgisayar Mühendisliği",ogrBilgisayar);
        Department elektrikMuh = new Department("Elektrik-Elektronik Mühendisliği",ogrElektrik);

        List<Department> departments = new ArrayList<Department>();
        departments.add(bilgisayarMuh);
        departments.add(elektrikMuh);

        Faculty faculty = new Faculty("Mühendislik Fakültesi",departments);

        System.out.print("Fakültedeki toplam öğrenci sayısı: ");
        System.out.println(faculty.getTotalStudentsInFaculty());
    }
}