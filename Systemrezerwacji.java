import java.nio.channels.spi.AbstractSelectionKey;
import java.util.ArrayList;

public class Systemrezerwacji {
    private ArrayList<wydarzenie> listaRezerwacji=new ArrayList<>();
    private ArrayList<klient>listaklientow=new ArrayList<>();

    public void dodajWydarzenie(wydarzenie wydarzenie){
        listaRezerwacji.add(wydarzenie);
    }
    public void doadajWydarzenie(String nazwa,double cena,String data,String miejsce){
        listaRezerwacji.add(new wydarzenie(nazwa,cena,data,miejsce));
    }
    //przeciazanie metod 2 razy
    public void dodajKlient(klient klient){
        listaklientow.add(klient);
    }
    public void dodajKlienta(String imie,String nazwisko,String email){
        listaklientow.add(new klient(imie,nazwisko,email));
    }
    public void dokonajRezerwację(klient klient,wydarzenie wydarzenie){

    }

}
