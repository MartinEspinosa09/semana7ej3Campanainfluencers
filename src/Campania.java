import java.util.ArrayList;

public class Campania {
    private ArrayList<Influencer> influencers;

    public Campania() {
        this.influencers = new ArrayList<>();
    }

    public boolean agregarInfluencer(Influencer influencer) {
        if (influencer == null || influencer.getNombre() == null) {
            return false;
        }
        for (Influencer inf : influencers) {
            if (inf.getNombre().equalsIgnoreCase(influencer.getNombre())) {
                return false;
            }
        }
        influencers.add(influencer);
        return true;
    }

    public boolean eliminarInfluencer(String nombre) {
        if (nombre == null) {
            return false;
        }
        for (int i = 0; i < influencers.size(); i++) {
            Influencer inf = influencers.get(i);
            if (inf != null && inf.getNombre() != null
                    && inf.getNombre().equalsIgnoreCase(nombre)) {
                influencers.remove(i);
                return true;
            }
        }
        return false;
    }

    public String buscarInfluencer(String nombre) {
        if (nombre == null) {
            return "Nombre de influencer inválido.";
        }
        for (Influencer inf : influencers) {
            if (inf != null && inf.getNombre() != null
                    && inf.getNombre().equalsIgnoreCase(nombre)) {
                return inf.describir();
            }
        }
        return "No se encontró ningún influencer con el nombre: \"" + nombre + "\".";
    }

    public int calcularAlcanceTotal() {
        int alcanceTotal = 0;
        for (Influencer inf : influencers) {
            if (inf != null) {
                alcanceTotal += inf.getSeguidores();
            }
        }
        return alcanceTotal;
    }

    public double calcularCostoTotal() {
        double costoTotal = 0.0;
        for (Influencer inf : influencers) {
            if (inf != null) {
                costoTotal += inf.getCosto();
            }
        }
        return costoTotal;
    }

    public String mostrarResumen() {
        if (influencers.isEmpty()) {
            return "La campaña no tiene influencers contratados.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < influencers.size(); i++) {
            sb.append(i + 1).append(". ").append(influencers.get(i).describir());
            if (i < influencers.size() - 1) {
                sb.append("\n");
            }
        }
        sb.append(String.format("%nAlcance total: %,d seguidores", calcularAlcanceTotal()));
        sb.append(String.format("%nCosto total: $%.2f", calcularCostoTotal()));
        return sb.toString();
    }
}