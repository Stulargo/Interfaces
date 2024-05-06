public class CATERPILLARM318D implements Kopanie,Uruchamianie{
    @Override
    public void wypoziomujPojazd() {
        System.out.println("Wypoziomowano pojazd");
    }

    @Override
    public boolean opuszczonoLyzke(double oIle) {
        return true;
    }

    @Override
    public boolean podniesionoLyzke(double oIle) {
        return false;
    }

    @Override
    public void odsunietoLyzke() {
        System.out.println("Odsunięto Łyżkę");
    }

    @Override
    public void przysunietoLyzke() {
        System.out.println("Przysunięto Łyżkę");
    }

    @Override
    public void obrotWPrawo(double katObrotu) {
        System.out.println("Kąt obrotu w prawo to: "+ katObrotu);
    }

    @Override
    public void obrotWLewo(double katObrotu) {
        System.out.println("Kąt obrotu w lewo to: " +katObrotu);
    }

    @Override
    public void uruchom() {

    }
}
