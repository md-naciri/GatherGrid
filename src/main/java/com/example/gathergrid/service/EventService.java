package com.example.gathergrid.service;

import com.example.gathergrid.repository.EventRepository;

public class EventService {
    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}
