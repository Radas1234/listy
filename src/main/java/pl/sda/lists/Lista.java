package pl.sda.lists;

public interface Lista {

    void dodajElement(int liczba);
    int znajdź(int liczba);
    String pisz();
    boolean usunPierwszy(int liczba);
    void usunPowtorzenia();
    void zapiszDoPliku (String Plik);

}
