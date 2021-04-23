public class consecutiveNumbersArray {

    public static void main(String[] args) {

        int[] exampleArray = new int[]{1, 2, 3, 5, 5, 6, 7, 8, 9, 10};
        int duplicateNumber = 0;

        for (int i = 0; i < exampleArray.length - 1; i++) {

            if (exampleArray[i] == exampleArray[i + 1]) {

                duplicateNumber = exampleArray[i];

            }
        }

        System.out.println(duplicateNumber);

    }

}


