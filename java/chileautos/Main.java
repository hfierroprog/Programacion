package pack;

public class Main {

    public static void main(String[] args){
        Auto auto1 = new Auto("2008 Chevrolet SPARK 0.8 DH",2950000,98000,"gris","manual",5,"Bencina","Los Lagos","Puerto Varas");
        
        auto1.setContactar("no");
        auto1.setComparar("si");
        
        System.out.println(auto1.obtenerTodo());
    }
}