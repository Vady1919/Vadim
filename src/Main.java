import java.util.Scanner;
import java.util.Stack;

// public class Program {
//    public static void main(String[] args) {
//        System.out.println("4ИСИП-221 Беляев Вадим");
//    }
//    Задание №1
// public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    if (number % 2 == 0) {
//        System.out.println("Число " + number + " является четным");
//    } else {
//        System.out.println("Число " + number + " является нечетным");
//    }
//
//    scanner.close();
//}
//
//    Задание №2
// public static void main(String[] args) {
//    System.out.println("№2.Введите три числа:");
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//    int min = Math.min(Math.min(a, b), c);
//        System.out.println("Минимальное число: " + min);
//
//    Задание №3
// public static void main(String[] args) {
//    System.out.println("№3.Таблица умножения на 5:");
//    for (int i = 1; i <= 10; i++) {
//    System.out.println("5 x " + i + " = " + (5 * i));
//       }
//
//    Задание №4
// public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число N: ");
//    int N = scanner.nextInt();
//    int sum = 0;
//    for (int i = 1; i <= N; i++) {
//        sum += i;
//    }
//    System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + sum);
//    scanner.close();
//}
//
//    Задание №5
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите количество чисел Фибоначчи, которые вы хотите вывести: ");
//    int N = scanner.nextInt();
//
//    if (N <= 0) {
//        System.out.println("Количество чисел должно быть положительным числом.");
//    } else {
//        System.out.println("Первые " + N + " чисел Фибоначчи:");
//
//        int first = 0;
//        int second = 1;
//
//        for (int i = 1; i <= N; i++) {
//            System.out.print(first + " ");
//
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//        System.out.println();
//    }
//
//    scanner.close();
//}
//
//    Задание №6
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    if (number <= 1) {
//        System.out.println(number + " не является простым числом.");
//    } else {
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(number + " является простым числом.");
//        } else {
//            System.out.println(number + " не является простым числом.");
//        }
//    }
//
//    scanner.close();
//}
//
//    Задание №7
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число N: ");
//    int N = scanner.nextInt();
//
//    if (N <= 0) {
//        System.out.println("Введите положительное число.");
//    } else {
//        System.out.println("Числа от " + N + " до 1 в обратном порядке:");
//        for (int i = N; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//    scanner.close();
//}
//
//    Задание №8
// public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число A: ");
//    int A = scanner.nextInt();
//    System.out.print("Введите целое число B: ");
//    int B = scanner.nextInt();
//
//    int sum = 0;
//
//    if (A > B) {
//        System.out.println("A должно быть меньше или равно B.");
//    } else {
//        if (A % 2 != 0) {
//            A++;
//        }
//        for (int i = A; i <= B; i += 2) {
//            sum += i;
//        }
//        System.out.println("Сумма четных чисел от A до B: " + sum);
//    }
//    scanner.close();
//}
//
//    Задание №9
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    String reversed = "";
//
//    for (int i = input.length() - 1; i >= 0; i--) {
//        reversed += input.charAt(i);
//    }
//
//    System.out.println("Обратный порядок строки: " + reversed);
//
//    scanner.close();
//}
//    Задание №10
//    public static void main(String[] args) {
//        System.out.println("№10.Введите число для подсчета цифр:");
//    number = scanner.nextInt();
//    int digitCount = String.valueOf(Math.abs(number)).length();
//        System.out.println("Количество цифр в числе: " + digitCount);
//
//    Задание №11
//    public static void main(String[] args) {
//       System.out.println("№11.Введите число N для вычисления факториала:");
//    N = scanner.nextInt();
//    long factorial = 1;
//    for (int i = 2; i <= N; i++) {
//    factorial *= i;
//}
//      System.out.println("Факториал числа " + N + " = " + factorial);
//
//     Задание №12
//     public static void main(String[] args) {
//       System.out.println("№12.Введите число для нахождения суммы его цифр:");
//     number = scanner.nextInt();
//     sum = 0;
//       while (number != 0) {
//         sum += Math.abs(number % 10);
//       number /= 10;
//     }
//        System.out.println("Сумма цифр числа = " + sum);
//
//    Задание №13
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    String cleanedInput = input.replaceAll("\\W", "").toLowerCase();
//    String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
//
//    if (cleanedInput.equals(reversedInput)) {
//        System.out.println("Строка является палиндромом");
//    } else {
//        System.out.println("Строка не является палиндромом.");
//    }
//
//    scanner.close();
//}
//    Задание №14
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    for (int i = 0; i < size; i++) {
//        array[i] = scanner.nextInt();
//    }
//
//    int max = array[0];
//    for (int i = 1; i < size; i++) {
//        if (array[i] > max) {
//            max = array[i];
//        }
//    }
//    System.out.println("Максимальное число в массиве: " + max);
//    scanner.close();
//}
//
//    Задание №15
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    int sum = 0;
//    for (int i = 0; i < size; i++) {
//        array[i] = scanner.nextInt();
//        sum += array[i];
//    }
//    System.out.println("Сумма всех элементов массива: " + sum);
//    scanner.close();
//}
//
//    Задание №16
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    int positiveCount = 0;
//    int negativeCount = 0;
//
//    for (int i = 0; i < size; i++) {
//        int number = scanner.nextInt();
//        array[i] = number;
//        if (number > 0) {
//            positiveCount++;
//        } else if (number < 0) {
//            negativeCount++;
//        }
//    }
//    System.out.println("Количество положительных чисел: " + positiveCount);
//    System.out.println("Количество отрицательных чисел: " + negativeCount);
//
//    scanner.close();
//}
//
//    Задание №17
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите число A: ");
//    int A = scanner.nextInt();
//
//    System.out.print("Введите число B: ");
//    int B = scanner.nextInt();
//
//    if (A > B) {
//        System.out.println("Неверный диапазон. A должно быть меньше или равно B.");
//    } else {
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
//    scanner.close();
//}
//    private static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        if (number == 2) {
//            return true; // 2 - единственное четное простое число
//        }
//        if (number % 2 == 0) {
//            return false; // Четные числа больше 2 не простые
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    Задание №18
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Введите строку: ");
//    String inputString = scanner.nextLine();
//
//     int vowelCount = 0;
//     int consonantCount = 0;
//     for (int i = 0; i < inputString.length(); i++) {
//      char ch = Character.toLowerCase(inputString.charAt(i));
//       if (ch >= 'a' && ch <= 'z') {
//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//           vowelCount++;
//        } else {
//          consonantCount++;
//       }
//     }
//  }
//     System.out.println("Количество гласных букв: " + vowelCount);
//     System.out.println("Количество согласных букв: " + consonantCount);
//
//    Задание №19
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    String[] words = input.split("\\s+");
//
//    Stack<String> stack = new Stack<>();
//    for (String word : words) {
//        stack.push(word);
//    }
//
//    System.out.println("Строка со словами в обратном порядке:");
//    while (!stack.isEmpty()) {
//        System.out.print(stack.pop());
//        if (!stack.isEmpty()) {
//            System.out.print(" ");
//        }
//    }
//
//    scanner.close();
//}
//    Задание №20
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    int originalNumber = number;
//    int sum = 0;
//    int numberOfDigits = String.valueOf(number).length();
//
//    while (number > 0) {
//        int digit = number % 10;
//        sum += Math.pow(digit, numberOfDigits);
//        number /= 10;
//    }
//    if (sum == originalNumber) {
//        System.out.println(originalNumber + " является числом Армстронга.");
//    } else {
//        System.out.println(originalNumber + " не является числом Армстронга.");
//    }
//    scanner.close();
//}
//}