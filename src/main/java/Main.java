import model.Student;

public class Main {

    public static void main(String[] args) {

        Student myFirstStudent = new Student("Paul", "Meier");
        System.out.println(myFirstStudent.getFirstname());

        Student mySecondStudent = new Student("Maria", "Mueller");
        System.out.println(mySecondStudent.getLastname());




    }


}
