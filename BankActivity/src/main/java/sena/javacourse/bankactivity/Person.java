/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena.javacourse.bankactivity;

/**
 *
 * @author Jeyssson
 */
abstract class Person {

    protected String name;
    protected String id;
}

class Client extends Person {

    protected int accountBalance;
    protected boolean isCreated;
    protected boolean isSavingsAccount;
    protected String typeOfAccount;
    protected double savingPercentPerYear;
    protected double savingPercentPerMonth;

    public Client() {
        this.name = "";
        this.id = "";
        this.accountBalance = 0;
        this.isCreated = false;
        this.isSavingsAccount = false;
        this.typeOfAccount = "NONE";
        this.savingPercentPerYear = 0.0;
        this.savingPercentPerMonth = 0.0;
    }

    public Client(String name, String id) {
        this.accountBalance = 0;
        this.isCreated = false;
        this.name = name;
        this.id = id;
        this.isSavingsAccount = false;
        this.typeOfAccount = "NONE";
        this.savingPercentPerYear = 0.0;
        this.savingPercentPerMonth = 0.0;
    }

    public void getNameAndId(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean getTypeOfAccount(int type) {
        if (type == 0) {
            this.isSavingsAccount = true;
            this.typeOfAccount = "AHORROS";
        } else if (type == 1) {
            this.isSavingsAccount = false;
            this.typeOfAccount = "INVERSIONES";
        }
        return this.isSavingsAccount;
    }

    public void getPercent(double percent) {
        this.savingPercentPerYear = percent;
        this.savingPercentPerMonth = percent / 12;
    }

    public int deposit(int amount) {
        if (this.isCreated == false) {
            if (this.isSavingsAccount) {
                if (amount < 1000) {
                    System.out.println("Registre una cantidad válida... CANT VALID = $1000");
                } else {
                    System.out.println("Su cuenta fue creada y cargada con el dinero exitosamente.");
                    this.isCreated = true;
                    this.accountBalance += amount;
                }
            } else {
                if (amount < 25000) {
                    System.out.println("Registre una cantidad válida... CANT VALID = $25000");
                } else {
                    System.out.println("Su cuenta fue creada y cargada con el dinero exitosamente.");
                    this.isCreated = true;
                    this.accountBalance += amount;
                }
            }

        }
        System.out.println("El saldo de su cuenta ha sido actualizado.");
        return this.accountBalance;
    }

    public int withdraw(int amount) {
        if (this.isSavingsAccount) {
            if (this.accountBalance - amount < 500) {
                System.out.println("No puede hacer el retiro, debe quedarle por lo menos $500 de saldo. Intente con una cifra menor.");
                return this.accountBalance;
            } else {
                System.out.println("Retiro realizado exitosamente.");
                this.accountBalance -= amount;
            }
        } else {
            if (this.accountBalance - amount < 10000) {
                System.out.println("No puede hacer el retiro, debe quedarle por lo menos $500 de saldo. Intente con una cifra menor.");
                return this.accountBalance;
            } else {
                System.out.println("Retiro realizado exitosamente.");
                this.accountBalance -= amount;
            }
        }

        return this.accountBalance;
    }

    public void deleteAccount() {
        System.out.println("Has cancelado tu cuenta.");
        System.out.println("Se acaba de retirar todo el dinero en la cuenta.");
        this.name = "";
        this.id = "";
        this.accountBalance = 0;
        this.isCreated = false;
        this.isSavingsAccount = false;
        this.typeOfAccount = "NONE";
        this.savingPercentPerYear = 0.0;
        this.savingPercentPerMonth = 0.0;
    }

    public void showBalance() {
        System.out.println("Tienes un saldo de: " + this.accountBalance);
    }

    public void showAllData() {
        System.out.println("**************************");
        System.out.println("****DATOS DE LA CUENTA****");
        System.out.println("**************************");
        System.out.println("\n");
        System.out.println("**************************");
        System.out.println("CLIENTE: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("SALDO DISPONIBLE: $" + this.accountBalance);
        System.out.println("TIPO DE CUENTA: " + this.typeOfAccount);
        System.out.println("PORCENTAJE DE AHORRO ANUAL: " + this.savingPercentPerYear);
        System.out.println("PORCENTAJE DE AHORRO MENSUAL: " + this.savingPercentPerMonth);
        System.out.println("**************************");
        System.out.println("\n\n");
    }
}

class Employee extends Person {

    protected int accountBalance;
    protected String position;
    protected int salary;
    protected int monthsOfAntiquity;
    protected int holiday;

    public Employee() {
        this.name = "";
        this.id = "";
        this.accountBalance = 0;
        this.salary = 0;
        this.position = "NONE";
        this.monthsOfAntiquity = 0;
        this.holiday = 0;
    }

    public Employee(String name, String id, String position, int salary, int months) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.monthsOfAntiquity = months;
        this.accountBalance = 0;
        addSalaryPayment(salary, months);
        addHoliday(months);
    }

    public void getNameAndId(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void getPosition(String position) {
        this.position = position;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }

    public void getMonthsOfAntiquity(int months) {
        this.monthsOfAntiquity = months;
    }

    private int addSalaryPayment(int salary, int months) {
        if (months > 0) {
            this.accountBalance += (salary * months);
        }

        return this.accountBalance;
    }

    private int addHoliday(int months) {
        if (0 < months && months < 12) {
            this.holiday = 0;
        } else if (12 <= months && months < 18) {
            this.holiday = 5;
        } else if (18 <= months && months < 24) {
            this.holiday = 7;
        } else if (months >= 24) {
            this.holiday = 11;
        }

        return this.holiday;
    }

    public int deposit(int amount) {
        this.accountBalance += amount;
        System.out.println("Depositado exitosamente.");
        return this.accountBalance;
    }

    public int withdraw(int amount) {
        if (this.accountBalance > 0 && this.accountBalance > amount) {
            System.out.println("Retiro exitoso.");
            this.accountBalance -= amount;
        } else {
            System.out.println("No se puede realizar el retiro.");
        }
        return this.accountBalance;
    }

    public void showBalance() {
        System.out.println("Tienes un saldo de: " + this.accountBalance);
    }

    public void showAllData() {
        System.out.println("**************************");
        System.out.println("****DATOS DE LA CUENTA****");
        System.out.println("**************************");
        System.out.println("\n");
        System.out.println("**************************");
        System.out.println("EMPLEADO: " + this.name);
        System.out.println("CARGO: " + this.position);
        System.out.println("ID: " + this.id);
        System.out.println("SALDO DISPONIBLE: $" + this.accountBalance);
        System.out.println("ANTIGUEDAD: " + this.monthsOfAntiquity + " MESES");
        System.out.println("DIAS DE VACACIONES: " + this.holiday + " DIAS");
        System.out.println("**************************");
        System.out.println("\n\n");
    }
}
