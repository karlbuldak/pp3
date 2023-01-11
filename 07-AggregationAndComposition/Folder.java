import java.util.ArrayList;

public class Folder {
    private File file;
    private String name;
    private ArrayList<File> files;

    public Folder(String name) {
        this.files = new ArrayList<>();
        this.name = name;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public String toString() {
        String zwrot = "";
        for (File file : files) {
            zwrot += (file.getName() + " " + file.getSize() + " ");
        }
        return zwrot;
    }

    public static void main(String[] args) {
        File f1 = new File("jeden", 10);
        File f2 = new File("dwa", 120);
        File f3 = new File("trzy", 123);

        Folder folder1 = new Folder("Programy");

        folder1.addFile(f1);
        folder1.addFile(f2);

        System.out.println(folder1);

        folder1.addFile(f3);

        System.out.println(folder1);

        folder1.removeFile(f3);

        System.out.println(folder1);
    }

}
