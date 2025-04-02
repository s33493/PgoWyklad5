import java.nio.channels.spi.AbstractSelectionKey;
import java.util.ArrayList;

public class Systemrezerwacji {
    private ArrayList<wydarzenie> listawydarzen=new ArrayList<>();
    private ArrayList<klient>listaklientow=new ArrayList<>();


    public void dodajWydarzenie(wydarzenie wydarzenie){
        listawydarzen.add(wydarzenie);
    }

    public void doadajWydarzenie(String nazwa,double cena,String data,String miejsce){
        listawydarzen.add(new wydarzenie(nazwa,cena,data,miejsce));
    }
    //przeciazanie metod 2 razy
    public void dodajKlienta(klient klient){
        listaklientow.add(klient);
    }
    public void dodajKlienta(String imie,String nazwisko,String email){
        listaklientow.add(new klient(imie,nazwisko,email));
    }
    public void dokonajRezerwację(klient klient,wydarzenie wydarzenie){
        klient.dodajRezerwacje(wydarzenie);
        wydarzenie.zarreerwujMiejsce(wydarzenie.getDostepneMiejsce());
        wydarzenie.setDostepneMiejsce(wydarzenie.getDostepneMiejsce()-1);
    }
    public wydarzenie znajdzWydarzenie(String nazwa){
        for(wydarzenie wydarzenie:listawydarzen){
            if(wydarzenie.getNazwa().equals(nazwa)){
                return wydarzenie;
            }
        }
        return null;
    }
    public klient znajdzKlienta(String nazwisko){
        for(klient klient:listaklientow){
            if(klient.getNazwisko().equals(nazwisko)){
                System.out.println("Klient o takim nazwisku istnieje");
                return klient;
            }
        }
        return null;
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        wydarzenie w=znajdzWydarzenie(nazwa);
        if (w != null) {
            w.setCena(nowaCena);
            System.out.println("Cena wydarzenia:"+"  "+nazwa+" "+"została zmieniona na:"+nowaCena);
        }
        else {
            System.out.println("nie znaleziiono wydarzeenia o nazwie"+nazwa);
        }
}

}
