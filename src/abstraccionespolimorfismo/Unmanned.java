package abstraccionespolimorfismo;

/**
 * Representa la subclase nave no tripulada que extiende de la clase Spaceships.
 *
 * @author Lmendoza
 */
public class Unmanned extends Spaceships {

    /**
     * Representa atributos privados de la clase Unmanned,
     * tipo de datos: String.
     */
    private String type;
    private String function;
    private String fuelType;

    /**
     * Constructores: vacio.
     */
    public Unmanned() {
    }

    /**
     * Constructor con propiedades: Crea una instancia de la clase Unmanned con valor en los atributos.
     */
    public Unmanned(String name, String countryManufacture, String firstRelease, String lastLaunch, String fuelType) {
        super(name, countryManufacture, firstRelease, lastLaunch);
        this.fuelType = fuelType;
        this.type = "No Tripulada";
        this.function = "Estudiar cuerpos celestes";
    }

     /*
    *Método sobrescrito de la clase abstracta para obtener el valor de las propiedades clase Unmanned.
    *@return : Devuelve las propiedades name, countryManufacture, fuelType, firstRelease, lastLaunch con sus valores.
    */
    @Override
    public String showSpacecraft() {

             return "Nombre: " + this.name + ", País fabricación: " + this.countryManufacture + ", Combustible usado: " + 
                           this.fuelType + ", Primer lanzamiento: " + this.firstRelease + ", Último lanzamiento: " + this.lastLaunch;
    }

    /*
    * Método sobrescrito de la clase abstracta para obtener el valor de la propiedad type de la clase Unmanned.
    *@return Devuelve el valor de la propiedad type.
    */
    @Override
    public String spacecraftType() {

        return "Tipo: " + this.type;
    }

    /*
    *étodo sobrescrito de la clase abstracta para obtener el valor de la propiedad function de la clase Shuttles.
    *@return Devuelve el valor de la propiedad function.
    */
    @Override
    public String manufacturingFunction() {

        return "Funcionalidad: " + this.function;
    }

}
