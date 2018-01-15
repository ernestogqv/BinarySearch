import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testSearch(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        BinaryArray alpha = new BinaryArray(list);
        assertEquals(alpha.search(3), 2);
        assertEquals(alpha.search(1), 0);
        assertEquals(alpha.search(6), 5);
    }
}
