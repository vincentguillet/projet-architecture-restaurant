package fr.groupe5.restaurant.model;

public class Plat {
    private String nomPlat;
    private String descriptionPlat;
    private int prixPlat;

public Plat(String nomPlat, String descriptionPlat, int prixPlat) {
    this.nomPlat = nomPlat;
    this.descriptionPlat = descriptionPlat;
    this.prixPlat = prixPlat;
    }

//Getter
    public String getNomPlat() {
        return this.nomPlat;
    }
    public String getDescriptionPlat() {
    return this.descriptionPlat;
    }
    public int getPrixPlat() {
    return this.prixPlat;
    }
//Setter
    public void setNomPlat(String nomPlat) {
    this.nomPlat = nomPlat;
    }
    public void setDescriptionPlat(String descriptionPlat) {
    this.descriptionPlat = descriptionPlat;
    }
    public void setPrixPlat(int prixPlat) {
    this.prixPlat = prixPlat;
    }
}
