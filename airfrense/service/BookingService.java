package org.example.service;

import org.example.domain.Booking;
import org.example.domain.BookingRequest;

public interface BookingService {
    Booking book(BookingRequest bookingRequest);
}
