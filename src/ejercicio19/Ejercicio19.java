package ejercicio19;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.arturo.libreria.Libreria;
import com.arturo.libreria.Libro;

/**
 *
 * @author Arturo
 */
public class Ejercicio19{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Libreria lib=new Libreria();
        ArrayList<Libro> libreria=new ArrayList();
        libreria.add(new Libro("Bufalo bill", "pedro", "123a", 50f, 60));
        libreria.add(new Libro("La vida de Brian", "manuel", "456s", 20.2f, 500));
        libreria.add(new Libro("Amanecer", "pedro", "789t", 15.5f, 20));
        libreria.add(new Libro("Ziruelas", "david", "741g", 40.26f, 80));
        libreria.add(new Libro("Ectoplasmas y otras cosas", "alonso", "985m", 33.25f, 10));
        int selec;
        do{
            selec=Integer.parseInt(JOptionPane.showInputDialog("Seleciona: \n1 Añadir nuevo libro"
                    +"\n2 Vender libro \n3 Mostrar libreria \n4 Para Mostrar ordenado \n5 Dar libros de baixa"
                    +"\n6 Buscar libros \n0 Para Salir"));
            switch(selec){
                case 1:
                    lib.engadirLibro(libreria);
                    break;
                case 2:
                    lib.vender(libreria);
                    break;
                case 3:
                    lib.mostrar(libreria);
                    break;
                case 4:
                    lib.mostrarOrdenados(libreria);
                    break;
                case 5:
                    lib.darDeBaixa(libreria);
                    break;
                case 6:
                    lib.consultar(libreria);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El numero que ha introducido no es válido");
                    break;
            }
        }while(selec!=0);
    }

}
