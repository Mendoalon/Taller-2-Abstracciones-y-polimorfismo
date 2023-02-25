package abstraccionespolimorfismo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class AbstraccionesPolimorfismo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        System.out.println("==== Bienvenido a la aplicación donde aprenderá la clasificación de las naves espaciales. ====");
        System.out.println("Las naves espaciales se clasifican en 3, las cuales son: Naves Lanzaderas, Naves no tripuladas y Naves tripuladas.");

        while (!exit)
        {
            System.out.println("Menu:\n1. Naves Lanzaderas. \n2. Naves no tripuladas. \n3. Naves tripuladas. \n4. Para salir. ");

            try
            {
                ArrayList<String> naves = new ArrayList<String>();
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option)
                {
                    case 1:
                        Spaceships Shuttles1 = new ShuttleVehicles("Saturno V", "EE.UU", "1967", "1973", "H(lig) + O(lig)");
                        naves.add(Shuttles1.storeShips());
                        Spaceships Shuttles2 = new ShuttleVehicles("Energia", "Rusia", "1987", "1988", "C2H8N2 + NO");
                        naves.add(Shuttles2.storeShips());
                        Spaceships Shuttles3 = new ShuttleVehicles("H-IIA", "Japon", "2001", "Vigente", "Solido + N(lig) + O(lig)");
                        naves.add(Shuttles3.storeShips());
                        Spaceships Shuttles4 = new ShuttleVehicles("Larga Marcha 3B", "China", "1996", "Vigente", "UDMH + N2O4");
                        naves.add(Shuttles4.storeShips());

                        System.out.println(Shuttles1.spacecraftType());
                        System.out.println(Shuttles1.manufacturingFunction());
                        for (String nave : naves)
                        {
                            System.out.println(nave);
                        }
                        break;

                    case 2:
                        Spaceships unmanned1 = new Unmanned("Galileo", "EE.UU", "1989", "1995", "N(comp) + N4H4");
                        naves.add(unmanned1.storeShips());
                        Spaceships unmanned2 = new Unmanned("Luna 1", "Rusia", "1959", "Vigente", "N4H4 + Amina");
                        naves.add(unmanned2.storeShips());
                        Spaceships unmanned3 = new Unmanned("Soho", "Europa", "1995", "Vigente", "MMH + NO");
                        naves.add(unmanned3.storeShips());
                        Spaceships unmanned4 = new Unmanned("Explorer", "EE.UU", "1958", "1970", "Solido + Liquido");
                        naves.add(unmanned4.storeShips());

                        System.out.println(unmanned1.spacecraftType());
                        System.out.println(unmanned1.manufacturingFunction());
                        for (String nave : naves)
                        {
                            System.out.println(nave);
                        }
                        break;

                    case 3:
                        Spaceships manned1 = new Manned("Apolo", "EE.UU", "1966", "1975", "NO4 + UDMH");
                        naves.add(manned1.storeShips());
                        Spaceships manned2 = new Manned("Vostok", "Rusia", "1960", "1963", "NO + Amina");
                        naves.add(manned2.storeShips());
                        Spaceships manned3 = new Manned("Shenzou", "China", "1999", "Vigente", "N2O4 + MMH");
                        naves.add(manned3.storeShips());
                        Spaceships manned4 = new Manned("Modulo Lunar", "EE.UU", "1968", "1972", "Aerozina50 + NO4");
                        naves.add(manned4.storeShips());

                        System.out.println(manned1.spacecraftType());
                        System.out.println(manned1.manufacturingFunction());
                        for (String nave : naves)
                        {
                            System.out.println(nave);
                        }
                        break;

                    case 4:
                        System.out.println("¡Ha salido de la aplicación, vuelva pronto!");
                        exit = true;
                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 4");

                }
            } catch (InputMismatchException e)
            {
                System.out.println("Debe ingresar un número");
                scanner.next();
            }
        }

    }

}
