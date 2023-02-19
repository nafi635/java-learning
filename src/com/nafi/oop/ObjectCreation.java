package com.nafi.oop;


public class ObjectCreation {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        textBox.setText("Texting");
        System.out.println(textBox.getText());

        Employee employee = new Employee();
        employee.baseSalary = 50000;
        employee.extraHours = 2;
        employee.hourlyRate = 50;
        System.out.println(employee.calculateWage());

        ConstructorConcept constructorConcept = new ConstructorConcept(1,2);
    }
}
