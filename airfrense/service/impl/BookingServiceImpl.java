package org.example.service.impl;

import org.example.domain.Booking;
import org.example.domain.BookingRequest;
import org.example.repository.BookingRepository;
import org.example.service.BookingService;

public class BookingServiceImpl implements BookingService {

    private int currentReference;
    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
        currentReference = 298394;
    }

    public Booking book(BookingRequest bookingRequest) {
        Booking result = new Booking(bookingRequest, currentReference);
        bookingRepository.save(result);
        ++currentReference;
        return result;
    }
}
