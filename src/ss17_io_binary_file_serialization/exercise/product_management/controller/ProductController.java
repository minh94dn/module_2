package ss17_io_binary_file_serialization.exercise.product_management.controller;


import ss17_io_binary_file_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_serialization.exercise.product_management.service.IProductService;
import ss17_io_binary_file_serialization.exercise.product_management.service.ProductService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductController {
    public static void menuProduct() throws IOException {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "SH", "Honda", 100, "new"));
        ProductService.writeFile("src\\ss17_io_binary_file_serialization\\exercise\\product_management\\data\\data.dat", products);
        IProductService iProductService = new ProductService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("====[]=====Menu=========>");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm theo tên");
        System.out.println("4. Thoát");
        int choose;
        do {
            System.out.print("CHọn chức năng bạn muốn làm: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập số có trong menu");
            }
        } while (true);
    }
}
