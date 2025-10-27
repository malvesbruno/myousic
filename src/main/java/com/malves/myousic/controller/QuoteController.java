package com.malves.myousic.controller;

import com.malves.myousic.model.Quote;
import org.springframework.web.bind.annotation.*;

import com.malves.myousic.repository.QuoteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteRepository quoteRepository;
    private final Random random = new Random();

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;

        // Adicionando algumas frases iniciais (somente se banco estiver vazio)
        if (quoteRepository.count() == 0) {
            quoteRepository.save(new Quote("Eddie Vedder", "Love Boat Captain", "Já foi cantado antes, mas nunca é demais dizer. Tudo que você precisa é amor", "https://www.billboard.com/wp-content/uploads/media/eddie-vedder-pearl-jam-1992-nyc-performance-billboard-650.jpg?w=650&h=430&crop=1"));
            quoteRepository.save(new Quote("Chris Cornell", "I'm the highway", "Eu não sou suas rodas girando. Eu sou a estrada.", "https://www.vice.com/wp-content/uploads/sites/2/2017/05/1495479643912-1495202460496-GettyImages-685588878.jpeg"));
            quoteRepository.save(new Quote("Kurt Cobain", "Dumb", "Acho que sou burro ou, talvez, só alegre", "https://s2.glbimg.com/txLHi2P9xpS4cEsLcx-XkDYgsSM=/620x413/smart/e.glbimg.com/og/ed/f/original/2019/10/11/gettyimages-2225160.jpg"));
        }
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        return quotes.get(random.nextInt(quotes.size()));
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @GetMapping("/artist/{artist}")
    public List<Quote> getByArtist(@PathVariable String artist) {
        return quoteRepository.findByArtistIgnoreCase(artist);
    }

    @PostMapping
    public Quote addQuote(@RequestBody Quote quote) {
        return quoteRepository.save(quote);
    }

    @DeleteMapping("/{id}")
    public void removeQuote(@PathVariable Long id) {
        quoteRepository.deleteById(id);
    }
}