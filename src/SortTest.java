import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    Sort s = new Sort();

    @Test
    //Test for CheckArrayLength Method
    public void Array_Length_is_True() {
        int countInput = 5;
        int[] arr = {3, 5, 8, 90, 2};
        //Sort s = new Sort();
        assertTrue(s.CheckArrayLength(arr));
    }

    @Test
    //Test SortingAsc Method
    public void Check_If_Array_is_Sorted_Asc() {

        int[] array = {2, 6, -9, 55, 3};
        int[] sortedAsc = {-9, 2, 3, 6, 55};

        s.SortingAsc(array);
        assertArrayEquals(sortedAsc, array);
    }

    @Test
    //Test SortDesc Method
    public void Check_If_Array_is_Sorted_Desc() {

        int[] array = {3, -4, -9, 88, 12};
        int[] sortedDesc = {88, 12, 3, -4, -9};

        s.SortingDesc(array);
        assertArrayEquals(sortedDesc, array);
    }

    @Test
    //Test output for PrintArr Method
    public void Print_Array() {
        int[] array = {4, -8, -11, 11, 123};
        String x = s.PrintArr(array);
        assertEquals("[4, -8, -11, 11, 123]", x);
    }

    @Test
    //Test Array's length is greater than 3
    public void Check_Number_of_Elements(){
        int i = 3;
        //s.NumberOfElements(3);
        assertFalse(s.NumberOfElements(i));
    }
}