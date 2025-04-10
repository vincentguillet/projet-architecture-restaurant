package fr.groupe5.restaurant.client;

public class Client {

    private int idClient;
    private String nomClient;
    private String telephone;
    private String adresseMail;

    public Client(int idClient, String nomClient, String telephone, String adresseMail) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.telephone = telephone;
        this.adresseMail = adresseMail;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }
}
