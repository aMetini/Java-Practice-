import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // //Solution 1
        // int[] arry1 = new int[10];
        // int[] arry2 = new int[10];
        Random random = new Random();

        // for (int i = 0; i < arry1.length; i++) {
        //     arry1[i] = random.nextInt(21);
        //     Arrays.sort(arry1);
        // }

        // for (int i = 0; i < arry2.length; i++) {
        //     arry2[i] = random.nextInt(21);
        //     System.out.println(arry2[i]);
        //     Arrays.fill(arry2, 12);
        // }
        // System.out.println(Arrays.toString(arry1));
        // System.out.println(Arrays.toString(arry2));

        //Solution 2

        // //Solution 3
        // ArrayList<Integer> numArray = new ArrayList<Integer>();

        // for (int i = 0; i < 15; i++) {
        //     numArray.add(random.nextInt(1, 11));
        // }
        // if (numArray.indexOf(1) <= numArray.indexOf(2) && numArray.contains(1)) {
        //     System.out.println("Number 1 is before number 2 in the array at index: " + numArray.indexOf(1));
        // }
        // else {
        //     System.out.println("Number 1 does not appear before number 2 in our array.");
        // }
        // System.out.println(numArray);

        // //Solution 4
        // int i = 1;
        // ArrayList<Integer> intArr = new ArrayList<Integer>();

        // while (i < 10) {
        //     intArr.add(random.nextInt(1, 21));
        //     i++;
        // }
        // System.out.println(intArr);

        // if (intArr.contains(5)) {
        //     System.out.println("This array contains a number 5. This number appears " +
        //                             Collections.frequency(intArr, 5) + " time(s).");
        // }
        // else {
        //     System.out.println("This array does not contain the number 5.");
        // }

        //Solution 5
        int counter1 = 0;
        int counter2 = 0;
        int i = 0;
        int j = 0;
        ArrayList<Integer> intArray1 = new ArrayList<Integer>();
        ArrayList<Integer> intArray2 = new ArrayList<Integer>();
        ArrayList<Integer> intArray3; // = new ArrayList<Integer>();

        do {
            intArray1.add(random.nextInt(1, 21));
            counter1++;
        }
        while (counter1 < 10);
        System.out.println("First ArrayList: " + intArray1);

        do {
            intArray2.add(random.nextInt(21, 41));
            counter2 ++;
        }
        while (counter2 < 10);
        System.out.println("Second ArrayList: " + intArray2);

        // intArray1.addAll(intArray2);
        // System.out.print(intArray1);
        intArray3 = new ArrayList<Integer>(intArray1);

        // while (i < intArray1.size()) {
        //     intArray3.get(0) = intArray1.get(0);
        // }

        System.out.println(intArray3);

    

        // while (i < intArray1.size() && j < intArray2.size()) {
        //     intArray3.add(intArray2.get(j));

        //     intArray3.add(intArray1.get(i));

        //     i++;
        //     j++;
        // }

        // while (i < intArray1.size()) {
        //     intArray3.add(intArray1.get(i));
        //     i++;
        // }

        // while (j < intArray2.size()) {
        //     intArray3.add(intArray2.get(j));
        //     j++;
        // }
        // System.out.println();
        // System.out.println("Merged ArrayList is: ");

        // iterator
    }
}
