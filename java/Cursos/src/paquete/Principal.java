package paquete;

public class Principal {
    public static void main(String[] args){
        Curso[] online = new Curso[4];
        Curso_paga[] paga = new Curso_paga[3];
        
        online[0] = new Curso("JAVA DESDE CERO", "ONLINE", 120,"JAVA");
        online[1] = new Curso("PYTHON EN 24 HORAS", "ONLINE", 24,"PYTHON");
        online[2] = new Curso("C# AVANZADO", "ONLINE", 120,"C#");

        
        for(int i = 0;i < 3;i++){
            System.out.println(online[i].RetornarTodo());
            System.out.println("\n-------------------------------------------------------------------------\n");
        }
        
        paga[0] = new Curso_paga("CURSO DESARROLLO DE VIDEOJUEGOS UNREAL", "ONLINE", 100,"C++", 16900);
        paga[1] = new Curso_paga("CURSO MAESTRO PYTHON 3: APRENDE DESDE CERO", "ONLINE", 21,"PYTHON 3", 6663);
        paga[2] = new Curso_paga("APRENDE MYSQL DESDE 0", "ONLINE", 21,"PYTHON 3", 6663);
        
        //Polimorfismo
        Curso_paga poli_paga = new Curso_paga("CURSO ANDROID STUDIO AVANZADO", "ONLINE", 400, "JAVA, XML, SQL", 150000);
        online[3] = poli_paga;
        
        System.out.println(online[3].RetornarTodo());
        
    }
}
