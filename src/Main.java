import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm kiếm sản phẩm có giá đắt nhất");
            System.out.println("7. Đọc từ file");
            System.out.println("8. Ghi vào file");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---DANH SÁCH---");
                    for (Product i : list) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    System.out.println("---THÊM MỚI---");
                    list.add(Controller.createNewProduct());
                    break;
                case 3:
                    System.out.println("---CẬP NHẬT---");
                    System.out.println("Nhập mã sản phẩm cần cập nhật");
                    String code1 = Controller.inputString();
                    for (Product i : list) {
                        if (i.getCode().equals(code1)) {
                            System.out.println("Sửa mã sản phẩm");
                            String code2 = Controller.inputString();
                            i.setCode(code2);
                            System.out.println("Sửa tên");
                            String name = Controller.inputString();
                            i.setName(name);
                            System.out.println("Sửa giá");
                            int price = Controller.inputInt();
                            i.setPrice(price);
                            System.out.println("Sửa số lượng");
                            int quantity = Controller.inputInt();
                            i.setQuantity(quantity);
                            System.out.println("Sửa mô tả");
                            String describe = Controller.inputString();
                            i.setDescribe(describe);
                        }
                    }
                    break;
                case 4:
                    System.out.println("---XÓA SẢN PHẨM---");
                    System.out.println("Nhập mã sản phẩm cần xóa");
                    String code5 = Controller.inputString();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getCode().equals(code5)) {
                            list.remove(list.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("---SẮP XẾP---");
                    System.out.println("1. Sắp xếp tăng dần");
                    System.out.println("2. Sắp xếp giảm dần");
                    System.out.print("Chọn chức năng: ");
                    int selected = Controller.inputInt();
                    switch (selected) {
                        case 1:
                            Controller.sortByPrice(list);
                            break;
                        case 2:
                            Controller.sortByPrice2(list);
                            break;
                    }
                case 6:
                    System.out.println("---SẢN PHẨM CÓ GIÁ CAO NHẤT---");
                    Controller.sortByPrice2(list);
                    System.out.println(list.get(0));
                    break;
                case 7:
                    System.out.println("---ĐỌC TỪ FILE----");
                    List<Product> readData = ReadWriteFile.readDataFromFile();
                    for (Product i : readData) {
                        System.out.println(i);
                    }
                    break;
                case 8:
                    System.out.println("---GHI VÀO FILE---");
                    readData = ReadWriteFile.readDataFromFile();
                    ReadWriteFile.writeDataToFile(list);
                    break;
                case 9:
                    System.exit(0);
                }
            }
        }
    }