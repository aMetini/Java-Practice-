public class Solution16 {
    public static void main(String[] args) throws Exception {
        double arrayOfGrades[] = {95.5, 85.5, 55.5};
        // double[] arrayOfGrades = new double[3];
        // arrayOfGrades[0] = 95.5;
        // arrayOfGrades[1] = 85.5;
        // arrayOfGrades[2] = 55.5;

        int i;
        double sum = 0;
        double average = 0;
        boolean hasPassed = false;

        for (i = 0; i < arrayOfGrades.length; i++) {
            sum += arrayOfGrades[i];
            average = sum / arrayOfGrades.length; 
        }
        if (average >= 60.0) {
            hasPassed = true;
        }
        System.out.println("The average in the array of grades is: " + average);
        System.out.println("The student has passed this course is: " + hasPassed);
    }
    
}
