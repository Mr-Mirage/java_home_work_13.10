import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //¬водитс€ число. Ќапишите на экран сообщение
        //"я начинаю разбиратьс€ с циклами" количество раз, равное этому числу

        Scanner scanner = new Scanner(System.in);

        int finish = scanner.nextInt();
        int start = 0;

        while (start < finish) {
            System.out.println("Im starting to understand cycles");
            start++;
        }


    }
}