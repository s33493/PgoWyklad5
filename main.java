public class main {
    public static void main(String[] args) {
        wydarzenie koncert = new wydarzenie("koncert metalica", 120.00);
        wydarzenie teatr = new wydarzenie("teatr buffo", 120.00, "12.02");
        System.out.println(koncert.getCena());
        System.out.println(teatr.toString());
        koncert.setDostepneMiejsce(100);

        System.out.println(koncert);

    }

}
