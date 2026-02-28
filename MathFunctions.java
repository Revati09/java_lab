// =======================
// 3. Package: MathOperations
// =======================

package MathOperations;

public class MathFunctions {
    public static void performOperations(double num) {
        System.out.println("Number: " + num);
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Round: " + Math.round(num));
    }
}
/ =======================
// Main Program Using All Packages
// =======================

import LibraryManagement.*;
import Ecommerce.*;
import MathOperations.*;

public class MainProgram {
    public static void main(String[] args) {

        // ---- Library Management ----
        System.out.println("----- Library Management -----");
        Book b = new Book("Java Basics", "James Gosling", "12345");
        Member m = new Member("Revati", 101);
        b.displayBook();
        m.displayMember();

        // ---- Ecommerce ----
        System.out.println("\n----- Ecommerce -----");
        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Amit");
        Order o = new Order(p, 2);
        c.displayCustomer();
        o.displayOrder();

        // ---- Math Operations ----
        System.out.println("\n----- Math Operations -----");
        MathFunctions.performOperations(12.75);
    }
}
/ =======================
// Main Program Using All Packages
// =======================

import LibraryManagement.*;
import Ecommerce.*;
import MathOperations.*;

public class MainProgram {
    public static void main(String[] args) {

        // ---- Library Management ----
        System.out.println("----- Library Management -----");
        Book b = new Book("Java Basics", "James Gosling", "12345");
        Member m = new Member("Revati", 101);
        b.displayBook();
        m.displayMember();

        // ---- Ecommerce ----
        System.out.println("\n----- Ecommerce -----");
        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Amit");
        Order o = new Order(p, 2);
        c.displayCustomer();
        o.displayOrder();

        // ---- Math Operations ----
        System.out.println("\n----- Math Operations -----");
        MathFunctions.performOperations(12.75);
    }
}
/ =======================
// Main Program Using All Packages
// =======================

import LibraryManagement.*;
import Ecommerce.*;
import MathOperations.*;

public class MainProgram {
    public static void main(String[] args) {

        // ---- Library Management ----
        System.out.println("----- Library Management -----");
        Book b = new Book("Java Basics", "James Gosling", "12345");
        Member m = new Member("Revati", 101);
        b.displayBook();
        m.displayMember();

        // ---- Ecommerce ----
        System.out.println("\n----- Ecommerce -----");
        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Amit");
        Order o = new Order(p, 2);
        c.displayCustomer();
        o.displayOrder();

        // ---- Math Operations ----
        System.out.println("\n----- Math Operations -----");
        MathFunctions.performOperations(12.75);
    }
}