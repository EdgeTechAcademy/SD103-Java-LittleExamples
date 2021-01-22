public class ArrayExamples {
    public static void main(String[] args) {
        String[] grandKids = new String[6];
        grandKids[0] = "Christiaan";
        grandKids[1] = "Laura";
        grandKids[2] = "Henry";
        grandKids[3] = "Sam";
        grandKids[4] = "Casey";
        grandKids[5] = "Chauncey";

        for (int i = 0; i < grandKids.length; i++) {
            System.out.println(grandKids[i]);
        }

        int[] myArray = new int[12];
        //  put your age in position 7
        myArray[7] = 65;
        //  put your house number in position 3
        myArray[3] = 1015;
        //  put in element 0 your last digits of your ssn
        myArray[0] = 4807;
        //  in the last location put your area code
        myArray[ myArray.length-1 ] = 817;
        System.out.println("the first element of my array is " + myArray[0]);

        System.out.println("the last  element of my array is " + myArray[ myArray.length-1 ]);
    }
}
