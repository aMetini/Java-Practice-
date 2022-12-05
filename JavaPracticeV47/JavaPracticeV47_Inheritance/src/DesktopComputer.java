public class DesktopComputer extends Computer {
    private String hardDisk;

    public DesktopComputer(String brand, String modelNo, double listPrice, String hardDiskSpace) {
        super(brand, modelNo, listPrice);
        //TODO Auto-generated constructor stub
        hardDisk = hardDiskSpace;
    }

    public void desktopComputerDetails() {
        printDetails();
        System.out.println("Hard disk space: " + hardDisk);
    }

    public void convertPriceToEuro() {
        double priceEuro = Computer.price / 10.89;
        System.out.println("The price of this computer in euro is " + String.format("€%, .2f", priceEuro)  + ".");
    }
    
}
