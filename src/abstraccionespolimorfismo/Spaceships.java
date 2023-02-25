package abstraccionespolimorfismo;

/**
 * Representa una Cuenta naves espaciales Abstracta con sus atributos protegida.
 *
 * @author Lmendoza
 */
public abstract class Spaceships {
    
     /**
     * Representa atributos protegidos de la clase Spaceships Abstracta,
     * tipo de datos: String.
     */
    protected String name;
    protected String countryManufacture;
    protected  String firstRelease;
     protected  String lastLaunch;

     /**
     * Constructores: vacio.
     */
    protected Spaceships() {
    }

    /**
     * Constructores: Con la inicialización de las propiedades.
     */
    protected Spaceships(String name, String countryManufacture, String firstRelease, String lastLaunch) {
        this.name = name;
        this.countryManufacture = countryManufacture;
        this.firstRelease = firstRelease;
        this.lastLaunch = lastLaunch;
    }

    
     /*
    * Métodos Abstractos de la clase Spaceships.
     */
    public abstract String showSpacecraft();
    
     public abstract String spacecraftType();

    public abstract String manufacturingFunction();
    
   
 

}
