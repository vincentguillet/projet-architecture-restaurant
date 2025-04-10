package fr.groupe5.restaurant.model;

public class Menu {

    private int idMenu;
    private String nomMenu;
    private int prixMenu;

    public Menu(int idMenu, String nomMenu, int prixMenu) {
        this.idMenu = idMenu;
        this.nomMenu = nomMenu;
        this.prixMenu = prixMenu;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNomMenu() {
        return nomMenu;
    }

    public void setNomMenu(String nomMenu) {
        this.nomMenu = nomMenu;
    }

    public int getPrixMenu() {
        return prixMenu;
    }

    public void setPrixMenu(int prixMenu) {
        this.prixMenu = prixMenu;
    }
}