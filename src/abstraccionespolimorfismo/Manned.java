package abstraccionespolimorfismo;

/**
 * Representa la subclase Naves tripulada que extiende de la clase Spaceships.
 *
 * @author Lmendoza
 */
public class Manned extends Spaceships {

     /**
     * Representa atributos privados de la clase Manned,
     * tipo de datos: String.
     */
    private String type;
    private String function;
    private String fuelType;

     /**
     * Constructores: vacio.
     */
    public Manned() {
    }

    /**
     * Constructor con propiedades: Crea una instancia de la clase Unmanned con valor en los atributos.
     */
    public Manned(String name, String countryManufacture, String firstRelease, String lastLaunch, String fuelType) {
        super(name, countryManufacture, firstRelease, lastLaunch);
        this.fuelType = fuelType;
        this.type = "Tripulada";
        this.function = "Enviar humanos al espacio";
    }

       /*
    *Método sobrescrito de la clase abstracta para obtener el valor de las propiedades clase Manned.
    *@return : Devuelve las propiedades name, countryManufacture, fuelType, firstRelease, lastLaunch con sus valores.
    */
    @Override
    public String showSpacecraft() {

        return "Nombre: " + this.name + ", País fabricación: " + this.countryManufacture + ", Combustible usado: " + 
                    this.fuelType + ", Primer lanzamiento: " + this.firstRelease + ", Último lanzamiento: " + this.lastLaunch;
    }

     /*
    * Método sobrescrito de la clase abstracta para obtener el valor de la propiedad type de la clase Manned.
    *@return Devuelve el valor de la propiedad type.
    */
    @Override
    public String spacecraftType() {

        return "Tipo: " + this.type;
    }

    /*
    *étodo sobrescrito de la clase abstracta para obtener el valor de la propiedad function de la clase Manned.
    *@return Devuelve el valor de la propiedad function.
    */
    @Override
    public String manufacturingFunction() {

        return "Funcionalidad: " + this.function;
    }

}
