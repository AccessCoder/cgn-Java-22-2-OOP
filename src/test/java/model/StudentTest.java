package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    @Test
    @DisplayName("test toString")
    public void toStringShouldReturnStringOfStudentObject(){

        //Given
        Student myTestStudent = new Student("Max", "Mustermann", 22);

        //When
        String actual = myTestStudent.toString();

        //Then
        String expected = "Student: Max, Mustermann";
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals(){

        //Given
        Student myFirstStudent = new Student("Max", "Mustermann", 22);
        Student mySecondStudent = new Student("Max", "Mustermann", 32);

        //When & Then
        assertEquals(myFirstStudent, mySecondStudent);

    }
    @Test
    public void testNotEquals(){

        //Given
        Student myFirstStudent = new Student("Max", "Mustermann", 22);
        Student mySecondStudent = new Student("Max", "Meier", 32);

        //When & Then
        assertNotEquals(myFirstStudent, mySecondStudent);

    }

}
