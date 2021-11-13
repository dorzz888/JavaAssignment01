import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void Array_Length_is_True() {
        int countInput = 5;
        int[] arr = {3, 5, 8, 90, 2};
       //Sort s = new Sort();

        assertTrue(Sort.CheckArrayLength(arr));
    }

    @Test
    public void Check_If_Array_is_Sorted() {

        int[] array = {2, 6, -9, 55, 3};
        int[] sorted = {-9, 2, 3, 6, 55};

        Sort.SortingAsc(array);
        assertArrayEquals(sorted, array);
    }

}