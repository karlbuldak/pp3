public abstract class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message(){}
    
    public Message(String text){
        this.text=text;
    }

    public int charNumber(){
        return getText().length();
    }

    abstract void send();
}
