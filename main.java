class Principal {

    public static void main(String[] args) {


        Vehiculo[] vehiculos = new Vehiculo[3];

        vehiculos[0] = new CocheElectrico("Tesla", "Model 3", 2023);
        vehiculos[1] = new CocheGasolina("Toyota", "Corolla", 2020);
        vehiculos[2] = new CocheHibrido("Toyota", "Prius", 2022);


        for (Vehiculo v : vehiculos) {

            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Año: " + v.getAnio());

            v.arrancar();


            if (v instanceof Electrico) {
                Electrico e = (Electrico) v;
                e.cargarBateria();
            }


            if (v instanceof Combustion) {
                Combustion c = (Combustion) v;
                c.repostarCombustible();
            }

            System.out.println("----------------------------");
        }
    }
}
