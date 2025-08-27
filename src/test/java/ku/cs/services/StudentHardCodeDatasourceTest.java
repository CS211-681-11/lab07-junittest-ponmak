package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    static StudentList studentList;
    @BeforeEach
    void setUp() {
        StudentHardCodeDatasource studentHardCodeDatasource = new StudentHardCodeDatasource();
        studentList = studentHardCodeDatasource.readData();
    }

    @Test
    void isCreated(){
        assertNotNull(studentList);
    }

}