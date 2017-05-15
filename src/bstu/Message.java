package bstu;
/**
 * Created by npats on 15.05.2017.
 */
public class Message {

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


