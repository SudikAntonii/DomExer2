import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import javax.security.auth.Subject;
import java.lang.reflect.Array;

/**
 * Created by FYNJY on 09.11.2018.
 */
public class DomExer {
    public static void main(String[] args) {
    /* TaskOne();

    TaskTwo();

    TaskThree();

    TaskFour();

    valuesCompare(float firstValue, float secondValue, float thirdValue);

    TaskSix();

    TaskSeven();

    TaskEight();

    TaskNine();

    TaskTen();

    TaskEleven();

    TaskTwelve();

    TaskThirteen();

    TaskFourteen();

    TaskFifteen();

    TaskSixteen();

    TaskSeventeen();

    TaskEighteen();

    TaskNineteen();
    */
    }

    public static void TaskOne() {
        int a = (int) (Math.random() * 10);
        int S;
        S = a * a;
        System.out.println("Task1: ");
        System.out.println("Площадь квадрата равна " + a + " см");
    }

    public static void TaskTwo() {
        int V1 = 150;
        int V2 = 180;
        int T = 2;
        int S = (int) Math.abs((V1 + V2) * T);
        System.out.println("Task2: ");
        System.out.println("Расстояние = " + S);
    }

    public static void TaskThree() {
        int A = 24;
        int B = 48;
        int C = -15;
        int x = 0;

        int Uravnenie = ((A * x * x) + (B * x) + C);
        int D = ((B * B) - 4 * A * C);
        int x1 = (((-B + (int) Math.sqrt(D)) / (2 * A)));
        int x2 = (((-B - (int) Math.sqrt(D)) / (2 * A)));
        System.out.println("Task3: ");
        if (D > 0) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println("Корней нет!");
        }


    }

    public static void TaskFour() {
        int i = (int) (Math.random() * 100);
        System.out.println("Task4: ");
        if (i > 0) {
            i++;
            System.out.println("i =" + i);
        } else if (i < 0) {
            i -= 2;
            System.out.println("i = " + i);
        } else {
            i = 10;
            System.out.println("i = " + i);
        }
    }

    public static void valuesCompare(float firstValue, float secondValue, float thirdValue) {
            firstValueMin:
            {
                if (firstValue < secondValue) {
                    if (firstValue < thirdValue) {
                        System.out.println(secondValue + thirdValue);
                    } else break firstValueMin;
                }
            }
            secondValueMin:
            {
                if (secondValue < firstValue) {
                    if (secondValue < thirdValue) {
                        System.out.println(firstValue + thirdValue);
                    } else break secondValueMin;
                }
            }
            thirdValueMin:
            {
                if (thirdValue < firstValue) {
                    if (thirdValue < secondValue) {
                        System.out.println(firstValue + secondValue);
                    }
                } else System.out.println("Значения одинаковы");
            }
        }

    public static void TaskSix() {
        int x = (int) (Math.random() * 10);
        System.out.println("Task6: ");
        if (x == 0) {
            System.out.println("Нулевое число");
        } else if (x > 0) {
            System.out.println("Положительное четное");
        } else {
            System.out.println("Положительное нечетное");
        }
    }

    public static void TaskSeven() {
        int A = (int) (Math.random() * 10);
        int B = (int) (Math.random() * 10);
        System.out.println("Task7: ");
        if (A > 2 && B < 3) {
            System.out.println("Справедливо");
        } else {
            System.out.println("Несправедливо");
        }
    }

    public static void TaskEight() {
        int A = (int) (Math.random() * 10);
        int B = (int) (Math.random() * 10);
        int C = (int) (Math.random() * 10);
        System.out.println("Task8: ");
        if (B > A && B < C) {
            System.out.println("Справедливо двойное неравенство");
        } else {
            System.out.println("Несправедливо двойное неравенство");
        }
    }

    public static void TaskNine() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);

        if (b == c && c == d)
            System.out.println("Poriadkovii nomer raven 1");
        else if (a == c && c == d)
            System.out.println("Poriadkovii nomer raven 2");
        else if (a == b && b == d)
            System.out.println("Poriadkovii nomer raven 3");
        else if (a == b && b == c)
            System.out.println("Poriadkovii nomer raven 4");

    }

    public static void TaskTen() {
        int K = (int) (Math.random() * 6);
        String mark;
        System.out.println("Task10: ");
        switch (K) {
            case 1:
                mark = "Плохо";
                System.out.println(mark);
                break;
            case 2:
                mark = "Неудовлетворительно";
                System.out.println(mark);
                break;
            case 3:
                mark = "Удовлетворительно";
                System.out.println(mark);
                break;
            case 4:
                mark = "Хорошо";
                System.out.println(mark);
                break;
            case 5:
                mark = "Отлично";
                System.out.println(mark);
                break;
            default:
                System.out.println("Нет такой оценки");
        }
    }

    public static void TaskEleven() {
        int month = (int) (Math.random() * 12);
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else {
            System.out.println("Осень");
        }
    }

    public static void TaskTwelve() {
        int N = (int) (Math.random() * 5);
        int A = 24;
        int B = 12;

        switch (N) {
            case 1:
                System.out.println(A + B);
                break;
            case 2:
                System.out.println(A - B);
                break;
            case 3:
                System.out.println(A * B);
                break;
            case 4:
                System.out.println(A / B);
                break;
            default:
                System.out.println("Anable to perform action");
        }

    }

    public static void TaskThirteen() {
        int a = 1;
        int b = 10;
        int N = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            N++;
        }
        System.out.println(N);
    }

    public static void TaskFourteen() {
        int sum = 0;
        for (int i = 1; i < 20 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void TaskFifteen() {
        int Factor = 1;
        int N = 5;
        for (int i = 1; i <= N ; i++) {
            Factor = Factor * i;
        }
        System.out.println(Factor);
    }

    public static void TaskSixteen() {
        int A = 50;
        int B = 30;
        int Lenght = A - B;
        while (A>B) {
            System.out.println(Lenght);
        }

    }

    public static void TaskSeventeen() {
        int N = 5;
        int K = 1;
        int C = 3 * K;
        do {
            K++;
        }
        while (C > N);
        System.out.println(K);
    }

    public static void TaskEighteen() {
        int N = 15;
        while (N > 0) {
            System.out.println(N % 10);
            N /= 10;
        }
    }

    public static void TaskNineteen() {
        int A = 5;
        int B = 20;
        for (int i = 1; i <= B - A + 1; i++) {
            for (int j = 1; j <=i; j++) {
                int C = A + i - 1;
                System.out.println(C);
            }
        }
    }
}




