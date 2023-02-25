package abstraccionespolimorfismo;

/**
 *
 * @author Luis mendoza
 */
public class Manned extends Spaceships {

    private String type;
    private String function;
    private String fuelType;

    public Manned() {
    }

    public Manned(String name, String countryManufacture, String firstRelease, String lastLaunch, String fuelType) {
        super(name, countryManufacture, firstRelease, lastLaunch);
        this.fuelType = fuelType;
        this.type = "Tripulada";
        this.function = "Enviar humanos al espacio";
    }

    @Override
    public String storeShips() {

        return "Nombre: " + this.name + ", País fabricación: " + this.countryManufacture + ", Combustible usado: " + this.fuelType + ", Primer lanzamiento: " + this.firstRelease + ", Último lanzamiento: " + this.lastLaunch;
    }

    @Override
    public String spacecraftType() {

        return "Tipo: " + this.type;
    }

    @Override
    public String manufacturingFunction() {

        return "Funcionalidad: " + this.function;
    }

}
