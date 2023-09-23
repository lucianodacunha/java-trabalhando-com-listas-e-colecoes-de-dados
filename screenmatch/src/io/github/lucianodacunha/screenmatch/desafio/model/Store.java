package io.github.lucianodacunha.screenmatch.desafio.model;

import com.github.javafaker.Faker;

import java.util.*;

public class Store {
    private final Map<Integer, Product> stock = new HashMap<>();
    private final CreditCard card;
    private final Cart cart = new Cart();


    public Store(CreditCard card){
        this.card = card;
        addProductsToStock(generateProducts());
    }

    private List<Product> generateProducts(){
        List<Product> products = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            Product p1 = new Product(
                    i,
                    new Faker().commerce().productName(),
                    new Faker().number().randomDouble(2, 10, 9999),
                    10
            );
            products.add(p1);
        }

        return products;
    }

    public CreditCard getCard(){
        return this.card;
    }

    public Cart getCart(){
        return this.cart;
    }

    public void addProductToCart(Product newProduct){
        var totalItem = newProduct.getQuantity() * newProduct.getValue();

        if (totalItem <= this.card.getBalance()) {
            if (this.cart.getProducts().containsKey(newProduct.getId())) {
                Product product = this.cart.getProducts().get(newProduct.getId());
                product.setQuantity(product.getQuantity() + newProduct.getQuantity());
            } else {
                this.cart.getProducts().put(newProduct.getId(), newProduct);
            }

            this.cart.calculateTotalValue();
            this.card.setInvoice(newProduct.getValue());
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    public void addProductToStock(Product product){

        while (this.stock.containsKey(product.getId())) {
            Integer newId = new Random().nextInt(1, 10000);
            product.setId(newId);
        }

        this.stock.put(product.getId(), product);
    }

    public void addProductsToStock(List<Product> products){
        products.forEach(this::addProductToStock);
    }

    public Product getProductById(Integer id, Integer quantity){
        // TODO: 23/09/2023 Verificar se existe estoque disponivel.
        Product productBuy = this.stock.get(id).clone();
        productBuy.setQuantity(quantity);
        Product productToUpdate = this.stock.get(id);
        productToUpdate.setQuantity(productToUpdate.getQuantity() - quantity);
        return productBuy;
    }

    public void listStock(){
        System.out.printf("%-4s  %-30s  %7s  %s\n",
                "ID", "PRODUCT", "PRICE $", "QUANTITY");
        this.stock.forEach((id, product) -> System.out.println(product));
    }
}
