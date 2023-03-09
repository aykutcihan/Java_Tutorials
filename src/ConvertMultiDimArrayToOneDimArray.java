import java.util.Arrays;

public class ConvertMultiDimArrayToOneDimArray {

        public static void main(String[] args) {
            //            Convert a 2-dimensional array to a 1-dimensional array
            //            [ [5, 3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]

            int[][] multiDimArray = { {5, 3}, {9, 8, 7} };

            // Step 1: Find the total number of elements in the multidimensional array
            int numElements = 0;
            for(int[] w : multiDimArray){
                numElements += w.length;
            }
            System.out.println("Total number of elements: " + numElements);

            // Step 2: Create a new 1-dimensional array with the same length as the number of elements in the multidimensional array
            int[] oneDimArray = new int[numElements];

            // Step 3: Transfer the elements from the multidimensional array to the 1-dimensional array
            int index = 0;
            for(int[] w : multiDimArray){
                for(int k : w){
                    oneDimArray[index] = k;
                    index++;
                }
            }
            System.out.println("1-dimensional array: " + Arrays.toString(oneDimArray));
        }


    }
