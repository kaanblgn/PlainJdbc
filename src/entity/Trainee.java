package entity;

public class Trainee {

    private int id;
    private String name;
    private int age;

    public Trainee() {
    }

    public Trainee(String name) {
        this.name = name;
    }
    public Trainee(int age) {
        this.age = age;
    }

    public Trainee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Trainee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
