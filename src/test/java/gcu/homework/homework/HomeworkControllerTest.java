package gcu.homework.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HomeworkControllerTest {

    private Homework homework = new Homework();

    @Test
    public void testHello() {
        assertEquals("Hello!", homework.hello());
    }

    @Test
    public void testSelfIntroductions() {
        assertNotNull(homework.selfIntroductions("heykakao", 1));
    }

    @Test
    public void testContact() {
        assertNotNull(homework.contact("010-1004-1004"));
    }

    @Test
    void welcome() {
    }

    @Test
    void hello() {
    }

    @Test
    void selfIntroductions() {
    }

    @Test
    void phone() {
    }
}
