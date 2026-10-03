import java.util.Scanner;

public class RooftopSolarEnergy2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double energyGenerated = sc.nextDouble();
        System.out.println("enter the Energy generated in kWh");
        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        sc.close();
    }

}