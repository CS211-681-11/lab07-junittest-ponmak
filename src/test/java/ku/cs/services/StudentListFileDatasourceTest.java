package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListFileDatasourceTest {

    static StudentList studentList;
    static Datasource<StudentList> datasource;

    @BeforeEach
    void setUp() {
        datasource = new StudentListFileDatasource("data", "student-list.csv");
        studentList = datasource.readData();
    }

    @Test
    void readData() {
        assertNotNull(studentList);
    }

}