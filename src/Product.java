import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private int price;
    private int quantity;
    private String describe;

    public Product() {
    }

    public Product(String code, String name, int price, int quantity, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", describe='" + describe + '\'' +
                '}';
    }
}
