package dao;

import entity.Trainee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TraineeDAO {

    private Connection db;

    public Connection getDb() {
        if (this.db == null){
            DBConnection dbConnection = new DBConnection();
            this.db = dbConnection.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

    public void createTrainee(){
        try {
            // statement
            Statement statement = this.getDb().createStatement();
            // query
            String query = "CREATE TABLE trainee (" +
                    "id serial primary key," +
                    "name varchar(255)," +
                    "age integer)";
            // execute query
            statement.executeQuery(query);
            // close connection
            this.getDb().close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertTrainee(Trainee t){
        try {
            // statement
            Statement statement = this.getDb().createStatement();
            // query
            String query = "INSERT INTO trainee(name,age) VALUES('" + t.getName() + "','" + t.getAge()+"')";
            // execute query
            statement.executeQuery(query);
            // close connection
            this.getDb().close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteTrainee(Trainee t){
        try {
            // statement
            Statement statement = this.getDb().createStatement();
            // query
            String query = "DELETE FROM trainee WHERE age = '" + t.getAge() + "';";
            // execute query
            statement.executeQuery(query);
            // close connection
            this.getDb().close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Trainee> getTraineeList() {

        List<Trainee> traineeList = new ArrayList<>();

        try {
            // query
            String query = "select * from trainee";
            // statement
            Statement statement = this.getDb().createStatement();
            // execute query - get result set
            ResultSet resultSet = statement.executeQuery(query);

            // sout each resultSet element to the console
            while(resultSet.next()){

                traineeList.add(new Trainee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age")));
            }
            // close connection
            this.getDb().close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return traineeList;
    }
}
