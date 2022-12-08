class Laptop extends Computer {
  
// Private field
    private String screenSize;
    //private double listPrice;

    public Laptop(String brand, String modelNo, double listPrice, String screenSize) {
        super(brand, modelNo, listPrice);
        //TODO Auto-generated constructor stub
        this.screenSize = screenSize;
    }

    public void laptopDetails() {
        printDetails();
        System.out.println("Screen size: " + screenSize);
    }

    public void convertPriceToUSD() {
        double priceUSD = Computer.price / 10.29;
        System.out.println("Price in USD: " + String.format("$%,.2f", priceUSD));
    }
    
}