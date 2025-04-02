import java.nio.channels.spi.AbstractSelectionKey;
import java.util.ArrayList;

public class Systemrezerwacji {
    private ArrayList<wydarzenie> listaRezerwacji=new ArrayList<>();
    private ArrayList<klient>listaklientow=new ArrayList<>();

    public ArrayList<wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public ArrayList<klient> getListaklientow() {
        return listaklientow;
    }

    public void dodajWydarzenie(wydarzenie wydarzenie){
        listaRezerwacji.add(wydarzenie);
    }
    public void doadajWydarzenie(String nazwa,double cena,String data,String miejsce){
        listaRezerwacji.add(new wydarzenie(nazwa,cena,data,miejsce));
    }
    //przeciazanie metod 2 razy
    public void dodajKlienta(klient klient){
        listaklientow.add(klient);
    }
    public void dodajKlienta(String imie,String nazwisko,String email){
        listaklientow.add(new klient(imie,nazwisko,email));
    }
    public void dokonajRezerwację(klient klient,wydarzenie wydarzenie){
        System.out.println("Dokonano rezerwacji wydarzenia"+" "+wydarzenie.getNazwa()+" "+"dla Kliienta:"+" "+klient.getImie()+" "+klient.getNazwisko()+" "+klient.getEmail());
        listaRezerwacji.add(wydarzenie);
        return;
    }
    public wydarzenie znajdzWydarzenie(String nazwa){
        for(wydarzenie wydarzenie:listaRezerwacji){
            if(wydarzenie.getNazwa().equals(nazwa)){
                System.out.println("Wydarzenie o takiej nazwie istnieje i odbędzie się"+wydarzenie.getData());
                return wydarzenie;
            }
        }
        return null;
    }
    public void znajdzKlienta(String nazwisko){
        for(klient klient:listaklientow){
            if(klient.getNazwisko().equals(nazwisko)){
                System.out.println("Klient o takim nazwisku istnieje");
            }
            System.out.println("klient o takim nazwisku NIE istnieje");
        }
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        for (wydarzenie wydarzenie : listaRezerwacji) {
            if (wydarzenie.getNazwa().equals(nazwa)) {
                wydarzenie.setCena(nowaCena);
                System.out.println("Cena wydarzenia '" + nazwa + "' została zmieniona na: " + nowaCena);
                return;
            }
        }
        System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
    }
public static void main(String[] args) {
}

}
