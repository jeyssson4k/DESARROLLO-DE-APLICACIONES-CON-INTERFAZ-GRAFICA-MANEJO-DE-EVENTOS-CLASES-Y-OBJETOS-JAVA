/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena.javacourse.bankactivity;

/**
 *
 * @author Jeyssson
 */
public class Bank {

    public static void main(String[] Args) {
        Client cliente1 = new Client("Jorge", "0x0002bcf0");

        cliente1.showBalance();
        cliente1.getTypeOfAccount(0);
        cliente1.deposit(2000);
        cliente1.getPercent(12.5);
        cliente1.withdraw(150);
        cliente1.showAllData();

        Employee empleado1 = new Employee("Juan", "110-B", "Asesor", 2500000, 1);
        empleado1.deposit(15000);
        empleado1.showAllData();
    }
}
