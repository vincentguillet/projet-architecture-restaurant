package fr.groupe5.restaurant.model;

import java.time.LocalDateTime;

public class Commande {
    private int idCommande;
    private int prixCommande;
    private LocalDateTime dateCommande;
    private Client client;

    public Commande(int idCommande, int prixCommande, LocalDateTime dateCommande, Client client) {
        this.idCommande = idCommande;
        this.prixCommande = prixCommande;
        this.dateCommande = dateCommande;
        this.client = client;
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
    public Client getClient() {return this.client;}
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
}
    public void setPrixCommande(int prixCommande) {
        this.prixCommande = prixCommande;
}
    public void setDateCommande(LocalDateTime dateCommande) {
        this.dateCommande = dateCommande;
}
    public void setClient(Client client) {
        this.client = client;
    }
}