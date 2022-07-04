import model.Student;

public class Main {

    public static void main(String[] args) {

        Student myFirstStudent = new Student("Paul", "Meier", 30);

        Student mySecondStudent = new Student("Paul", "Meier", 32);

        System.out.println(mySecondStudent.equals(myFirstStudent));

    }


}
