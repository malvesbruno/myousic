package com.malves.myousic.repository;

import com.malves.myousic.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    List<Quote> findByArtistIgnoreCase(String artist);
}