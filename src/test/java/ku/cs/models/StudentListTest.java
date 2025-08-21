package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    static StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
        studentList.addNewStudent("6000000", "test_1");
        studentList.addNewStudent("6000001", "test_2", 72.9);
    }

    @Test
    void findStudentById() {
        assertNotNull(studentList.findStudentById("6000000"));
        assertNull(studentList.findStudentById("6000002"));
    }

    @Test
    void addNewStudent() {
        studentList.addNewStudent("6000003", "test_3");
        studentList.addNewStudent("6000004", "test_4", 72.9);

        assertNotNull(studentList.findStudentById("6000003"));
        assertNotNull(studentList.findStudentById("6000004"));
    }

    @Test
    void filterByName(){
        StudentList filteredList = studentList.filterByName("test_1");

        assertEquals(1, filteredList.getStudents().size());

        filteredList = studentList.filterByName("test");
        assertEquals(2, filteredList.getStudents().size());
    }

    @Test
    void giveScoreToId(){
        studentList.giveScoreToId("6000000", 72.9);
        assertEquals(72.9, studentList.findStudentById("6000000").getScore());
    }

    @Test
    void viewGradeOfId() {
        assertEquals("B", studentList.viewGradeOfId("6000001"));
    }
}