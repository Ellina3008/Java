import java.util.Date;

public class Save {
    private final String img;
    private final Date date;

    public Save(String img) {
        this.img = img;
        this.date = new Date();
    }

    public String getImg() {
        return img;
    }

    public Date getDate() {
        return date;
    }
}
