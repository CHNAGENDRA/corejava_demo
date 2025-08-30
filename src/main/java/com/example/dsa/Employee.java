package com.example.dsa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    private  int id;
    private String name;

    public Employee(){ }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nagendra");
        Employee e2 = new Employee(1, "Nagendra");

        System.out.println("is hashcode same: " + (e1.hashCode() == e2.hashCode()));
        System.out.println("is equals same: "+e1.equals(e2));

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);
    }
}
