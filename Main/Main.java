
package Main;

import java.util.Scanner;

public class Main {////////

    public static void main(String[] args) {
         boolean continuar=true;
      int opc;
      int numero;
         
      ListasEnlazadas obj=new ListasEnlazadas();
      
      Scanner leer =new Scanner(System.in);
      while(continuar){
          System.out.println("********************");
          System.out.println("Menú");
          System.out.println("1.Insertar al principio");
          System.out.println("2.Insertar en una posición");
          System.out.println("3.Insertar al final");
          System.out.println("4.Eliminar");
          System.out.println("5.Mostrar");
          System.out.println("6.Salir");
          opc=leer.nextInt();
          System.out.println("********************");
          
          switch(opc){
              case 1:
                  System.out.println("Elemento a insertar");
                  numero=leer.nextInt();
                  obj.InsertaAlInicio(numero);
                  break;
              case 2:
                  System.out.println("Elemento a insertar");
                  numero=leer.nextInt();
                  obj.InsertarPosicion(numero);
                  break;
              case 3:
                  System.out.println("Elemento a insertar");
                  numero=leer.nextInt();
                  obj.InsertarAlFinal(numero);
                  break;
              case 4:
                 obj.Eliminar();
                  break;
              case 5:
                 obj.Mostrar();
                  break;
              case 6:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Opción incorrecta");
                  break;
          }
      }
    }
}
