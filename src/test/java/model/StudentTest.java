package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
