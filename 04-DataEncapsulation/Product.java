public class Product {
    private String name;
    private boolean isVegetarian;
    //getters
    String getName(){
        return name;
    }
    boolean getIsVegetarian(){
        return isVegetarian;
    }
    //setters
    void setName(String name){
        this.name = name;
    }
    void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }
    public String toString() {
        return("Nazwa produktu: "+getName()+"\n"+"Wegetariański?: "+getIsVegetarian());
    }
}
