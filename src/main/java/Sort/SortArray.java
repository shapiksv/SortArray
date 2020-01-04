package Sort;

public class SortArray {
    private void sort(int[] array, int firstIndex, int lastIndex){

        if(firstIndex < lastIndex){

            int partitionIndex = partition(array,firstIndex, lastIndex);
            sort(array, firstIndex, partitionIndex - 1);
            sort(array, partitionIndex +1, lastIndex);

        }
    }

    public int[] sortArray(int[] array){
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        if (firstIndex == lastIndex){
            return array;
        } else {
            sort(array, firstIndex, lastIndex);
            return array;
        }


    }

    private int partition(int[] array, int small, int big){
        int pivot = array[big];
        int index = small - 1;
        for (int i = small; i < big ; i++) {
            if(array[i] <pivot){
                index ++;

                int temporary = array[index];
                array[index] = array[i];
                array[i] = temporary;
            }
        }

        int temporary = array[index +1];
        array[index +1] = array[big];
        array[big] = temporary;

        return index +1;

    }
}
