import java.util.*;

public class Controller {
//    public static List<Product> list = new ReadWriteFile().readFile();
//    public static List<Product> list = new ArrayList<>();
//    public static void addProduct() {
//        list.add(createNewProduct());
//        new ReadWriteFile().writeFile(list);
//    }
//    public static void editByCode() {
//        System.out.println("Nhập mã sản phẩm cần cập nhật");
//        String code = Controller.inputString();
//        editProduct(code);
//        new ReadWriteFile().writeFile(list);
//    }
//    public static void removeByCode() {
//        removeProduct();
//        new ReadWriteFile().writeFile(list);
//    }
//    public static void sortUp() {
//        sortByPrice(list);
//        new ReadWriteFile().writeFile(list);
//    }
//    public static void sortDown() {
//        sortByPrice2(list);
//    }
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
//    public static void showList() {
//        for (Product i : list) {
//            System.out.println(i);
//        }
//    }
    public static Product createNewProduct () {
        System.out.println("Mã sản phẩm");
        String code = inputString();
        System.out.println("Tên");
        String name = inputString();
        System.out.println("Giá");
        int price = inputInt();
        System.out.println("Số lượng");
        int quantity = inputInt();
        System.out.println("Mô tả");
        String describe = inputString();
        Product product = new Product(code,name,price,quantity,describe);
        return product;
    }
//    public static void editProduct(String inputCode) {
//        for (Product i : list) {
//            if (i.getCode().equals(inputCode)) {
//                System.out.println("Sửa mã sản phẩm");
//                String code = inputString();
//                i.setCode(code);
//                System.out.println("Sửa tên");
//                String name = inputString();
//                i.setName(name);
//                System.out.println("Sửa giá");
//                int price = inputInt();
//                i.setPrice(price);
//                System.out.println("Sửa số lượng");
//                int quantity = inputInt();
//                i.setQuantity(quantity);
//                System.out.println("Sửa mô tả");
//                String describe = inputString();
//                i.setDescribe(describe);
//            }
//        }
//    }
    public static void removeProduct(){
        System.out.println("Nhập mã sản phẩm cần xóa");
        String code = inputString();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getCode().equals(code)) {
//                list.remove(list.get(i));
//            }
//        }
    }
    public static void sortByPrice(List<Product> list) {
        Comparator<Product> comparator = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        };
        Collections.sort(list,comparator);
    }
    public static void sortByPrice2(List<Product> list) {
        Comparator<Product> comparator = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice()-o1.getPrice();
            }
        };
        Collections.sort(list,comparator);
    }

}
