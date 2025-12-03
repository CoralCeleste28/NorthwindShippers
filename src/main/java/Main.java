import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shipper ship = new Shipper();
        ShipperDAO shipperDAO = new ShipperDAO();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert shipper name: ");
        String newShipperName = scanner.nextLine();

        System.out.println("Enter shipper phone: ");
        String newShipperPhone = scanner.nextLine();


    }

}
