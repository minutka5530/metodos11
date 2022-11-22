public class Main {

    public static void printLeapYear(int year, boolean LeapYear) {
        if (LeapYear){
            System.out.println("Год " + year + " высокосный");
        } else {
            System.out.println("Год " + year + " НЕвысокосный");
        }
    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 ==0 && year % 400 == 0;
    }




    public static void main (String[]args){
        // Задача 1
        int year1 = 2001;
        boolean leapYear = isLeapYear(year1);
        printLeapYear(year1,leapYear);
        // Задача 2

        int printVersion = 1;
        int productionYear = 2016;
        printInfoAboutDevice(productionYear);
        printVersion(printVersion);

        // Задача 3
        int delivery = 1;
        System.out.println(delivery(delivery) + " Количество дней для доствки");


    }
    // задача 2
    public static void printInfoAboutDevice (int productionYear ){
        if (2015>=productionYear){
            System.out.println("Установите облегченную версию");
        } else {
            System.out.println("Обычную");
        }


    }
    public static  void printVersion( int type){
        if (type == 1){
            System.out.println("android");
        } else  {
            System.out.println("IOS");
        }
    }
    // Задача 3
    public static int  delivery (int deliveryDistance){
        int minDeliveryDistance = 1;
        if ( deliveryDistance <= 20) {
            return  minDeliveryDistance;
        } else if ( deliveryDistance <= 60) {
            minDeliveryDistance++;
        } else if (deliveryDistance <= 100) {
            minDeliveryDistance+=2;
        } return minDeliveryDistance;

    }











}