package org.angelreyes.sistema;

import java.util.Scanner;
import org.angelreyes.dao.PersonaJpaController;
import org.angelreyes.dominio.Persona;


public class Principal {
    //definir nuestras variables
    //definir el scanner
    private static Scanner sc = new Scanner(System.in); //leer las opciones del usuario
    private static Scanner spersona = new Scanner (System.in);
    private static Persona p;
    private static PersonaJpaController personaDao = new PersonaJpaController();
    private static int op, id;
    
    
    
    public static void main(String[] args) {
            //definir el menu
            System.out.println("--------Menu de opciones--------");
            System.out.println("--------------------------------");
            System.out.println("- 1. Mostrar personas por codigo");
            System.out.println("- 2. Agregar persona al SGBD----");
            System.out.println("- 3. Actualizar una tupla-------");
            System.out.println("- 4. Eliminar una tupla---------");
            System.out.println("- 5. Listar personas------------");
            System.out.println("--------------------------------");
            System.out.println("Ingrese una opcion a realizar...");
            op = sc.nextInt();
    }
}
