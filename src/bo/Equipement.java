package bo;

public class Equipement {
    private int id;
    private String libelle;

    public Equipement(String libelle) {
        this.libelle = libelle;
    }

    public Equipement(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
