public abstract class Food {
    private String name;
    private float price;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    public abstract void setPrice();
    public abstract void setPrice(float price);
}
