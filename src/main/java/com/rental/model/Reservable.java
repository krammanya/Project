package com.rental.model;

import java.time.LocalDateTime;

public interface Reservable {
    boolean isReserved();
    void reserve(LocalDateTime startDate, LocalDateTime endDate);
    void cancelReservation();
}
