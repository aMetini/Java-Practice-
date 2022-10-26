public class Solution2a {
    public static void main(String[]args) throws Exception {
        int a = 10;
        int b = 20;
        int s;

        //System.out.println("" + a + b);
        System.out.println("The values of intergers a and b are: " + a + " and " + b);
        s = a;
        a = b;
        b = a;
        System.out.println("The values of intergers a and b, switched, are: " + a + " and " + s);
        //System.out.println(s);

        int x = 10;
        int y = 20;

        System.out.println("The values of intergers x and y are: " + x + " and " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("The values of intergers x and y, switched, are: " + x + " and " + y);

    }
    
}
