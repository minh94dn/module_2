package ss17_io_binary_file_serialization.exercise.product_management.service;

import ss17_io_binary_file_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src\\ss17_io_binary_file_serialization\\exercise\\product_management\\data\\data.dat";
    public static ArrayList<Product> products = new ArrayList<>();

    public static void writeFile(String path, ArrayList<Product> products) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> readFile(String path) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void add() throws IOException {
        ArrayList<Product> products = readFile(PATH);
        int id = products.get(products.size() - 1).getId() + 1;
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập hãng sản phẩm: ");
        String brand = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả khác: ");
        String describe = scanner.nextLine();
        Product product = new Product(name, brand, price, describe);
        product.setId(id);
        products.add(product);
        writeFile(PATH, products);
        System.out.println("Thêm mới sản phẩm thành công.");
        display();
    }

    @Override
    public void display() {
        ArrayList<Product> products = readFile(PATH);
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        ArrayList<Product> products = readFile(PATH);
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (ProductService.products.get(i).getName().equals(name)) {
                check = true;
                System.out.println(ProductService.products.get(i));
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm này trong danh sách.");
        }
    }
}
