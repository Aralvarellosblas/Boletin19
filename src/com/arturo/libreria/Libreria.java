package com.arturo.libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Libreria{

    private Libro libro;

    public void engadirLibro(ArrayList<Libro> libreria){
        String titulo=JOptionPane.showInputDialog("Titulo del libro");
        String autor=JOptionPane.showInputDialog("Autor del libro");
        String isbn=JOptionPane.showInputDialog("ISBN del libro");
        Float prezo=Float.parseFloat(JOptionPane.showInputDialog("Prezo del libro"));
        int nUnidades=Integer.parseInt(JOptionPane.showInputDialog("Unidades del libro"));
        Libro libro=new Libro(titulo, autor, isbn, prezo, nUnidades);
        libreria.add(libro);

    }

    public void vender(ArrayList<Libro> libreria){
        String isbn=JOptionPane.showInputDialog("ISBN del libro a vender");
        for(int i=0; i<libreria.size(); i++){
            if(libreria.get(i).getIsbn().equalsIgnoreCase(isbn)){
                int venta=Integer.parseInt(JOptionPane.showInputDialog("Libros vendidos"));
                int unidades=libreria.get(i).getnUnidades();
                unidades=unidades-venta;
                libreria.get(i).setnUnidades(unidades);

            }
        }
    }

    public void mostrar(ArrayList<Libro> libreria){
        System.out.println("Mostrando Libreria...");
        Iterator it=libreria.iterator();
        while(it.hasNext()){
            Libro l=(Libro) it.next();
            System.out.println(l.toString());
        }
    }

    public void mostrarOrdenados(ArrayList<Libro> libreria){
        System.out.println("Ordenando...");
        Collections.sort(libreria);
        this.mostrar(libreria);
    }

    public void darDeBaixa(ArrayList<Libro> libreria){
        int marca=0;
        for(int i=0; i<libreria.size(); i++){
            if(libreria.get(i).getnUnidades()==0){
                libreria.remove(i);
                marca=1;
            }
        }
        if(marca==0){
            System.out.println("No existen libros para dar de baixa");
        }
    }

    public void consultar(ArrayList<Libro> libreria){
        int m;
        int marca=0;
        do{
            m=Integer.parseInt(JOptionPane.showInputDialog("Selec: \n1 Para buscar por titulo \n2 Para buscar por autor \n3 Para buscar un ISBN \n 0 Para salir"));
            switch(m){
                case 1:
                    String tit=JOptionPane.showInputDialog("Titulo");
                    for(int i=0; i<libreria.size(); i++){
                        if(libreria.get(i).getTitulo().equalsIgnoreCase(tit)){
                            System.out.println(libreria.get(i).toString());
                            marca=1;
                        }
                    }
                    if(marca==0){
                        JOptionPane.showMessageDialog(null, "No existe ese Titulo");
                    }
                    break;
                case 2:
                    String aut=JOptionPane.showInputDialog("Autor");
                    for(int i=0; i<libreria.size(); i++){
                        if(libreria.get(i).getAutor().equalsIgnoreCase(aut)){
                            System.out.println(libreria.get(i).toString());
                            marca=1;
                        }
                    }
                    if(marca==0){
                        JOptionPane.showMessageDialog(null, "No existe ese Autor");
                    }
                    break;
                case 3:
                    String isbn=JOptionPane.showInputDialog("ISBN");
                    for(int i=0; i<libreria.size(); i++){
                        if(libreria.get(i).getAutor().equalsIgnoreCase(isbn)){
                            System.out.println(libreria.get(i).toString());
                            marca=0;
                            break;
                        }else{
                            marca=1;
                        }
                    }
                    if(marca==1){
                        JOptionPane.showMessageDialog(null, "No existe ese ISBN");
                    }
                    break;
            }
        }while(m!=0);
    }
}
