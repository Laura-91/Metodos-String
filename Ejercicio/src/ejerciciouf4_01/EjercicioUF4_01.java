package ejerciciouf4_01;

import java.util.Scanner;

public class EjercicioUF4_01 {

    public static void main(String[] args) {
        String matrizIngles[][] = {         // matriz de dos dimensiones
            {"bear","oso"},
            {"cat","gato"},
            {"cheetah","guepardo"},
            {"dog","perro"},
            {"eagle","águila"},
            {"fish","pez"},
            {"frog","rana"},
            {"horse","caballo"},
            {"lion","león"},
            {"lizard","lagarto"},
            {"meerkat","suricata"},
            {"monkey","mono"},
            {"orangutan","orangután"},
            {"panther","pantera"},
            {"parrot","loro"},
            {"pig","cerdo"},
            {"tiger","tigre"},
            {"toad","sapo"},
            {"tortoise","tortuga"},
            {"mare","yegua"}
        };
        int cont_aciertos=0;    //inicializa contador de aciertos a 0
        int cont_fallos=0;      //inicializa contador de fallos a 0
        Scanner lector = new Scanner(System.in);    //crea el objeto Scanner para introducir datos por teclado
        for(int i=0;i<matrizIngles.length;i++){     //este for recorre las filas de la matriz
            String nombre;
            System.out.println("Traduce "+matrizIngles[i][0]);
            nombre = lector.nextLine();             // guarda en la variable nombre los datos introducidos por teclado
            for(int j=1; j<matrizIngles[0].length;j++){     //recorre las columnas de la matriz 
                
                if (nombre.equals(matrizIngles[i][j])){     //el método .equals compara el valor introducido por teclado 
                                                            //y el valor de la posición en cuestión de la matriz
                    System.out.println("Bien!");
                    cont_aciertos++;
                }
                else{
                   System.out.println("No, es "+ matrizIngles[i][j]);
                   cont_fallos++; 
                }
            }
        }
        lector.close();
        System.out.println("FIN DEL TEST");
        System.out.println("Has tenido "+cont_aciertos+" aciertos.");
        System.out.println("Has tenido "+cont_fallos+" fallos.");
        
    }
    
}
