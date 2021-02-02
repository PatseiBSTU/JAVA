package bstu;

public class Message {

// 2 february N/V/ Patsei
 
	private String name;


    private Integer id;
    private String text = "";
    public Message() {        }
    public Message(Integer id, String text)
    {       this.id = id;
    this.text = text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Message [id=" + id + ", text=" + text + "]";
    }
}


