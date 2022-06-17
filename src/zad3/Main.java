package zad3;

//Zad 03:
//        Stworz sobie klase Osoba (imie, nazwisko, miasto, wiek)
//        - metoda co zwraca najstarsza kobiete (imie konczy sie na 'a') - lub NoWomenException jesli brak kobiet na liscie
//        - metode ktora zwraca sredni wiek wszystkich osob
//        - metode ktora zwraca sredni wiek mezczyzn
//        - metode ktora zwrca sredni wiek kobiet
//        - metode ktora agreguje dwie metody powyzej (tzn: jako drugi parametr przyjmuje funkcje ktora okresla plec)
//        - metode ktora znajdze miasto w ktorym zyje najwiecej ludzi
//        - metode ktora zwroci wszystkie rozne miasta z listy osob (rozne tzn: bez powtorzen)

public class Main {
    public static void main(String[] args) {

        Person o1 = new Person("Janina", "Kowalska", "Lublin", 33);
        Person o2 = new Person("Anna", "Kowal", "Warszawa", 63);
        Person o3 = new Person("Maria", "Kot", "Gdańsk", 23);
        Person o4 = new Person("Marek", "Kot", "Gdańsk", 28);
        Person o5 = new Person("Roman", "Baka", "Zielona Góra", 18);

        System.out.println(Person.oldestWoman(Person.getExtension()));
        System.out.println(Person.averageAge(Person.getExtension()));
        System.out.println(Person.parameterAverageAge(Person.getExtension(), p -> !p.getName().endsWith("a")));
        System.out.println(Person.cityWithMostPeople(Person.getExtension()));
        System.out.println(Person.allCities(Person.getExtension()));
    }
}
