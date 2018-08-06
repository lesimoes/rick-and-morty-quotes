package com.example.lesimoes.rickandmortyquotes;


public class Quote {


    private String quote;
    private String author;

    public Quote(String quote, String author) {
        this.setQuote(quote);
        this.setAuthor(author);
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.quote.toString();
    }
}
