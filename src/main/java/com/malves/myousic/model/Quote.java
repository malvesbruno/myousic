package com.malves.myousic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artist;
    private String song;
    private String quote;
    private String imageUrl;

    public Quote() {}

    public Quote(Long id, String artist, String song, String quote, String imageUrl) {
        this.id = id;
        this.artist = artist;
        this.song = song;
        this.quote = quote;
        this.imageUrl = imageUrl;
    }

    // Construtor alternativo (sem o ID) — usado para criar novos Quotes
    public Quote(String artist, String song, String quote, String imageUrl) {
        this.artist = artist;
        this.song = song;
        this.quote = quote;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getSong() { return song; }
    public void setSong(String song) { this.song = song; }

    public String getQuote() { return quote; }
    public void setQuote(String quote) { this.quote = quote; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
