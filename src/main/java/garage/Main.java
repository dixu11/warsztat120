package garage;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(2.2);
        Wheel wheel2 = new Wheel(2.2);
        Wheel wheel3 = new Wheel(2.4);
        Wheel wheel4 = new Wheel(2.4);

        System.out.println(wheel1);

        Wheel[] wheels = {wheel1,wheel2,wheel3,wheel4};
        Car car = new Car(wheels);
        System.out.println(car);
        car.flatRandomTire();
        System.out.println(car);

    }
}
/*
Projekt: Warsztat

        Przygotuj program w którym zasymulujesz sytuację w której kierowca samochodu łapie gumę w kole
         i zabiera go do warsztatu do naprawy.

        w main przygotuj 4 obiekty kół, każde z nich ma mieć ustawione ciśnienie i ma nie być przebite
        zbierz wszystkie koła do zbioru i przekaż do obiektu typu Samochod
        zasymuluj zdarzenie, że samochód łapie gumę w losowym kole
        obiekt typu Warsztat może przyjmować samochód do naprawy
        naprawa polega na tym, że warsztat wyszukuje które koło z samochodu jest zepsute i poprawia jego stan
        na koniec naprawy warsztat zwraca obiekt typu Paragon zawierający rodzaj usługi, ile razy była
        wykonana oraz łączną cenę*/
