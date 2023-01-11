import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    List<Product> products = new ArrayList<Product>();
    int licznik=0;
    public void add(Product product){
        products.add(products.size(),product);
    }
    public int total(){
        int quantity=0;
        for(int i=0; i<products.size(); i++){
            quantity+=products.get(i).getQuantity();
        }
        return quantity;
    }
    public String toString(){
        String nazwyproduktow="";
        for(int i=0; i<products.size(); i++){
            nazwyproduktow+=products.get(i).getName();
            if(i!=products.size()-1){
            nazwyproduktow+=",";
            }
        }
        return nazwyproduktow;
    }
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        Product p1 = new Product("makaron", 0);
        Product p2 = new Product("makaron", 10);
        sl.add(p1);
        sl.add(p2);
        System.out.println(sl.toString());
        System.out.println(sl.total());
    }
    
}
