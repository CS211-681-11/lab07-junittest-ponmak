package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {

    static StudentList studentList;
    static Datasource<StudentList> datasource;

    @BeforeEach
    void setUp() {
        datasource = new StudentListFileDatasource("data", "student-list.csv");
        studentList = datasource.readData();
    }

    void readData() {
        assertNotNull(studentList);
    }

}