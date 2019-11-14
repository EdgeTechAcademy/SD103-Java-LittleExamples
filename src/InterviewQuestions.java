public class InterviewQuestions {
    public static void main(String[] args) {

        int treeSize = Utils.getNumber("How tall is the tree? ");
        printTree(treeSize);

        int[] numbers = randomArray(20, 100);
        int largest = findLargestNum(numbers);
        int smallest = findSmallestNum(numbers);
        int secondLargest = find2ndLargestNum(numbers);
        int secondSmallest = find2ndSmallestNum(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(largest + " > " + secondLargest + " > " + secondSmallest + " > " + smallest);
    }

    //    A.	Given an array of integers find the largest, smallest average.
    public static int findLargestNum(int[] ar) {
        int largest = ar[0];
        for (int i : ar) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public static int findSmallestNum(int[] ar) {
        int smallest = ar[0];
        for (int i : ar) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    //    B.	Given an array of integers find the second largest and the second smallest.
    public static int find2ndLargestNum(int[] ar) {
        int largest, secondLargest;
        largest = secondLargest = ar[0];
        for (int i : ar) {
            if (i >= largest) {
                if (largest > secondLargest) {
                    secondLargest = largest;
                }
                largest = i;
            }
            if (i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static int find2ndSmallestNum(int[] ar) {
        int smallest, secondSmallest;
        smallest = secondSmallest = ar[0];
        for (int i : ar) {
            if (i <= smallest) {
                smallest = i;
            } else if (i < secondSmallest) {
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    //    C.	Given an array of integers return the total of all values.
    public static int sum(int[] ar) {
        int total = 0;
        for (int i : ar) {
            total += i;
        }
        return total;
    }

    //    D.	Given an array of integers return count of numbers > some value.
    public static int howManyGreaterThan(int[] ar, int max) {
        int count = 0;
        for (int i : ar) {
            if (i > max) {
                count++;
            }
        }
        return count;
    }

//    E.	Given an array of strings find the longest string.

//    F.	Given a string create an array of the words in the string.

    //    G.	Given a number print a square with that as the length and width of the sides.
//        * * * * * *       int side = 6;
//        *         *
//        *         *
//        *         *
//        *         *
//        * * * * * *
    public static void drawBox(int size) {
        for (int i = 0; i < size; i++) {    //  top row of the box
            System.out.print("* ");         //  *******************
        }
        System.out.println();               //  kick out a new line

        for (int r = 0; r < size - 2; r++) {  //  We need to print out size-2 middle rows
            System.out.print("* ");              //  print the left border
            for (int i = 0; i < size - 2; i++) {  //  >                 <
                System.out.print("  ");          //  print out the spaces in between
            }
            System.out.println("*");            //  print the right border
        }

        for (int i = 0; i < size; i++) {    //  this is the bottom row of the box
            System.out.print("* ");         //  *******************
        }
    }


//    H.	Given a number print a tree shape.
//              *       int howTall = 4;
//             ***
//            *****
//           *******

    public static void printTree(int height) {
        for (int row = 1; row <= height; row++) {
            //   print spaces to pad to the left of the tre
            //  limb 1 print height - 1 spaces
            //  limb 2 print height - 2 spaces
            for (int spaces = 0; spaces < height - row; spaces++) {
                System.out.print(" ");
            }

            //  print *s to create the tree
            for (int stars = 0; stars < row * 2 - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
//    I.	Given a string convert to an array words print words within a box.
//            *********       String str = “Let’s do this!;
//            * Let’s *
//            * do    *		// create word array to determine number of rows
//            * this! *		// find the longest string to determine width
//            *********

//    J.	Given a string with a person’s name return a string of their initials
//    K.	Given two numbers, find the largest, print the numbers from max to min.
//    L.	Given a string print the individual characters front to back and back to front.
//    M.	Given a string reverse it..ti esrever gnirts a neviG
//    N.	Given a string capitalize each word and print out.
//    O.	Create an Enum class for the Planets in the Solar System.
//    P.	Given a Planet return the distance from the Sun. (Use your Planet Enum)
//    Q.	Create a Class for a Shoe. Must have at least 4 properties.
//    R.	Create a base class with 3 properties, create a child class from that base class
//    S.	Given a temperature return the type of clothing you should wear.
//    T.	Given a distance in miles convert to kilometers.
//    U.	Given a number calculate the date that many days in the future.
//    V.	Loop 0 to 100, print Fizz if divisible by 3, Buzz if divisible by 5 and # otherwise
//    W.	Find the sum of all the multiples of 3 or 5 below 1000.
//    X.	Given two coordinates {x1, y1} and {x2, y2} what is the distance between them
//    Y.	Give the center coordinate of a circle {x, y} and the radius r, determine if a point {x1, y1} is inside the circle. (distance from x,y is < r)
//    Z.	Read a file from your hard drive and print the contents

    public static int[] randomArray(int size, int max) {
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = (int) (Math.random() * max);
        }
        return ar;
    }
}