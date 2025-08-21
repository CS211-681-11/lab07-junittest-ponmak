package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    static Student s;
    @BeforeEach
    void setUp() {
        s = new Student("6xxxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 69.5 คะแนน")
    void testAddScore(){
        s.addScore(69.5);
        assertEquals(69.5, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName(){
        s.changeName("Changed");
        assertEquals("Changed", s.getName());
    }

    @Test
    void testIsId(){
        assertTrue(s.isId("6xxxxxxxxx"));
    }

    @Test
    void testIsNameContaining(){
        assertTrue(s.isNameContains("StudentTest"));
    }

}