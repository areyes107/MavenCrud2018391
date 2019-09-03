package org.angelreyes.sistema;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.angelreyes.dao.PersonaJpaController;
import org.angelreyes.dao.exceptions.NonexistentEntityException;
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
            do{
            System.out.println("--------Menu de opciones--------");
            System.out.println("--------------------------------");
            System.out.println("- 1. Mostrar personas por codigo");
            System.out.println("- 2. Agregar persona al SGBD----");
            System.out.println("- 3. Actualizar una tupla-------");
            System.out.println("- 4. Eliminar una tupla---------");
            System.out.println("- 5. Listar personas------------");
            System.out.println("- 6. Salir del programa---------");
            System.out.println("--------------------------------");
            System.out.println("Ingrese una opcion a realizar...");
            op = sc.nextInt();
            switch (op) {
            case 1:
                p = obtenerPersona();
                System.out.println(p);
                break;
                
            case 2:
                p = getPersona();
                if(personaDao.agregarPersona(p))
                    System.out.println("Se agrego a la persona con exito");
                else 
                    System.out.println("No se pudo agregar a la nueva persona");
                break;
                
            case 3:
                p = obtenerPersona();
                System.out.println(p);
                System.out.println("Ingrese los Nombres y Apellidos nuevos");
                p = new Persona(id, spersona.nextLine(), spersona.nextLine());
            
                try {
                    personaDao.editarPersona(p);
                    System.out.println("Registro actualizado correctamente");
                } catch (Exception ex) {
                    System.out.println("No se puede actualizar el registro");
                }
                break;
                
            case 4:
                p = obtenerPersona();
                System.out.println("¿Esta seguro de eliminar la siguiente persona?");
                System.out.println(p);
            
                try {
                    personaDao.eliminarPersona(id);
                    System.out.println("Registro eliminado correctamente");
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se puede eliminar el registro");
                }
                break;
                
            case 5:
                List<Persona> personas = personaDao.listarPersonas();
                for(Iterator<Persona> iterator = personas.iterator();iterator.hasNext();){
                    Persona next = iterator.next();
                    System.out.println(next);
                }
                break;
                
            case 6:
                System.out.println("Saliendo del programa!!");
                personaDao.cerrar();
                break;
                
            default :
                System.out.println("No es una opcion del menu");
        }
            }while(op != 6);
            
    }
    
    private static Persona obtenerPersona(){
        System.out.println("ingrese el codigo de la persona");
        id = sc.nextInt();
        p = personaDao.buscarPersona(id);
        return p;
    }
    
    private static Persona getPersona(){
        System.out.println("ingrese el codigo, los nombres y los apellidos de la persona");
        Persona p = new Persona(sc.nextInt(), spersona.nextLine(), spersona.nextLine());
        return p;
        
    }
}
