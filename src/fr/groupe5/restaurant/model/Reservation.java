package fr.groupe5.restaurant.model;

import java.time.LocalDateTime;

public class Reservation {

    private int idReservation;
    private short nombrePersonnes;
    private LocalDateTime dateReservation;
    private Client client;

    public Reservation(int idReservation, short nombrePersonnes, LocalDateTime dateReservation, Client client) {
        this.idReservation = idReservation;
        this.nombrePersonnes = nombrePersonnes;
        this.dateReservation = dateReservation;
        this.client = client;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public short getNombrePersonnes() {
        return nombrePersonnes;
    }

    public Client getClient() {
        return client;
    }

    public void setNombrePersonnes(short nombrePersonnes) {
        this.nombrePersonnes = nombrePersonnes;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setClient(Client client) {
        this.client = client;
    }
 }
