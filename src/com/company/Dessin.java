package com.company;

public class Dessin {

    //Attributs

    protected int largeur;//pourquoi pas private?
    protected int hauteur;
    private char car = ' ';
    protected Toile[] histToiles;

    //Methodes

    public Dessin(int largeur, int longueur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public char getCar() {
        return car;
    }

    public void setCar(char car) {
        this.car = car;
    }


}
