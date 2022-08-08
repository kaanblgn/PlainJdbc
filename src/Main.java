import dao.TraineeDAO;
import entity.Trainee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TraineeDAO traineeDAO = new TraineeDAO();

        traineeDAO.createTrainee();
        traineeDAO.insertTrainee(new Trainee("kaan",24));
        traineeDAO.deleteTrainee(new Trainee(24));
        List<Trainee> traineeList = traineeDAO.getTraineeList();

        System.out.println("id" + " name " + "age");
        for (int i = 0; i < traineeList.size() ; i++) {
            System.out.println(traineeList.get(i).getId() + " " + traineeList.get(i).getName() + " " + traineeList.get(i).getAge());
        }
    }

//    public static void createTable(){
//        try {
//
//            // query
//            String query = "CREATE TABLE trainee (" +
//                    "id integer primary key," +
//                    "name varchar(255)," +
//                    "age integer)";
//            // statement
//            Statement statement = connection.createStatement();
//            // execute query
//            statement.executeQuery(query);
//            // close connection
//            connection.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void insertData(){
//        try {
//            // load class
//            Class.forName("org.postgresql.Driver");
//            // connection
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","TesstPsqlPass123");
//            // query
//            String query = "INSERT INTO trainee(name,age) VALUES ('ahmet',21);" +
//                    "INSERT INTO trainee(name,age) VALUES ('mehmer',22);";
//            // statement
//            Statement statement = connection.createStatement();
//            // execute query
//            statement.executeQuery(query);
//            // close connection
//            connection.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void readData(){
//        try {
//            // load class
//            Class.forName("org.postgresql.Driver");
//            // connection
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","TesstPsqlPass123");
//            // query
//            String query = "select * from trainee";
//            // statement
//            Statement statement = connection.createStatement();
//            // execute query - get result set
//            ResultSet resultSet = statement.executeQuery(query);
//
//            // sout each resultSet element to the console
//            while(resultSet.next()){
//                System.out.println(
//                        "id:" + resultSet.getInt("id") + ", " +
//                                "name:" + resultSet.getString("name") + ", " +
//                                "age:" + resultSet.getInt("age"));
//            }
//
//            // close connection
//            connection.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void deleteData(){
//        try {
//            // load class
//            Class.forName("org.postgresql.Driver");
//            // connection
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","TesstPsqlPass123");
//            // query
//            String query = "DELETE FROM trainee WHERE age = '22';";
//            // statement
//            Statement statement = connection.createStatement();
//            // execute query
//            statement.executeQuery(query);
//            // close connection
//            connection.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

}
