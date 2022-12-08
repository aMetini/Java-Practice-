public class App {
    public static void main(String[] args) throws Exception {
        Laptop macBook = new Laptop ("Apple", "MacBook Pro", 21990.01, "14 inches"); //creation of car Object
        macBook.laptopDetails(); //calling method to print details
        macBook.convertPriceToUSD();
        System.out.println();

        SmartPhone samsungGalaxy = new SmartPhone("Samsung", "Galaxy S20 FE 5G", 7690.01, "159.8 x 74.5 x 8.4");
        samsungGalaxy.smartPhoneDetails();
        samsungGalaxy.ringSmartPhone();
        System.out.println();

        Tablet iPad = new Tablet("Apple", "10th Generation", 6595.01, "black");
        iPad.tabletDetails();
        iPad.changeTabletColor();
        System.out.println();

        DesktopComputer hpDesktop = new DesktopComputer("HP", "Pavillion 27-ca1087no Bundle AiO PC", 15990.01, "1 TB SSD");
        hpDesktop.desktopComputerDetails();
        hpDesktop.convertPriceToEuro();
        System.out.println();    
    }
}
