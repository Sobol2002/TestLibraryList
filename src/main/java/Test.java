import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner read = new Scanner(System.in);
        System.out.println("Демонстрация метода add(Добавление в конец списка)");
        System.out.println("Введите кол-во узлов для списка: ");
        int count = new Scanner(System.in).nextInt();
        for (int index = 1; index <= count; index++) {
            System.out.print("Введите узел №: " + index + ": ");
            list.add(read.nextInt());
        }
        System.out.println(list+"\n");

        System.out.println("Демонстрация метода get(Поиск элемента по индексу)");
        System.out.println("Узел с каким индексом вы хотите найти: ");
        int index = new Scanner(System.in).nextInt();
        System.out.println("Узел с индексом "+ index +" = [" + list.get(index)+"]"+"\n");

        System.out.println("Демонстрация метода addAll(Поиск элемента по индексу)");
        System.out.println("Например мы хотим добавить массив values{1,4,5} в список: "+list);
        System.out.println("Начальный список: " + list + "\n");
        Integer[] values={1,4,5};
        list.addAll(values);
        System.out.println("Конечный список: " + list + "\n");

        System.out.println("Демонстрация метода delete(Удаление элемента по index)");
        System.out.println("Узел с каким index вы хотите удалить: ");
        int index1 = new Scanner(System.in).nextInt();
        list.delete(index1);
        System.out.println("Узел с индексом "+ index1 +" удален."+"\n");
        System.out.println("Результат" + list+"\n");

        System.out.println("Демонстрация метода addIndex(Добавление в место списка под index)");
        System.out.println("Узел с каким index вы хотите добавить: ");
        int index2 = new Scanner(System.in).nextInt();
        System.out.println("Узел с каким значением вы хотите добавить: ");
        int index3 = new Scanner(System.in).nextInt();
        list.addIndex(index2,index3);
        System.out.println("Узел с индексом "+ index2 +"добавлен со значением: "+index3+"\n");
        System.out.println("Результат" + list+"\n");

    }
}
