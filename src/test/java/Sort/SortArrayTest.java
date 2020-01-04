package Sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayTest {
    SortArray sortArray;

    @Before
    public void setUp() throws Exception {
        sortArray = new SortArray();

    }

    @Test
    public void sortArray() {
        //case 1 if the array contains one value
        int[] arr1 = {2};
        int[] expectedResult1 = {2};
        int[] actualRsult1 = sortArray.sortArray(arr1);
        assertArrayEquals(expectedResult1,actualRsult1);

        // case 2 if the array contains positive numbers
        int[] arr2 = {10, 36, 2, 7365, 7, 94, 943, 12, 10};
        int[] expectedResult2 = {2, 7, 10, 10, 12, 36, 94, 943, 7365};
        int[] actualRsult2 = sortArray.sortArray(arr2);
        assertArrayEquals(expectedResult2,actualRsult2);

        // case 3 if the array contains negative numbers
        int[] arr3 = {-10, -36, -2, -7365, -7, -94, -943, -12, -10};
        int[] expectedResult3 = {-7365, -943, -94, -36, - 12, -10, -10, -7, -2 };
        int[] actualRsult3 = sortArray.sortArray(arr3);
        assertArrayEquals(expectedResult3,actualRsult3);

        // case 3 if the array contains negative and positive numbers
        int[] arr4 = {10, 36, 2, 7365, 7, -94, -943, -12, -10};
        int[] expectedResult4 = {-943, -94, - 12, -10, 2, 7 , 10, 36, 7365};
        int[] actualRsult4 = sortArray.sortArray(arr4);
        assertArrayEquals(expectedResult4,actualRsult4);
    }
}