package pl.sda.lists;

import java.util.Arrays;

public class ListaImplementacja implements Lista {

    private int[] liczby;
    private int pojemnosc=10;
    private int rozmiar;

    ListaImplementacja() {

        this.liczby = new int[this.pojemnosc];
    }
    ListaImplementacja(int pojemnosc) {

        this.liczby = new int[pojemnosc];
    }


    @Override
    public void dodajElement(int liczba) {
        if(this.rozmiar == this.pojemnosc) {
            System.out.println("pełna tablica");
            this.liczby = Arrays.copyOf(this.liczby,  this.liczby.length*2);
            this.pojemnosc = this.liczby.length;
        }

            this.liczby[rozmiar] = liczba;
            rozmiar++;
    }

    @Override
    public int znajdź(int liczba) {
        return 0;
    }

    @Override
    public String pisz() {
        return null;
    }

    @Override
    public boolean usunPierwszy(int liczba) {
        return false;
    }

    @Override
    public void usunPowtorzenia() {

    }

    @Override
    public void zapiszDoPliku(String Plik) {

    }
     @Override
    public String toString(){
        return Arrays.toString(this.liczby);
     }
}

