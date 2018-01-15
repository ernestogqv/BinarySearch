import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testSearch(){
        BinarySearch alpha = new BinarySearch();
        alpha.add(4);
        alpha.add(1);
        alpha.add(3);
        alpha.add(7);
        alpha.add(5);
        alpha.add(6);
        alpha.add(2);
        assertEquals(alpha.search(1), 0);
        assertEquals(alpha.search(2), 1);
        assertEquals(alpha.search(3), 2);
        assertEquals(alpha.search(4), 3);
        assertEquals(alpha.search(5), 4);
        assertEquals(alpha.search(6), 5);
        assertEquals(alpha.search(7), 6);
    }
}
