package org.example.controller;

import org.example.domain.Booking;
import org.example.domain.BookingRequest;
import org.example.domain.Client;
import org.example.domain.Jet;
import org.example.dto.BookingRequestDto;
import org.example.service.BookingService;
import org.example.service.JetService;
import org.example.service.impl.BookingServiceImpl;
import org.example.service.impl.JetServiceImpl;

public class BookingController {

    private final BookingService bookingService;
    private final JetService jetService;

    public BookingController(BookingServiceImpl bookingService, JetServiceImpl jetService) {
        this.bookingService = bookingService;
        this.jetService = jetService;
    }

    public int book(BookingRequestDto bookingRequestDto) throws Exception {
        Client client = new Client(bookingRequestDto.getFullname());
        Jet jet = jetService.getJetByIndex(bookingRequestDto.getJetType());
        if (jet == null) {
            throw new Exception("Désolé, le jet n'a pas été trouvé !");
        }

        BookingRequest bookingRequest = new BookingRequest(client, jet,
                bookingRequestDto.getStartAt(), bookingRequestDto.getEndAt(),
                bookingRequestDto.getDeparture(), bookingRequestDto.getDestination());

        Booking booking = bookingService.book(bookingRequest);
        return booking.getReference();
    }
}
