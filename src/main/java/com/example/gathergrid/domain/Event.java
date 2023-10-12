package com.example.gathergrid.domain;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date date;
    private Time time;
    private String location;
    @ManyToOne
    private EventCategory category;
    private String description;
    private TicketType ticketType;

    public Event() {
    }

    public Event(String name, Date date, Time time, String location, String description, TicketType ticketType) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
        this.ticketType = ticketType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", ticketType=" + ticketType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name) && Objects.equals(date, event.date) && Objects.equals(time, event.time) && Objects.equals(location, event.location) && Objects.equals(description, event.description) && ticketType == event.ticketType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, time, location, description, ticketType);
    }
}
