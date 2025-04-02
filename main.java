import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Systemrezerwacji system = new Systemrezerwacji();
// Dodaj wydarzenia i klientów
        wydarzenie koncert = new wydarzenie("Koncert Symphony", 120.0,"12.02.2025");
        wydarzenie teatr = new wydarzenie("Hamlet", 85.0,"13.02.2025");
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);
        klient klient1 = new klient("Jan", "Kowalski", "jan@example.com");
        klient klient2 = new klient("Anna", "Nowak", "anna@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);
// Dokonaj rezerwacji - przekazanie obiektu Klient i Wydarzenie
        system.dokonajRezerwację(klient1, koncert);
        system.dokonajRezerwację(klient1, teatr);
        system.dokonajRezerwację(klient2, koncert);
// Wyświetl rezerwacje klienta
        System.out.println("Rezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + ":");
        klient1.wyswietlrezerwacje();
// Pobierz referencję do wydarzenia z systemu
        wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");
// Modyfikacja wydarzenia przez referencję - wpłynie na wszystkich klientów, którzy mają to wydarzenie
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
        koncertRef.setCena(150.0);
// Sprawdź czy zmiany są widoczne w rezerwacjach klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + "po zmianie ceny:");
        klient1.wyswietlrezerwacje();
        System.out.println("\nRezerwacje klienta " + klient2.getImie() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyswietlrezerwacje();
// Klient anuluje rezerwację - operacja na referencjach
        System.out.println("\nKlient " + klient1.getImie() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwacje(teatr);
        klient1.wyswietlrezerwacje();
// Sprawdź liczbę dostępnych miejsc na koncercie (powinna być o 2 mniejsza od max)
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostepneMiejsce() +
                " z " + koncert.getMaxliczbaMiejsc());

    }
}
