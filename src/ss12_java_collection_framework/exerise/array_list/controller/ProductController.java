package ss12_java_collection_framework.exerise.array_list.controller;

import ss12_java_collection_framework.exerise.array_list.service.IProductService;
import ss12_java_collection_framework.exerise.array_list.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuProduct() {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====[]=====Menu=========>");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa sản phẩm theo id");
        System.out.println("3. Xóa sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm theo giá");
        System.out.println("7. Thoát");
        int choose;
        do {
            System.out.print("CHọn chức năng bạn muốn làm: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.delete();
                    break;
                case 4:
                    iProductService.display();
                    menuProduct();
                    break;
                case 5:
                    iProductService.find();
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập số có trong menu");
            }
        } while (true);
    }
}
