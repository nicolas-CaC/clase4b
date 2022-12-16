package clase4adhoc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Clase4adhoc {

    public static void main(String[] args) {

        ClaseRandom objeto1 = new ClaseRandom('a', (byte)1);
        ClaseRandom objeto2 = new ClaseRandom('b', (byte)2);
        ClaseRandom objeto3 = new ClaseRandom('c', (byte)3);
        ClaseRandom objeto4 = new ClaseRandom('b', (byte)2);
        System.out.println(objeto1.a);
        System.out.println(objeto1.b);
        
        
        // LIST
        
        // ArrayList
        
        ArrayList lista = new ArrayList();
        lista.add("Juan");
        lista.add(2);
        lista.add(true);
        lista.add(objeto1);
        System.out.println("Elementos agregados:");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        
        lista.remove(1);
        System.out.println("Un elemento removido.");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        
        
        // LinkedList
        
        LinkedList lista2 = new LinkedList();
        lista2.add(3);
        lista2.add(1);
        lista2.add(2);
        lista2.add(1);
        
        for(int i = 0; i < lista2.size(); i++){
            System.out.println("Posicion " + i + " elemento: " + lista2.get(i));
        }
        
        // SETS
        
        Set <ClaseRandom> objetos = new HashSet<ClaseRandom>();
        objetos.add(objeto1);
        objetos.add(objeto3);
        objetos.add(objeto2);
        objetos.add(objeto1);
        objetos.add(objeto4);
        
        System.out.println("HashSet");
        for(ClaseRandom objeto: objetos)
            objeto.getDatos(objeto.hashCode());
         
        
        // LinkedHashSet
   
        Set <ClaseRandom> objetos2 = new LinkedHashSet<ClaseRandom>();
        objetos2.add(objeto1);
        objetos2.add(objeto3);
        objetos2.add(objeto2);
        objetos2.add(objeto1);
        objetos2.add(objeto4);
 
        System.out.println("\n\nLinkedHashSet");
        for(ClaseRandom objeto: objetos2)
            objeto.getDatos(objeto.hashCode());
        
        
        // Equals

        System.out.println("Pepe".equals("Pepe"));
        String x = "Pepe";
        String y = "Pepe";
        System.out.println(x.equals(y));
        System.out.println(objeto2.equals(objeto4));
        
    }

}
