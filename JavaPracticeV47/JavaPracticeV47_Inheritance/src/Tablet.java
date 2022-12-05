public class Tablet extends Computer {
    private String color;

    public Tablet(String brand, String modelNo, double listPrice, String color) {
        super(brand, modelNo, listPrice);
        //TODO Auto-generated constructor stub
        this.color = color;
    }

    public void tabletDetails() {
        printDetails();
        System.out.println("Tablet Color: " + color);
    }

    public void changeTabletColor() {
        color = "Mint";
        System.out.println("Your new tablet color is: " + color);
    }
    
}
