public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
//    первый метод
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
// второй метод
    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
//третий метод
    public static void printColor(){
        int value = 0;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100){
            System.out.println("Жёлтый");
        }
        if (value > 100){
            System.out.println("Зелёный");
        }
    }
//четвёртый метод
    public static void compareNumbers(){
        int a = 50;
        int b = 30;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
