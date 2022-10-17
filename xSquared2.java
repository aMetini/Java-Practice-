import java.util.Scanner;

// Main class
class xSquared2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
            System.out.println("Let's draw a box. Please enter the height of your box.");
            int xHeight = input.nextInt();

            System.out.println("Please enter the width of your box.");
            int yWidth = input.nextInt();
            
            drawbox(xHeight, yWidth);
    }
    
    static void drawbox(int xHeight, int yWidth) 
    {
        // Outer loop (box rows)
        for (int i = 1; i <= xHeight; i++) {
            // Inner loop (box columns)
            for (int j = 1; j <= yWidth; j++) {
                if (i == 1 || i == xHeight || j == 1 || j == yWidth)
                System.out.print("X");
                else 
                System.out.print(" ");  
            }
            System.out.println();
        }
        
    }
}
    
