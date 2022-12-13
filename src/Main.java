import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        checkLeapYearAndPrint(2012);
        checkLeapYearAndPrint(2022);

        // Разделитель
        System.out.println();

        // Задача 2
        checkDevice(0, 2015);
        checkDevice(1, 2022);
        checkDevice(3, 2022); // Ошибка

        // Разделитель
        System.out.println();

        // Задание 3
        System.out.println("Потребуется дней: " + calcDeliveryDays(15));
        System.out.println("Потребуется дней: " + calcDeliveryDays(55));
        System.out.println("Потребуется дней: " + calcDeliveryDays(95));
        System.out.println("Потребуется дней: " + calcDeliveryDays(105));
    }

    public static void checkLeapYearAndPrint(int year){

        boolean leap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;

            } else {
                leap = true;
            }
        }

        if (leap){
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void checkDevice(int os, int year){

        int currentYear = LocalDate.now().getYear();

        String osName = switch (os) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "Unknown";
        };

        if (osName.equals("Unknown")){
            System.err.println("Неверный тип ОС");
            return;
        }

        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке");
        }
    }

    public static int calcDeliveryDays(int distance){

        int days = 0;

        if (distance < 20){
            days = 1;
        } else {
            days = ((distance + 20) / 40) + 1;
        }

        return days;
    }
}