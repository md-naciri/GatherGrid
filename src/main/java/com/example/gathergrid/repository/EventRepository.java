package com.example.gathergrid.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventRepository {
    private final EntityManagerFactory entityManagerFactory;

    public EventRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
    }
}
