package lesson01;

public class Student {
    private int id;
    private String name;
    //public String name;
    private String surname;
    private double averageGrade;

    public Student(int id, String name, String surname,
                   double averageGrade) {
        this.surname = surname;
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0)
            this.id = 666;
        else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
