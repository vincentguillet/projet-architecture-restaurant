package fr.groupe5.restaurant.commande;

import java.time.LocalDateTime;

public class Commande {
    private int idCommande;
    private int prixCommande;
    private LocalDateTime dateCommande;

    public Commande(int idCommande, int prixCommande, LocalDateTime dateCommande){
        this.idCommande = idCommande;
        this.prixCommande = prixCommande;
        this.dateCommande = dateCommande;
    }
    public int getIdCommande() {
        return this.idCommande;
    }
    public int getPrixCommande() {
    return this.prixCommande;
    }
    public LocalDateTime getDateCommande() {
        return this.dateCommande;
    }
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
}
    public void setPrixCommande(int prixCommande) {
        this.prixCommande = prixCommande;
}
    public void setDateCommande(LocalDateTime dateCommande) {
        this.dateCommande = dateCommande;
}
}