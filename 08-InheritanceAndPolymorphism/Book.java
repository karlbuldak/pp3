public class Book{
    protected String author;
    protected String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("author: " +author+" title:"+ title);
    }
}