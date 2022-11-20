package com.github.jin;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Employee employee = new Employee();
        Beverage beverage = new Customer().order("아메리카노",menu,employee);
        //직원에게 ..

    }
}
