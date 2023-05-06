package org.example.repository.impl;

import org.example.domain.Booking;
import org.example.repository.BookingRepository;

import java.util.ArrayList;

public class BookingRepositoryImpl implements BookingRepository {

    private final ArrayList<Booking> bookings;

    public BookingRepositoryImpl() {
        bookings = new ArrayList<>();
    }

    public void save(Booking booking) {
        bookings.add(booking);
    }



}
