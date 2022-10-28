package ss17_io_binary_file_serialization.exercise.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(String name, String brand, int price, String describe) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.describe = describe;
    }

    public Product(int id, String name, String brand, int price, String describe) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                '}';
    }
}
