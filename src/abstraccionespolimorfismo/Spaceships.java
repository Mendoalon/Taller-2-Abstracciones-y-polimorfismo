package abstraccionespolimorfismo;

/**
 *
 * @author Luis mendoza
 */
public abstract class Spaceships {
    protected String name;
    protected String countryManufacture;
    protected  String firstRelease;
     protected  String lastLaunch;

    protected Spaceships() {
    }

    protected Spaceships(String name, String countryManufacture, String firstRelease, String lastLaunch) {
        this.name = name;
        this.countryManufacture = countryManufacture;
        this.firstRelease = firstRelease;
        this.lastLaunch = lastLaunch;
    }

    public abstract String storeShips();
    
     public abstract String spacecraftType();

    public abstract String manufacturingFunction();
    
   
  


}
