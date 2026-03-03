
public class CocheHibrido extends Vehiculo implements Electrico, Combustion {

    public CocheHibrido(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }


    public void arrancar() {
        System.out.println("El coche híbrido arranca en modo eléctrico");
    }


    public void cargarBateria() {
        System.out.println("Cargando batería del coche híbrido");
    }


    public void repostarCombustible() {
        System.out.println("Repostando combustible del coche híbrido");
    }
}
