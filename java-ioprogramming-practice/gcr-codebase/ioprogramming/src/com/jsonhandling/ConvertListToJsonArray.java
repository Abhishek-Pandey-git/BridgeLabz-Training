package com.jsonhandling;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Product {
    String name;
    double price;
    int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ConvertListToJsonArray {
    
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 45000.0, 10));
        products.add(new Product("Mouse", 500.0, 50));
        products.add(new Product("Keyboard", 1500.0, 30));
        
        JSONArray jsonArray = new JSONArray();
        
        for (Product product : products) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", product.name);
            jsonObject.put("price", product.price);
            jsonObject.put("quantity", product.quantity);
            jsonArray.add(jsonObject);
        }
        
        System.out.println("JSON Array:");
        System.out.println(jsonArray.toJSONString());
    }
}
