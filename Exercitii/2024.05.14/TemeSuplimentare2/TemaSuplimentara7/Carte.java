package TemaSuplimentara7;

public class Carte {
    
    String titlu;
    String autor;
    int numarPagini;

    public Carte(String titluString, String autor, int numarPagini) {

        this.titlu = titluString;
        this.autor = autor;
        this.numarPagini = numarPagini;
    }

    public void afiseazaDetali(){
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Numar pagini: " + numarPagini);
        System.out.println();
    }
}
