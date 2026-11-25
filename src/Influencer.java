public class Influencer {
    private String nombre;
    private int seguidores;
    private double costo;

    public Influencer(String nombre, int seguidores, double costo) {
        this.nombre = nombre;
        this.seguidores = seguidores;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public double getCosto() {
        return costo;
    }

    public String describir() {
        return String.format("%s | Seguidores: %,d | Costo: $%.2f", nombre, seguidores, costo);
    }
}