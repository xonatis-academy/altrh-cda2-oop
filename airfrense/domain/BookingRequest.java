package org.example.domain;

public class BookingRequest {

    private Client client;

    private Jet jet;

    private String startAt;
    private String endAt;
    private String departure;
    private String destination;

    public BookingRequest(Client client, Jet jet, String startAt, String endAt, String departure, String destination) {
        this.client = client;
        this.jet = jet;
        this.startAt = startAt;
        this.endAt = endAt;
        this.departure = departure;
        this.destination = destination;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Jet getJet() {
        return jet;
    }

    public void setJet(Jet jet) {
        this.jet = jet;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
