import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // auto close connection
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/computers", "postgres", "12345678")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            //создаем таблицу детей (фио - пол - возраст - номер группы)
            String sql1 = "create table if not exists children (fio varchar(100) not null, " +
                    "gender varchar(1) not null, age int not null, group_id int not null)";
            PreparedStatement stmt = conn.prepareStatement(sql1);
            stmt.executeUpdate();

            // создаем таблицу групп (номер - название)
            String sql2 = "create table if not exists groups (group_id integer not null primary key," +
                    "name varchar(100) not null)";
            stmt = conn.prepareStatement(sql2);
            stmt.executeUpdate();

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Интерфейс: 1 - добавить ребенка, " +
                        "2 - удалить ребенка, 3 - добавить группу, " +
                        "4 - удалить группу, 5 - изменить данные ребенка по фио," +
                        "6 - изменить название группы по номеру, " +
                        "7 - вывести данные о группе и детях в ней по номеру");
                System.out.print("Команда: ");
                int a = sc.nextInt();
                Statement todo = conn.createStatement();

                switch (a){
                    case 1:{
                        System.out.println("Введите фио, пол, возраст и номер группы: ");
                        String fio = sc.nextLine();
                        String gen = sc.nextLine();
                        int age = sc.nextInt();
                        int num = sc.nextInt();
                        todo.executeUpdate("insert into children(fio, gender, age, group_id) values (" +
                                fio + ", " + gen + ", " + age + ", " + num + ")");
                        break;
                    }
                    case 2:{
                        System.out.println("Введите фио ребенка: ");
                        String fio = sc.nextLine();
                        todo.executeUpdate("delete from children where fio = " + fio);
                        break;
                    }
                    case 3:{
                        System.out.println("Введите номер группы и название: ");
                        int num = sc.nextInt();
                        String name = sc.nextLine();
                        todo.executeUpdate("insert into groups(group_id, name) values (" +
                                num + ", " + name + ")");
                        break;
                    }
                    case 4:{
                        System.out.println("Введите номер группы: ");
                        int fio = sc.nextInt();
                        todo.executeUpdate("delete from groups where group_id = " + fio);
                        break;
                    }
                    case 5:{
                        // change child's data
                        System.out.println("Введите фио, пол, возраст и номер группы: ");
                        String fio = sc.nextLine();
                        String gen = sc.nextLine();
                        int age = sc.nextInt();
                        int num = sc.nextInt();
                        todo.executeUpdate("update children set gen = " + gen + ", age = " + age + ", group_id = " + num +  " where fio = " + fio);
                        break;
                    }
                    case 6:{
                        // change group descr
                        System.out.println("Введите номер и новое описание группы: ");
                        int id = sc.nextInt();
                        String des = sc.nextLine();
                        todo.executeUpdate("update groups set name = " + des +  " where group_id = " + id);
                        break;
                    }
                    case 7:{
                        System.out.println("Введите номер группы: ");
                        int id = sc.nextInt();
                        ResultSet rs = todo.executeQuery("select * from children where group_id = " + id);
                        while (rs.next()) {
                            //Display values
                            System.out.print("ФИО: " + rs.getString("fio"));
                            System.out.print(", пол: " + rs.getString("gender"));
                            System.out.print(", возраст: " + rs.getInt("age"));
                            System.out.print(", группа: " + rs.getInt("group_id"));
                        }
                    }
                    default:{
                        System.out.println("Terminating..");
                        return;
                    }
                }
            }



        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}