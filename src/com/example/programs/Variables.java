package com.example.programs;

public class Variables {
    public static float Salary;
    public String name;

    public void emp()
    {
       String name = "Santosh";
       Salary = 10000;
       System.out.println("name:" + name);
       System.out.println("Salary:" + Salary);
    }
    public Variables ()
    {
       final int age =30;
       System.out.println("The age of the employee is =" + age);
    }
    public static void main(String args[])
    {
        Variables v =new Variables();
        v.emp();
    }
}
