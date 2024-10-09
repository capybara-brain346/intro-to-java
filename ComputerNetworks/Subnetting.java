package ComputerNetworks;

import java.util.Scanner;

public class Subnetting {

    static String getSubnet(String address) {
        String[] addressSplit = address.split("\\.");

        if (Integer.parseInt(addressSplit[0]) >= 1 && Integer.parseInt(addressSplit[0]) <= 126) {
            return "Class A\nMask: 255.0.0.0";
        } else if (Integer.parseInt(addressSplit[0]) >= 127 && Integer.parseInt(addressSplit[0]) <= 191) {
            return "Class B\nMask: 255.255.0.0";
        } else if (Integer.parseInt(addressSplit[0]) >= 192 && Integer.parseInt(addressSplit[0]) <= 223) {
            return "Class C\nMask: 255.255.255.0";
        } else {
            return "Invalid IPv4 address";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String address = input.nextLine();
        String subnetMask = getSubnet(address);
        System.out.println(subnetMask);
    }
}
