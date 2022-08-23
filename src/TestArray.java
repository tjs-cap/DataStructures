public class TestArray {
    public static void main(String[] args) {

        //Setting up 3 arrays of different types where the second index of each array is null
        //Array of Strings
        String[] myList1 = new String[4];
        myList1[0] = "1.9";
        myList1[2] = "3.4";
        myList1[3] = "3.5";
        for (int i = 0; i < myList1.length; i++) {
            System.out.println(myList1[i]);
        }

        //Array of Strings
        String[] myList2 = {"1.9", null, "3.4", "3.5"}; //As above
        for (int i = 0; i < myList2.length; i++) {
            System.out.println(myList2[i]);
        }

        //Array of doubles
        double total = 0;
        double[] myList3 = {1.9, 0, 3.4, 3.5}; //As above as a double
        for (int i = 0; i < myList3.length; i++) {
            System.out.println(myList3[i]);
            total = total + myList3[i];
        }
        System.out.println("Total of all values in the array are " + total);

        //Using a nested for loop with a 2-dimensional array
        int[][] a = { {1,-2,3},{-4,-5,6,9},{7} };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        // Using foreach with a 1-dimensional array
        double[] myList = {1.9,2.9,3.4,3.5};
        for (double item: myList){
            System.out.println(item);
        }

        // Using foreach with a 2-dimensional array
        int[][] arr = { {1,-2,3},{-4,-5,6,9},{7} }; //where arr is the name of the array
        for (int[] arrRow: arr) { //loop around the main array
            for (int arrColumn : arrRow) { //looping through each sub-array
                System.out.print(arrColumn + " ");
            }
            System.out.println(".");
        }
    }
}
