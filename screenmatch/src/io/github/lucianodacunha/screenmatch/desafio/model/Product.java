package io.github.lucianodacunha.screenmatch.desafio.model;

public class Product implements Cloneable {
    private Integer id;
    private final String name;
    private Integer quantity;
    private Double value;

    public Product(String name, Double value){
        this.name = name;
        this.value = value;
    }

    public Product(Integer id, String name, Double value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Product(Integer id, String name, Double value, Integer quantity){
        this.id = id;
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    @Override
    public String toString() {
        return  String.format(
                "%04d  %-30s  %7.2f  %02d",
                getId(), getName(), getValue(), getQuantity()
        );
    }

    @Override
    public Product clone() {
        try {
            Product clone = (Product) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
