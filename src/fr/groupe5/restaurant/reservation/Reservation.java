package fr.groupe5.restaurant.reservation;

import java.time.LocalDateTime;

public class Reservation {

    private int idReservation;
    private short nombrePersonnes;
    private LocalDateTime dateReservation;

    public Reservation(int idReservation, short nombrePersonnes, LocalDateTime dateReservation) {
        this.idReservation = idReservation;
        this.nombrePersonnes = nombrePersonnes;
        this.dateReservation = dateReservation;
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

    public void setNombrePersonnes(short nombrePersonnes) {
        this.nombrePersonnes = nombrePersonnes;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }
}
