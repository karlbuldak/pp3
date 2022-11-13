public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Marchewka");
        p1.setIsVegetarian(true);
        System.out.println(p1.getName()+" "+p1.getIsVegetarian());
        System.out.println(p1);
    }
}
