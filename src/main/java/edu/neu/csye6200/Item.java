package edu.neu.csye6200;

public class Item {
        private final String name;
        private double price;
        public static  String REVISION = "1.0";

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + ": $" + price;
        }

        public static void demo() {
            Item[] items = {
                    new Item("Item 1", 2.99),
                    new Item("Item 2", 3.99),
                    new Item("Item 3", 4.99)
            };

            double total = 0;
            for (Item item : items) {
                total += item.price;
                System.out.println(item);
            }

            double cash = 20;
            double change = cash - total;
            System.out.println("\nTotal: $" + total);
            System.out.println("Cash: $" + cash);
            System.out.println("Change: $" + change);
            System.out.println("Revision: " + REVISION);
        }
}
