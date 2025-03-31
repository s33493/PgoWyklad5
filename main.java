public class main {
    public static void main(String[] args) {
        wydarzenie koncert = new wydarzenie("koncert metalica", 120.00);
        wydarzenie teatr = new wydarzenie("teatr buffo", 120.00, "12.02");
        System.out.println(koncert.getCena());
        koncert.setDostepneMiejsce(100);
        if (koncert.zarreerwujmiejsce(teatr.getDostepneMiejsce()) == true) {
            System.out.println("rezerwacja powiodla sie");
        } else {
            System.out.println("rezerwacja nie powiodla sie");
        }

        koncert.zarreerwujmiejsce(koncert.getDostepneMiejsce());
        System.out.println(koncert);

    }
    Object o;
}
