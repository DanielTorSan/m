import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
        //Refact 1 (Menu):   Extraccio de metode
        Menu();
//            System.out.println("1. ");
//            System.out.println("2. ");
//            System.out.println("3. ");
//            System.out.println("4. ");
//            System.out.println("5. ");
//            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("Introdueix un numero: ");
                    int num1 = scan.nextInt();
                    System.out.println("Introdueix un numero: ");
                    int num2 = scan.nextInt();
                    if (max(num1,num2)) {

                        // Refact 2 (Simplificaccio de metode): En aquest cas és perquè l'usuari un com a acabat aquest cas
                        // pugui saber quin ha sigut el resultat, ja que aaa o bbb no fa indicis de cap resultat o procediment.
                    /*
                        System.out.println("aaa");
                    }
                    else System.out.println("bbb");
                    */
                        System.out.println("El primer numero introduit es mes gran que el segon " + num1 + " > " + num2);
                    }
                    else System.out.println("El segon numero introduit es mes gran que el primer o son iguals " + num1 + " < " + num2);
                    break;

                case 2:
                    //Refact 8 (Extraccio de variables)
                    //double a=2;
                    //double b=3;
                    //double c=1;
                    calcEquacioSegongrau(2, 3, 4);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    //Refact 9 (Clarificacio)
                    Order Llista_Objectes = new Order(lineItems, 5.5);

                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    public static boolean max(int a, int b) {
        if(a > b) {
            return true;
            // Refact 3 (Simplificaccio de metode): En aquest cas la comprovació del integers es redundant ja que de totes
            // maneras si a no es mes gran que b retornara un false.
        }/* else if (a == b) {
            return false;
        } */else {
            return false;
        }
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    /*
    Refact 4 (Extraccio de Classe): Treiem lea classe del main.
    public static class Human {
        private String name;

        private String age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;

        public String obtenirAdrecaCompleta() {
            StringBuilder result = new StringBuilder();
            return result
                    .append(country)
                    .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();
        }
    }
     */

    /*
    Refact 5 (Extraccio de Classe): Treiem lea classe del main.
    public static class Order {
        private List<OrderLineItem> lineItems;
        private double taxRate;

        public Order(List<OrderLineItem> lineItems, double taxRate) {
            this.lineItems = lineItems;
            this.taxRate = taxRate;
        }

        public double calculateTotalPrice() {
            double subtotal = 0.0;
            for (OrderLineItem item : lineItems) {
                subtotal += item.getPrice();
            }
            double tax = subtotal * taxRate;
            return subtotal + tax;
        }
    }
     */
    //Refact 6 (Extraccio de Classe): Treiem lea classe del main.
    /*
     public class OrderLineItem {
        private String productName;
        private int quantity;
        private double price;

        public OrderLineItem(String productName, int quantity, double price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
        public double getPrice() {
            return price * quantity;
        }
    }
     */
    //Refact 7 (Extraccio de Classe): Treiem lea classe del main.
    /*
    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
    */

    //Refact 1 : Menu
    public static void Menu() {
            System.out.println("1. Quin numero es mes gran ");
            System.out.println("2. Calcular equacio de segon grau ");
            System.out.println("3. ");
            System.out.println("0. Acabar");
    }
}
    //Refact 4 : Classe Huma
class Human {
    private String name;

    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String obtenirAdrecaCompleta() {
        String adresa = country + ", " + city + ", " + street + ", " + house + ", " + quarter;
        //Refact 10 (Simplificacio de metode): Ficar tot en un soutprintln.
        //StringBuilder result = new StringBuilder();
        /*return result
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
         */
        return adresa;
    }
}
    //Refact 5 : Classe Order
class Order {
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}
    //Refact 6 : Classe OrderLineItem
class OrderLineItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getPrice() {
        return price * quantity;
    }
}
    //Refact 7 : Classe Customer
class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}