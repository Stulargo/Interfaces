public class Koparka implements Uruchamianie {
    private double wysokoscLyzki = 1.5;

    @Override
    public void uruchom() {
        System.out.println("Koparka uruchomiona");
    }
    public void wykopDolek(int glebokosc) {
        if (glebokosc <= 0) {
            System.out.println("Głębokość musi być dodatnia");

        }
        for (int i = 0; i < glebokosc+2; i++) {
            wysokoscLyzki -= 1;
            System.out.println("Koparka wykopała 1m, lyżka znajduje się na wysokości " + wysokoscLyzki + "m");
        }
    }
}