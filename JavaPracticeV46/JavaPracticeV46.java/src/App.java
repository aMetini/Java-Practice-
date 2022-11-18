import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // //Solution 1
        // int[] arry1 = new int[10];
        // int[] arry2 = new int[10];

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

        // //Solution 5
        // int counter1 = 0;
        // int counter2 = 0;
        // ArrayList<Integer> intArray1 = new ArrayList<Integer>();
        // ArrayList<Integer> intArray2 = new ArrayList<Integer>();
        // ArrayList<Integer> intArray3;

        // do {
        //     intArray1.add(random.nextInt(1, 21));
        //     counter1++;
        // }
        // while (counter1 < 10);
        // System.out.println("First ArrayList: " + intArray1);

        // do {
        //     intArray2.add(random.nextInt(21, 41));
        //     counter2 ++;
        // }
        // while (counter2 < 10);
        // System.out.println("Second ArrayList: " + intArray2);

        // intArray1.addAll(intArray2);
        // System.out.println("First and Second ArrayLists combined is: " + intArray1);

        // intArray3 = new ArrayList<Integer>(20);

        // for(int z = 0; z < intArray2.size(); z++) {
        //     intArray3.add(intArray1.get(z));
        //     intArray3.add(intArray2.get(z));
        // }

        // System.out.println("First and Second ArrayList in alternating order: " + intArray3);

        // //Solution 6
        // int vowelCount = 0;
        // String loremIpsum = """
        //     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit,
        //     et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges:
        //     constructio interrete. Propter nos enim illam, non propter eam nosmet ipsos diligimus.
        //     Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod
        //     parvo esset natura contenta. Nulla erit controversia.
        //         """;
        // ArrayList<Character> loremChArry = new ArrayList<>(loremIpsum.chars()
        //                                     .mapToObj(e -> (char)e)
        //                                     .collect(Collectors.toList()));    

        // // ArrayList<Character> loremChArry = new ArrayList<Character>();
        // // for (char c : loremIpsum.toCharArray()) {
        // //     loremChArry.add(c);
        // // }

        // System.out.println(loremChArry);
        // //String vow = "aeiou";
        // Set<Character> vowels = new HashSet<Character>();
        // // Does not matter if you add capital letters to HashSet. Lower and uppercase are treated the same.
        // vowels.add('a');
        // vowels.add('e');
        // vowels.add('i');
        // vowels.add('o');
        // vowels.add('u');

        // // ArrayList<Character> vowels = new ArrayList<Character>();

        // // for (int j = 0; j < vow.length(); j++) {
        // //     vowels.add(vow.charAt(j));
        // // }
        // for (int i = 0; i < loremIpsum.length(); i++) {
        //     if(vowels.contains(loremIpsum.charAt(i))) {
        //         vowelCount++;
        //     }
        // }
        //     //if(vowels.contains(loremIpsum.toCharArray(i))
        //     //if(loremChArry.contains(vowels)) {
        //         //vowelCount++;
        // System.out.println(vowelCount);

        // //Solution 7
        // int n = 10;
        // ArrayList<Integer> numArry = new ArrayList<Integer>(n);

        // for (int i = 1; i <= n; i++) {
        //     numArry.add(i);
        // }
        // System.out.println("Our original integer array is: " + numArry);

        // Collections.shuffle(numArry);
        // System.out.println("Our integer array has been shuffled. Guess in which index the number 5 is located--you have 3 guesses.");
        // System.out.println("Hint: the value should be between 0 and 9.");

        // int fiveIndex = numArry.indexOf(5);
        // int i = 0;
        // int guesses = 3;
        // do {
        //     System.out.println("Please enter your guess.");
        //     int guess = sc.nextInt();
        //     if (guess == fiveIndex) {
        //         System.out.println("Congratulations! You have guessed right and won a prize! Number 5 is located at: " + fiveIndex);
        //     } else {
        //         System.out.println("Sorry, you guessed incorrectly and did not win a prize. Try again!");
        //     }
        //     i++;
        // } 
        // while (i < guesses);
        // System.out.println("The answer was: " + fiveIndex + "!");
        // System.out.println("Our shuffled array looks like this: " + numArry);

        //Solution 8
        // First create your ArrayList and fill it with random numbers using a for loop.
        int arrySize = 50;
        ArrayList<Integer> intArray = new ArrayList<>(arrySize);
        
        for (int i = 0; i < arrySize; i++) {
            intArray.add(random.nextInt((3 - 0 ) + 0));
        }
        //System.out.println(intArray);  * Printed out the array to test out my code and visually confirm correct output.
        // Use a HashMap to build and map out integers in the array with frequency that the integer appears
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        for (int i : intArray) {
            Integer freq = arrMap.get(i);
            arrMap.put(i, freq != null ? freq++ : 1);
        }
        // Determine the number with the most frequency in the array using Collections.map.  When you call the Comparator, the extra override method is auto-generated.
        Integer maxFreq = Collections.max(arrMap.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                // TODO Auto-generated method stub
                return o1.getValue().compareTo(o2.getValue());
            }
        }).getKey();
        
        System.out.println("Welcome to our game! You must bet on one number between 0 and 2. Place your bet!");
        int userBet = sc.nextInt();
        if(userBet == maxFreq) {
            System.out.println("Congratulations! You guessed correctly and won a prize");
        } else {
            System.out.println("The most frequent number is: " + maxFreq + ". Unfortunately you did not guess correctly and did not win a prize today.");
        }
        // Same if conditional statement in a ternary operator format
        final String result = userBet == maxFreq
            ? "Congratulations! You guessed correctly and won a prize"
            : "The most frequent number is: " + maxFreq + "Unfortunately you did not guess correctly and did not win a prize today.";
        
        System.out.println(result);
    }
}
