package ejerciciouf4_01;

import java.util.Scanner;

public class EjercicioUF4_01 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        System.out.println("Escribe un texto:");
        nombre = lector.nextLine();
        System.out.println("Longitud: "+nombre.length());   //metodo .length() para saber la longitud del texto introducido
        System.out.println("Mayúsucula: "+nombre.toUpperCase());    //metodo .toUpperCase() para poner el texto en mayúsulas
        System.out.println("Palabra a palabra");
        String[] array = nombre.split("-");   //El metodo .split() separa muestra el texto separado por palabras
        for (int i=0;i<array.length;i++){     
            System.out.println(array[i]);   
        } 
        int min=0;  //inicializo variable para contar las minúsculas
        for (int k=0;k<nombre.length();k++){   // con este for recorre el texto y cuenta las letras minúsculas
            if (Character.isLowerCase(nombre.charAt(k)))
                min++; 
        } 
        System.out.println("Hay "+min+" letras minúsculas");  
        
       for (int i=0;i<nombre.length();i++){ // recorre el texto y se muestra un triángulo por el metodo .substring()
                System.out.println(nombre.substring(0, nombre.length()-i));
        }

        lector.close();
	System.out.println("Fin del programa");

    }
    
}

