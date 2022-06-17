package zad3;

import exceptions.NoWomenException;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
    //        Stworz sobie klase Osoba (imie, nazwisko, miasto, wiek)
    private String name;
    private String surname;
    private String city;
    private Integer age;
    private static List<Person> extension = new ArrayList<>();

    public Person(String name, String surname, String city, Integer age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
        extension.add(this);
    }

    //        - metoda co zwraca najstarsza kobiete (imie konczy sie na 'a') - lub NoWomenException jesli brak kobiet na liscie

    public static Person oldestWoman(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(o -> o.getName().endsWith("a"))
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoWomenException::new);
    }

//        - metode ktora zwraca sredni wiek wszystkich osob

    public static Double averageAge(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.averagingDouble(Person::getAge));
    }

    //        - metode ktora zwraca sredni wiek mezczyzn
    public static Double manAverageAge(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> !p.getName().endsWith("a"))
                .collect(Collectors.averagingDouble(Person::getAge));
    }

    //        - metode ktora zwrca sredni wiek kobiet
    public static Double womanAverageAge(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getName().endsWith("a"))
                .collect(Collectors.averagingDouble(Person::getAge));
    }

//        - metode ktora agreguje dwie metody powyzej (tzn: jako drugi parametr przyjmuje funkcje ktora okresla plec)

    public static Double parameterAverageAge(List<Person> list, Predicate<Person> pre) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(pre)
                .collect(Collectors.averagingDouble(Person::getAge));
    }
//        - metode ktora znajdze miasto w ktorym zyje najwiecej ludzi

    public static String cityWithMostPeople(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
//        - metode ktora zwroci wszystkie rozne miasta z listy osob (rozne tzn: bez powtorzen)

    public static List<String> allCities(List<Person> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Person::getCity)
                .distinct()
                .toList();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    public static List<Person> getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, city, age);
    }
}
