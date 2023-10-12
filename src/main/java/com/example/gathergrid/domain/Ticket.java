package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private float price;
    private int availableQuantity;
    private TicketType type;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", availableQuantity=" + availableQuantity +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Float.compare(ticket.price, price) == 0 && availableQuantity == ticket.availableQuantity && type == ticket.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, availableQuantity, type);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public Ticket(float price, int availableQuantity, TicketType type) {
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.type = type;
    }

    public Ticket() {
    }
}
