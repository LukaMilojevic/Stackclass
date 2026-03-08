public class GenericUtils {

    /**
     * Reverses the elements of an array
     * @param array The array of generic type T to be reversed
     */
    public static <T> void reverse(T[] array){
        if(array == null || array.length <= 1){
            return;
        }
        int leftSide = 0;
        int rightSide = array.length -1;

        while(leftSide <= rightSide){
            T temp = array[leftSide];  //Put Left into a temporary holder
            array[leftSide] = array[rightSide]; //Move Right into Left's spot
            array[rightSide] = temp; //Move the holder value into Right's spot
            leftSide++; //Increasing index to the next higher until meet
            rightSide--; // decreasing to next lower until meet
        }
    }

    /**
     * Calculates the sum of all elements in an array
     * @param array Array of numbers
     * @return The sum as a double
     */
     public static <T extends Number>double sum(T[] array){
         double total = 0.0;
         if(array == null){
             return total;
         }
         for(int i =0;i<array.length;i++){
             T element = array[i]; //Element from T

             if(element != null){
                 total += element.doubleValue();
             }
         }
         return total;
     }





}
