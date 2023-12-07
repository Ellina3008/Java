public class Main {
    public static void main(String[] args) throws InterruptedException {
        Img img = new Img();
        GitHub gitHub = new GitHub();

        img.setImgAndDate("Круг");

        System.out.println(img);

        gitHub.setSave(img.save());

        Thread.sleep(5000);

        img.setImgAndDate("Квадрат");

        System.out.println(img);

        img.load(gitHub.getSave());

        System.out.println(img);
    }
}