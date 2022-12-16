package clase4adhoc;

public class ClaseRandom {

    public char a;
    public byte b;
  
    public ClaseRandom(char a, byte b) {
        this.a = a;
        this.b = b;
    }
    
    public void getDatos(int hash){
            System.out.println("Objeto hash nro." + hash + " campo a: " + a);
            System.out.println("Objeto hash nro." + hash + " campo b: " + b);
    }
    
    public boolean equals(Object obj){
        
        if(obj instanceof ClaseRandom){
            ClaseRandom objeto = (ClaseRandom)obj;
            
            return this.a == objeto.a && this.b == objeto.b;
        }
        else {
            return false;
        }
    }

    
}
