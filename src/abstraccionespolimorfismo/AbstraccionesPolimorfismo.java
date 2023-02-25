package abstraccionespolimorfismo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa la clase principal del proyecto.
 * @author Luis mendoza
 */
public class AbstraccionesPolimorfismo {

    
     /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {

    
        //Creación de variable Scanner para capturar los datos de teclado.
        Scanner scanner = new Scanner(System.in);
        
    
        //Creación de variable tipo booleana.
        boolean exit = false;
        
        //Creación de variable tipo int.
        int option;

        //Se muestra en consola un mensaje de bienvenida a la aplicación.
        System.out.println("==== Bienvenido a la aplicación donde aprenderá la clasificación de las naves espaciales. ====");
        System.out.println("Las naves espaciales se clasifican en 3, las cuales son: Naves Lanzaderas, Naves no tripuladas y Naves tripuladas.");

        //Se crea la condición para mostrar el menú.
        while (!exit){
            System.out.println("Menu:\n1. Naves Lanzaderas. \n2. Naves no tripuladas. \n3. Naves tripuladas. \n4. Para salir. ");

            //Se crea un try catch para capturar los errores y evitar que la aplicación se bloque.
            try{
                
                //Creación de variable tipo ArrayList.
                ArrayList<String> naves = new ArrayList<String>();
     
                //Se captura el dato que el usuario ingreso.
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                 //Se crea  switch-case para validar el dato ingresado por el usuario.
                switch (option){
                    
                    //Si el usuario ingreso un número del 1 al 3 se crean los 4 objetos y los mostramos. 
                    case 1:
                        
                       //Creación de objeto con valores en sus atributos.
                        Spaceships Shuttles1 = new Shuttles("Saturno V", "EE.UU", "1967", "1973", "H(lig) + O(lig)");
                        
                        //Se guarda el objeto creado en la variable naves tipo ArrayList.
                        naves.add(Shuttles1.showSpacecraft());
                        Spaceships Shuttles2 = new Shuttles("Energia", "Rusia", "1987", "1988", "C2H8N2 + NO");
                        naves.add(Shuttles2.showSpacecraft());
                        Spaceships Shuttles3 = new Shuttles("H-IIA", "Japon", "2001", "Vigente", "Solido + N(lig) + O(lig)");
                        naves.add(Shuttles3.showSpacecraft());
                        Spaceships Shuttles4 = new Shuttles("Larga Marcha 3B", "China", "1996", "Vigente", "UDMH + N2O4");
                        naves.add(Shuttles4.showSpacecraft());
                        
                        //Se muesta el tipo de nave y funcionalidad.
                        System.out.println(Shuttles1.spacecraftType());
                        System.out.println(Shuttles1.manufacturingFunction());
                        
                        //Se recorre la variable naves con un foreach  y se imprime los objetos guardados. 
                        for (String nave : naves){
                            System.out.println(nave);
                        }
                        break;

                    case 2:
                        Spaceships unmanned1 = new Unmanned("Galileo", "EE.UU", "1989", "1995", "N(comp) + N4H4");
                        naves.add(unmanned1.showSpacecraft());
                        Spaceships unmanned2 = new Unmanned("Luna 1", "Rusia", "1959", "Vigente", "N4H4 + Amina");
                        naves.add(unmanned2.showSpacecraft());
                        Spaceships unmanned3 = new Unmanned("Soho", "Europa", "1995", "Vigente", "MMH + NO");
                        naves.add(unmanned3.showSpacecraft());
                        Spaceships unmanned4 = new Unmanned("Explorer", "EE.UU", "1958", "1970", "Solido + Liquido");
                        naves.add(unmanned4.showSpacecraft());

                        System.out.println(unmanned1.spacecraftType());
                        System.out.println(unmanned1.manufacturingFunction());
                        for (String nave : naves){
                            System.out.println(nave);
                        }
                        break;

                    case 3:
                        Spaceships manned1 = new Manned("Apolo", "EE.UU", "1966", "1975", "NO4 + UDMH");
                        naves.add(manned1.showSpacecraft());
                        Spaceships manned2 = new Manned("Vostok", "Rusia", "1960", "1963", "NO + Amina");
                        naves.add(manned2.showSpacecraft());
                        Spaceships manned3 = new Manned("Shenzou", "China", "1999", "Vigente", "N2O4 + MMH");
                        naves.add(manned3.showSpacecraft());
                        Spaceships manned4 = new Manned("Modulo Lunar", "EE.UU", "1968", "1972", "Aerozina50 + NO4");
                        naves.add(manned4.showSpacecraft());

                        System.out.println(manned1.spacecraftType());
                        System.out.println(manned1.manufacturingFunction());
                        for (String nave : naves){
                            System.out.println(nave);
                        }
                        break;

                    case 4:
                         //Si el usuario ingreso el número 4 mostramos la salida y terminamos el programa. 
                        System.out.println("¡Ha salido de la aplicación, vuelva pronto!");
                        exit = true;
                        break;

                    default:
                         //Si el usuario ingreso un número diferente al menú mostramos un mensaje y cargamos el menú nuevamente.
                        System.out.println("Las opciones son entre 1 y 4");

                }
            } catch (InputMismatchException e) {
                //Si el usuario ingreso un una letra mostramos un mensaje y cargamos el menú nuevamente.
                System.out.println("Debe ingresar un número");
                scanner.next();
            }
        }

    }

}
