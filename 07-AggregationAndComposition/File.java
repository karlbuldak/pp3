public class File {
    private String name;
    private float size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public File(String name, float size) {
        this.name = name;
        this.size = size;
    }

}
