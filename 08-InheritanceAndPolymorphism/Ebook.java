public class Ebook extends Book {
    private String filename;

    public Ebook(String author, String title, String filename){
        super(author, title);
        this.filename=filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void display(){
        System.out.println("author: "+author+" title: "+ title+" filename: "+filename);
    }

}
