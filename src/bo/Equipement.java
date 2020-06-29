package bo;

public class Equipement {
    private int id;
    private String libelle;

    /**
     *
     * @param libelle
     */
    public Equipement(String libelle) {
        this.libelle = libelle;
    }

    /**
     *
     * @param id
     * @param libelle
     */
    public Equipement(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return  "libelle = " + libelle + "\n";
    }
}
