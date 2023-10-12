package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;
    private Rating rating;
    @ManyToOne
    private User user;
    @ManyToOne
    private Event event;

    public Comment() {
    }

    public Comment(String text, Rating rating, User user, Event event) {
        this.text = text;
        this.rating = rating;
        this.user = user;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(text, comment.text) && rating == comment.rating && Objects.equals(user, comment.user) && Objects.equals(event, comment.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, rating, user, event);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", user=" + user +
                ", event=" + event +
                '}';
    }
}
