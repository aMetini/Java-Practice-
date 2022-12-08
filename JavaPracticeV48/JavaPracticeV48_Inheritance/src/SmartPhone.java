public class SmartPhone extends Computer {
    private String dimensions;

    public SmartPhone(String brand, String modelNo, double listPrice, String dimensions) {
        super(brand, modelNo, listPrice);
        //TODO Auto-generated constructor stub
        this.dimensions = dimensions;
    }

    public void smartPhoneDetails() {
        printDetails();
        System.out.println("Dimensions: " + dimensions);
    }

    public void ringSmartPhone() {
        System.out.println("Your smart phone is ringing: ring! ring!");
    }
    
}
