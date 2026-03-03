
public class CocheGasolina extends Vehiculo implements Combustion {

    public CocheGasolina(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche de gasolina arranca con ruido");
    }

    @Override
    public void repostarCombustible() {
        System.out.println("Repostando gasolina");
    }
}
