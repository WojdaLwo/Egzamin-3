package zad1;

import java.util.Arrays;
import java.util.List;

//Stworz klase MinMax<T extends Comparable> ktora jako pola klasy pobiera instancje T max oraz T min
//        Nastepnie stworz klase MinMaxService ktora bedzie miala statyczna metode MinMax<cos tutaj> getMinAndMax(List<cos tutaj> elements) zadaniem tej metody jest zwracanie mina i maxa z listy w tym jednym obiekcie wg naturalnego porządku jaki gwarantuje komparator, klasa MinMax powinna byc generyczna i metody getMin oraz getMax powinny zwraca instancje tego co bedzie na liscie elements, czyli jak przekazemy liste stringow to getMax ma zwraca String, getMin tez stringa a jak damy liste osob to ma getMax zwraca osobe, itp itd.

public class Main {
    public static void main(String[] args) {
        List<Integer> listI = Arrays.asList(10, 1, 4, 7, 36, 9, 17, 24, 46, 4);
        List<String> listS = Arrays.asList("skdahf", "jasdbf", "awedwad", "zjhgkq", "djfbgks");
        MinMax<Integer> ints = MinMaxService.getMinAndMax(listI);
        MinMax<String> strings = MinMaxService.getMinAndMax(listS);
        System.out.println(ints.getMax());
        System.out.println(ints.getMin());
        System.out.println(strings.getMax());
        System.out.println(strings.getMin());
        Person p1 = new Person("Janina", "Kowalska",33);
        Person p2 = new Person("Anna", "Kowal",63);
        Person p3 = new Person("Maria", "Kot",23);
        Person p4 = new Person("Marek", "Kot",28);
        Person p5 = new Person("Roman", "Baka",18);
        MinMax<Person> persons = MinMaxService.getMinAndMax(Person.getExtension());
        System.out.println(persons.getMax());
        System.out.println(persons.getMin());

    }
}
