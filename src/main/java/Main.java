//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
// Используем метод StringBuilder.append().
//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


public class Main {
    static String s1 = "Temperature";
    static String s2 = "Fibonachi";
    static int a = 3;
    static int b = 56;

    public static void main(String[] args) {
        word(s1, s2);
        word(s1, new StringBuilder(s2).reverse().toString());
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));

    }

    private static void word (String s1, String s2) {
        System.out.println(s1.contains(s2));
   
    }

     
}
