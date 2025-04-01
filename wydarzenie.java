public class wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int MaxliczbaMiejsc=100;
    private  int dostepneMiejsce=0;
    private double cena;

    public wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }

    public wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getMaxliczbaMiejsc() {
        return MaxliczbaMiejsc;
    }

    public void setMaxliczbaMiejsc(int maxliczbaMiejsc) {
        MaxliczbaMiejsc = maxliczbaMiejsc;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getDostepneMiejsce() {
        return dostepneMiejsce;
    }

    public void setDostepneMiejsce(int dostepneMiejsce) {
        if (dostepneMiejsce<0){
            throw new IllegalArgumentException("nie moze byc mniejsze niz 0");
        }
        if (dostepneMiejsce>MaxliczbaMiejsc){
            System.out.println("");
            return;
        }
        this.dostepneMiejsce = dostepneMiejsce;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena<0){
            throw new IllegalArgumentException("nie moze byc mniejsza od zera");
        }
        this.cena = cena;
    }
    public boolean zarreerwujMiejsce(int dostepneMiejsce){
        if (dostepneMiejsce<=0){
            return false;
        }
       dostepneMiejsce--;
        return true;
    }
    public String  toString(){
        String info=nazwa+" "+cena+" "+data+" "+miejsce;
        return info;
    }
}
