public class FirstLesson {
    // psvm
    /*
    многострочный
    комментарий
     */

    /**
    * документирование кода
     **/
    public static void main(String[] args) {
        // sout
        System.out.println("инфа в консоль");
        int size;
        size = 2;

        int count = 1258;
        int length = 122, width = 350;

        count = 3000;
        System.out.println(count);
        // если превышает емкость int то надо поставить L
        long veryBig = 67_000_000_000L;

        // деление целых чисел на 0
        // System.out.println( count / 0);

        // не подходит для точных вычислений
        double price = 56.7;
        // для работы с float нужно проставить f
        float temp = -78.3f;
        // деление целых чисел с плавающей точкой на ноль
        System.out.println(price / 0); // infinity
        System.out.println( temp / 0); // -infinity

        count = 8700; // int 8700
        // автоматическое приведение типов
        price = count; // double 8700.0
        System.out.println(price);

        // явное приведение типов
        byte small = (byte) count;
        System.out.println(small); // -4

        // операторы
        int a = 9, b = 4;
        //   int c = a / b;
        double c = (double) a / b;
        System.out.println(c); // 2.0

        byte x = 6, y = 12;
        byte z = (byte) (x + y); // 18

        // %
        length = 9;
        width = 2;
        System.out.println(length % width); // 1
        // 4.5 4.5
        // 0.5 + 0.5 = 1

        System.out.println(9 % 3); // 0
        System.out.println(7 % 4); // 3

        // операиторы присваивания
        int num = 10;
        num += 10; // num = num + 10;
        num -= 10; // num = num - 10;
        num /= 10; // num = num / 10;
        num *= 10; // num = num * 10;
        num %= 10; // num = num % 10;

        System.out.println(a > b); // true
        System.out.println(length == width); // false
        System.out.println(40 <= 40); // true
        System.out.println(400 != 40); // true

        // тернарный оператор ?
        int start = 3, end = 5000;
        int res = start > end ? end - start : 0;
        System.out.println(res); // 0




    }
}
