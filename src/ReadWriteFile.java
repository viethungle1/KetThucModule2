import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeDataToFile(List<Product> list) {
        try {
            FileOutputStream fos = new FileOutputStream("product.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(){
        List<Product> list = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.csv"));)
        {
            list = (List<Product>) ois.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

}
