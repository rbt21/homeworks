package org.example;

import java.io.*;
import java.util.*;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть нулевым или пустым");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.name = name;
        this.price = price;
    }
}


class Customer {
    String name;
    int money;
    ArrayList<String> productsBought;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        this.productsBought = new ArrayList<>();
    }

    public boolean buyProduct(Product product) {
        if (this.money >= product.price) {
            this.productsBought.add(product.name);
            this.money -= product.price;
            return true;
        }
        return false;
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        HashMap<String, Customer> customers = new HashMap<>();
        HashMap<String, Product> products = new HashMap<>();
        StringBuilder transactions = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             PrintWriter writer = new PrintWriter("output.txt", "UTF-8")) {

            // Чтение данных покупателей
            String line = reader.readLine();
            String[] customerData = line.split("; ");
            for (String data : customerData) {
                data = data.replace(",", "").trim(); // Удаление запятых и лишних пробелов
                String[] parts = data.split(" = ");
                customers.put(parts[0], new Customer(parts[0], Integer.parseInt(parts[1])));
            }

            // Чтение данных продуктов
            line = reader.readLine();
            String[] productData = line.split("; ");
            for (String data : productData) {
                data = data.trim().replace(";", ""); // Удаляем точку с запятой в конце, если она есть
                String[] parts = data.split(" = ");
                int price = Integer.parseInt(parts[1].trim());
                products.put(parts[0], new Product(parts[0], price));
            }


            // Обработка покупок
            while ((line = reader.readLine()) != null && !line.equals("END")) {
                String[] parts = line.split(" ");
                if (parts.length < 2) {
                    continue; // Пропускаем строку, если она не содержит достаточно данных
                }
                Customer customer = customers.get(parts[0]);
                Product product = products.get(parts[1]);

                if (customer != null && product != null) {
                    if (customer.buyProduct(product)) {
                        transactions.append(customer.name).append(" купил(а) ").append(product.name).append("\n");
                    } else {
                        transactions.append(customer.name).append(" не может позволить себе ").append(product.name).append("\n");
                    }
                }
            }

            // Запись транзакций и итогов
            writer.print(transactions.toString());
            for (Customer customer : customers.values()) {
                writer.print(customer.name + " - ");
                if (customer.productsBought.isEmpty()) {
                    writer.println("Ничего не куплено");
                } else {
                    writer.println(String.join(", ", customer.productsBought));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
