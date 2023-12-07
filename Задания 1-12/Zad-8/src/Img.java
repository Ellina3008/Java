import java.util.Date;

public class Img {
    private String Img;
    private Date date;

    public void setImgAndDate(String img){
        this.Img = img;
        this.date = new Date();
    }

    public Save save(){
        return new Save(Img);
    }

    public void load(Save save){
        Img = save.getImg();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Img{" +
                "Img='" + Img + '\'' +
                ", date=" + date +
                '}';
    }
}
