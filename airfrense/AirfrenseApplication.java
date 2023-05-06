package org.example;

import org.example.controller.BookingController;
import org.example.dto.BookingRequestDto;
import org.example.repository.impl.BookingRepositoryImpl;
import org.example.repository.impl.JetRepositoryImpl;
import org.example.service.impl.BookingServiceImpl;
import org.example.service.impl.JetServiceImpl;

public class AirfrenseApplication {
    public static void main(String[] args) throws Exception {

        JetRepositoryImpl julie = new JetRepositoryImpl();
        JetServiceImpl marc = new JetServiceImpl(julie);

        BookingRepositoryImpl david = new BookingRepositoryImpl();
        BookingServiceImpl annie = new BookingServiceImpl(david);
        BookingController jean = new BookingController(annie, marc);

        BookingRequestDto bookingRequestDto = new BookingRequestDto();
        bookingRequestDto.setFullname("Annie Versaire");
        bookingRequestDto.setDeparture("Paris");
        bookingRequestDto.setDestination("New York");
        bookingRequestDto.setStartAt("05/05/2023");
        bookingRequestDto.setEndAt("15/05/2023");
        bookingRequestDto.setJetType(1);

        int reference = jean.book(bookingRequestDto);
        System.out.println(reference);

        int reference2 = jean.book(bookingRequestDto);
        System.out.println(reference2);

    }
}