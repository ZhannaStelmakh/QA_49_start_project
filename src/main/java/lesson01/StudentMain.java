package lesson01;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ivan",
                "Ivanov", 8.8);
        Student student2 = new Student(2, "Petr",
                "Petrov", 9.);
//        System.out.println(student1.name);
//        student1.name = "new name";
//        System.out.println(student1.name);
        System.out.println(student1.getId() + ":" + student1.getName() + ":"
                + student1.getSurname() + ":" + student1.getAverageGrade());
        System.out.println("======================================");
        printStudent(student2);
        printStudent(student1);
        System.out.println("======================================");
        student2.setId(-123);
        printStudent(student2);
    }

    private static void printStudent(Student student3) {
        System.out.println(student3.getId() + ":" + student3.getName() + ":"
                + student3.getSurname() + ":" + student3.getAverageGrade());

    }
}
