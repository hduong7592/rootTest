import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class rootTest {
    root r;
    @BeforeEach
    void setUp() {
        this.r = new root();
    }

    @AfterEach
    void tearDown() {
        this.r = null;
    }

    @org.junit.jupiter.api.Test
    void findRoots() {
        boolean result = r.findRoots(2, 4 ,2);
        assertTrue(result);

        assertEquals(-1.0, r.getRoot1());

        assertEquals(-1, r.getRoot2());

        boolean falseResult = r.findRoots(2, 2, 2);
        assertFalse(falseResult);
    }
}