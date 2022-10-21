package ss12_java_collection_framework.exerise.array_list.service;

import ss12_java_collection_framework.exerise.array_list.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Product> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Product(1, "Bàn", 50000));
        arrayList.add(new Product(2, "Ghế", 40000));
        arrayList.add(new Product(3, "Tủ", 45000));
    }

    @Override
    public void add() {
        int id = ProductService.arrayList.get(ProductService.arrayList.size() - 1).getId() + 1;
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(name, price);
        product.setId(id);
        arrayList.add(product);
    }

    @Override
    public void edit() {
        System.out.print("Nhập id sản phẩm cần sửa chữa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == ProductService.arrayList.get(i).getId()) {
                System.out.print("Nhập tên sản phẩm mới: ");
                ProductService.arrayList.get(i).setName(scanner.nextLine());
                System.out.print("Nhập giá mới: ");
                ProductService.arrayList.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Đã sủa thành công");
            display();
        } else {
            System.out.println("Không có sản phẩm này trong danh sách");
        }
    }

    @Override
    public void delete() {
        System.out.print("Nhập id sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == ProductService.arrayList.get(i).getId()) {
                check = true;
                System.out.print("Bạn có chắc muốn xóa sản phầm này không ??? " + ProductService.arrayList.get(i).getName()
                        + "\n1. Có\n" + "0. Không");
                System.out.print("\nChọn 1 hoặc 0: ");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    arrayList.remove(ProductService.arrayList.get(i));
                    System.out.println("Đã xóa thành công");
                    display();
                } else if (choose == 0) {
                    display();
                } else {
                    System.out.print("Hãy chọn 1 hoặc 0: ");
                }
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm này trong danh sách");
        }
    }

    @Override
    public void display() {
        for (Product product : arrayList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (ProductService.arrayList.get(i).getName().equals(name)) {
                check = true;
                System.out.println(ProductService.arrayList.get(i));
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm này trong danh sách");
        }
    }

    @Override
    public void sort() {
        ProductService.arrayList.sort(Comparator.comparing(Product::getPrice));
        display();
    }
}
