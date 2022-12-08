public class Computer {
    private String make;
    private String model;
    protected static double price;

    public Computer(String brand, String modelNo, double listPrice) {
        make = brand;
        model = modelNo;
        price = listPrice;
    }

    public void printDetails() {
        System.out.println("Here are the details of your product: ");
        System.out.println("Manufacturer: " + make);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    
}

