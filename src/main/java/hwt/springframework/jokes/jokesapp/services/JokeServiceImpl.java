package hwt.springframework.jokes.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getChuckNorrisQuotes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
