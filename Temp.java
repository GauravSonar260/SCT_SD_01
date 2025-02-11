import java.util.Scanner;

public class Temp {

    public static double celciousToFahrenheit(double celcious) {
        return (celcious + 32) * 5 / 9;

    }

    public static double celciousToKelvin(double celcious) {
        return (celcious + 273.15);
    }

    public static double fahrenheitToCelsius(double fehrenheit) {
        return (fehrenheit - 32) * 5 / 9;
    }

    public static double feherenHeightToKelvin(double fehrenheit) {
        return (fehrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelcious(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 5 / 9 + 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the temprature number");
        double temp = sc.nextDouble();

        System.out.println("enter unit of temprature want to convert ");
        System.out.println("celcious");
        System.out.println("farenheit");
        System.out.println("kelvin");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Fahrenheit: " + celciousToFahrenheit(temp));
                System.out.println("Kelvin: " + celciousToKelvin(temp));
                break;
            case 2:
                System.out.println("Celsius: " + fahrenheitToCelsius(temp));
                System.out.println("Kelvin: " + feherenHeightToKelvin(temp));
                break;
            case 3:
                System.out.println("Celsius: " + kelvinToCelcious(temp));
                System.out.println("Fahrenheit: " + kelvinToFahrenheit(temp));
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
