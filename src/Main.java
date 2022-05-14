import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Product(1,"Book","Alpha",21000,""));
            products.add(new Product(2,"Book","NhaNam",23000,""));
            products.add(new Product(3,"Pen","TL",3000,"black"));
            products.add(new Product(4,"Pen","TL",3000,"blue"));
            manage.addProductByList("manage.txt",products);
            List<Product> dataFromFile =manage.showProduct("manage.txt");
            for (Product product:
                 dataFromFile) {
                System.out.println(product);
            }
            manage.findInformation(dataFromFile,2);
//            manage.findByKey("Book");
//            manage.addProductByProduct("manage.txt",new Product(5,"Pencil","Deli",5000,""));
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
