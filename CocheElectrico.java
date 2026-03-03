public class CocheElectrico extends Vehiculo implements Electrico {

    public CocheElectrico(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }


    public void arrancar() {
        System.out.println("El coche eléctrico arranca silenciosamente");
    }


    public void cargarBateria() {
        System.out.println("Cargando batería del coche eléctrico");
    }
}
