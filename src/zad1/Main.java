package zad1;

import java.util.Arrays;
import java.util.List;

//Stworz klase MinMax<T extends Comparable> ktora jako pola klasy pobiera instancje T max oraz T min
//        Nastepnie stworz klase MinMaxService ktora bedzie miala statyczna metode MinMax<cos tutaj> getMinAndMax(List<cos tutaj> elements) zadaniem tej metody jest zwracanie mina i maxa z listy w tym jednym obiekcie wg naturalnego porządku jaki gwarantuje komparator, klasa MinMax powinna byc generyczna i metody getMin oraz getMax powinny zwraca instancje tego co bedzie na liscie elements, czyli jak przekazemy liste stringow to getMax ma zwraca String, getMin tez stringa a jak damy liste osob to ma getMax zwraca osobe, itp itd.

public class Main {
    public static void main(String[] args) {
        List<Integer> listaI = Arrays.asList(10, 1, 4, 7, 36, 9, 17, 24, 46, 4);
        List<String> listaS = Arrays.asList("skdahf", "jasdbf", "awedwad", "zjhgkq", "djfbgks");
        MinMax<Integer> inty = MinMaxService.getMinAndMax(listaI);
        MinMax<String> stringi = MinMaxService.getMinAndMax(listaS);
        System.out.println(inty.getMax());
        System.out.println(inty.getMin());
        System.out.println(stringi.getMax());
        System.out.println(stringi.getMin());
    }
}
