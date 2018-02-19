package com.arturo.libreria;

/**
 *
 * @author Arturo
 */
public class Libro implements Comparable{

    private String titulo, autor, isbn;
    private float prezo;
    private int nUnidades;

    public Libro(){
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int nUnidades){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.prezo=prezo;
        this.nUnidades=nUnidades;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public float getPrezo(){
        return prezo;
    }

    public void setPrezo(float prezo){
        this.prezo=prezo;
    }

    public int getnUnidades(){
        return nUnidades;
    }

    public void setnUnidades(int nUnidades){
        this.nUnidades=nUnidades;
    }

    @Override
    public String toString(){
        return ("Titulo: "+this.getTitulo()+" Autor: "+this.getAutor()+" ISBN: "+this.getIsbn()+" Prezo: "+this.getPrezo()+" Unidades: "+this.getnUnidades()+"\n");
    }

    @Override
    public int compareTo(Object o){
        Libro libro=(Libro) o;

        if(titulo.compareToIgnoreCase(libro.getTitulo())>0){
            return 1;
        }else if(titulo.compareToIgnoreCase(libro.getTitulo())==0){
            return 0;
        }else{
            return -1;
        }
    }
}
