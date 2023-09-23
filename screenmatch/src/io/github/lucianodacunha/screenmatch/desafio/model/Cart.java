package io.github.lucianodacunha.screenmatch.desafio.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Integer, Product> products = new HashMap<>();
    private Double totalValue = 0.0;

    public Map<Integer, Product> getProducts(){
        return this.products;
    }

    public void listCart(){
        System.out.printf("%-4s  %-30s  %7s  %s\n",
                "ID", "PRODUCT", "PRICE $", "QUANTITY");
        this.products.forEach((id, product) -> System.out.println(product));
    }

    protected void calculateTotalValue(){
        for (Product product : this.products.values()){
            this.totalValue += (product.getValue() * product.getQuantity());
        }
    }

    public Double getTotalValue(){
        return this.totalValue;
    }
}
