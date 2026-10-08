package giocanumeri;

xpublic class GiocaNumeri {
    public static void main(String[] args) {
        System.out.println("INIZIO GIOCO");

        Giocatore g1 = new Giocatore("Monica");
        g1.start();
        Giocatore g2 = new Giocatore ("Paolo");
        g2.start();
        System.out.println("FINE GIOCO");
    }
}