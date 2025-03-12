package TemaSuplimentara7;

import java.util.ArrayList;

public class Biblioteca {
    
    ArrayList<Carte> carti;
    /*
     *  INDEXUL PE CARE IL AFISEAZA METODA DE CAUTARE CARTE,
     *  ESTE CRESCUT CU UNUL DUPACARE METODELE CARE FOLOSESC
     *  INDEXUL IL SCAD CU UNU.
     *  (Mi s-a parut ca este mai user friendly asa)
     */
    public Biblioteca() {

        this.carti = new ArrayList<Carte>();
    }
    
    public void adaugaCarte(Carte carte) {
        this.carti.add(carte);
    }

    //scoate cartea de la indexul specificat
    public void scoateCarte(int index) {
        this.carti.remove(index - 1);
    }

    //afiseaza titlurile cartilor din biblioteca
    public void afiseazaCarti(){
        System.out.println(this.toString());
    }

    //Cauta si afiseaza indexul carti a carui titlu a fost introdus
    public void cautaCarte(String titlu) {
        for (int i = 0; i < this.carti.size(); i++) {
            if (this.carti.get(i).titlu.equals(titlu)) {
                System.out.println(titlu + ", este cartea cu numarul:" + (i + 1));
            }
        }
    }

    //Afiseaza detaliile cartii de la indexul specificat
    public void afiseazaDetaliCarte(int index) {
        this.carti.get(index - 1).afiseazaDetali();
    }

    public static void main(String[] args) {
        
        Carte carte = new Carte("De veghe in lanul de secara", "J.D Salinger", 340);
        Carte carte1 = new Carte("Amintiri din copilarie", "Ion Creanga", 540);
        Carte carte2 = new Carte("Maytrei", "Mircea Eliade", 240);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adaugaCarte(carte);
        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);

        biblioteca.afiseazaCarti();
        biblioteca.afiseazaDetaliCarte(2);
        biblioteca.cautaCarte("De veghe in lanul de secara");
        biblioteca.scoateCarte(1);
        biblioteca.afiseazaCarti();
    }

    public String toString() {

        String cartiInBliblioteca = "\n";
        int i = 1;
        for(Carte carte : this.carti) {
            cartiInBliblioteca += i + "." + carte.titlu + "\n";
            i++;
        }

        return cartiInBliblioteca;
    }
}
