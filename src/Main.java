public class Main {
    public static void main(String[] args) {
        Influencer inf1 = new Influencer("Sofía Tech", 120000, 850.00);
        Influencer inf2 = new Influencer("Mateo Gamer", 250000, 1500.00);
        Influencer inf3 = new Influencer("Valeria Fit", 95000, 620.50);
        Influencer inf4 = new Influencer("Carlos Viajes", 180000, 1100.00);
        Influencer inf5 = new Influencer("Ana Cocina", 75000, 500.00);

        Campania campania = new Campania();

        System.out.println("=== 1. AGREGAR INFLUENCERS SELECTIVAMENTE (4 DE 5) ===");
        System.out.println("Agregar Sofía Tech: " + campania.agregarInfluencer(inf1));
        System.out.println("Agregar Mateo Gamer: " + campania.agregarInfluencer(inf2));
        System.out.println("Agregar Carlos Viajes: " + campania.agregarInfluencer(inf4));
        System.out.println("Agregar Ana Cocina: " + campania.agregarInfluencer(inf5));

        System.out.println("\n=== 2. RESUMEN INICIAL ===");
        System.out.println(campania.mostrarResumen());

        System.out.println("\n=== 3. PRUEBA ALCANCE Y COSTO ===");
        System.out.printf("Alcance total: %,d seguidores%n", campania.calcularAlcanceTotal());
        System.out.printf("Costo total: $%.2f%n", campania.calcularCostoTotal());

        System.out.println("\n=== 4. PRUEBA BUSCAR ===");
        System.out.println("Contratado (Mateo Gamer): " + campania.buscarInfluencer("Mateo Gamer"));
        System.out.println("No contratado (Valeria Fit): " + campania.buscarInfluencer("Valeria Fit"));

        System.out.println("\n=== 5. PRUEBA ELIMINAR ===");
        System.out.println("Eliminar Ana Cocina (existente): " + campania.eliminarInfluencer("Ana Cocina"));
        System.out.println("Eliminar Valeria Fit (no contratada): " + campania.eliminarInfluencer("Valeria Fit"));
        System.out.println("Ana Cocina sigue existiendo independientemente: " + inf5.describir());

        System.out.println("\n=== 6. RESUMEN FINAL ===");
        System.out.println(campania.mostrarResumen());
    }
}