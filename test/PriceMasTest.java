import org.junit.Test;

import static org.junit.Assert.*;

public class PriceMasTest {
    @Test
    public void searchSubmas() {
        int a1[] = {2, 3, 4, 5, 6};
        int a2[] = {6, 7, 28, 50, -180, 41, 84, 99, 13};
        int a3[] = {11, -137, -30, -936589, 148560, 37445};
        int r1[] = {2, 3, 4, 5, 6};
        int r2[] = {41, 84, 99, 13};
        int r3[] = {148560, 37445};
        assertArrayEquals(new PriceMas().searchSubmas(a1), r1);
        assertArrayEquals(new PriceMas().searchSubmas(a2), r2);
        assertArrayEquals(new PriceMas().searchSubmas(a3), r3);
    }

}