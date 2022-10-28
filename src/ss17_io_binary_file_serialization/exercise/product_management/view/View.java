package ss17_io_binary_file_serialization.exercise.product_management.view;

import ss17_io_binary_file_serialization.exercise.product_management.controller.ProductController;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        ProductController productController = new ProductController();
        productController.menuProduct();
    }
}
