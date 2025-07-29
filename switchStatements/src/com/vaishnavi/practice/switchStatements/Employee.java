package com.vaishnavi.practice.switchStatements;

import java.util.*;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}


