public interface Uruchamianie {
    void uruchom();
    default void trab(){
        System.out.println("Wydaje sygnał dźwiękowy");
    }
}