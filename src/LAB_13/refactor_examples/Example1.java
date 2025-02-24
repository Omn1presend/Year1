package LAB_13.refactor_examples;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            boolean someCondition = false;
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        } finally {
            System.out.println("2");
        }
    }
}

/*
Пример 1 демонстрирует сгенерирование и перехват исключения типа RuntimeException в методе main().
В данном примере, после вывода на консоль строки "0", генерируется новый объект исключения RuntimeException с сообщением "Непроверяемая ошибка" при помощи оператора throw.
Затем исключение перехватывается блоком try-catch. Исключение типа RuntimeException является непроверяемым исключением, поэтому оно не требует объявления или обработки в сигнатуре метода.
В блоке catch мы получаем доступ к объекту исключения при помощи переменной e и выводим на консоль строку "1" и информацию об исключении.
Далее, программа продолжает своё выполнение и выводит строку "2".
 */


