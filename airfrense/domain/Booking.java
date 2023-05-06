package org.example.domain;

public class Booking extends BookingRequest {

    private int reference;

    public Booking(BookingRequest bookingRequest, int reference) {
        super(bookingRequest.getClient(), bookingRequest.getJet(), bookingRequest.getStartAt(),
                bookingRequest.getEndAt(), bookingRequest.getDeparture(), bookingRequest.getDestination());
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
