import java.util.ArrayList;

public class klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<wydarzenie>listaRezerwacji=new ArrayList<>();

    public klient(String nazwisko, String imie) {
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public klient(String nazwisko, String imie, String email) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean dodajRezerwacje(wydarzenie w){
        listaRezerwacji.add(w);
        return true;
    }
    public void wyswietlrezerwacje(){
        for (wydarzenie w : listaRezerwacji){
            System.out.println(w);
        }
    }
    public void usunrezerwacje(wydarzenie w){
        listaRezerwacji.remove(w);
    }
    public void usunrezerwacje(String nazwaWydarzenia){
        for(int i=0; i<listaRezerwacji.size(); i++){
            if (listaRezerwacji.get(i).getNazwa().equals(nazwaWydarzenia)){
                listaRezerwacji.remove(i);
                return;
            }
        }
    }
}
