public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Циклы. Задание номер 1
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задание 1");
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("Итерация цикла " + i);
        }

        //Циклы . Задание номер 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1
        System.out.println("Задание 2");
        for (int a = 10 ; a >= 0 ; a--) {
            System.out.println("Итерация цикла " + a);
        }

        //Циклы . Задание 3
        //Выведите в консоль все четные числа от 0 до 17
        System.out.println("Задание 3");
        for ( int b = 0 ; b <= 17 ; b++ ) {
            if ( b % 2 == 0)
                System.out.println("Итерация цикла " + b );
        }

        //Циклы . Задание 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
        System.out.println("Задание 4");
        for ( int c = 10 ; c >= -10 ; c--) {
            System.out.println("Итерация цикла " + c);
        }

        //Циклы . задание 5
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате "… год является високосным".
        System.out.println("Задание 5");
        for ( int y = 1904 ; y < 2096 ; y = y + 4){
            System.out.println("Високосным годом будет " + y);
        }

        //Циклы . Задание 6
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Задание 6");
        for ( int i = 7 ; i <= 98 ; i = i + 7){
            System.out.println("Итерация цикла " + i);
        }

        //Циклы . задание 7
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Задание 7");
        for ( int a = 1 ; a <= 512 ; a = a * 2){
            System.out.println("Итерация цикла " + a);
        }

        //Циклы . Задание 8
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        //Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
        System.out.println("Задание 8");
        int bank = 29000;
        int total = 0 ;
        for ( int i = 1 ; i <= 12 ; i++){
            total = bank + total;
            System.out.println("Месяц " + i + " сумма накоплений " + total + " рублей");
        }

        //Циклы . Задание 9
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
        System.out.println("Задание 9");
        int bank1 = 29000 ;
        int total1 = 0 ;
        for ( int i = 1 ; i <= 12 ; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + bank1;
            System.out.println("Месяц " + i + " сумма накоплений " + total1 + " рублей");
        }


    }
}