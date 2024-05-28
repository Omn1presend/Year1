package LAB_6;

public class Point1 {
    public static void main(String[] args) {
        ClassP_1 instance = new ClassP_1();

        instance.setValue('a');
        instance.printValues();

        instance.setValue("Hello, wrld!");
        instance.printValues();

        char[] array = {'a', 'b', 'c'};
        instance.setValue(array);
        instance.printValues();
    }
}