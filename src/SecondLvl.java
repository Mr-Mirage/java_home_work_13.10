import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //� ��������� �������� 1 �����. �������� �� ����� ��� ���������, ��������� ���� while

        Scanner scanner = new Scanner(System.in);

        int finish = scanner.nextInt();
        int start = 1;
        int count = 0;

        while (count < finish) {

            count++;
            start = count * start;
        }
        System.out.println(start);

    }
}
