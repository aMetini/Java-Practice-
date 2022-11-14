public class Solution13 {
    public static void main(String[] args) throws Exception {
        int i; 
        int range = 50;
        int sumDiv7 = 0;

        for (i = 0; i <= range; i++) {
            if (i % 7 == 0) {
                sumDiv7 +=i;
            }
        }
        System.out.println("The sum of all natural numbers between 0 - 50 that are divisible by 7 is: " + sumDiv7);
    }
    
}
