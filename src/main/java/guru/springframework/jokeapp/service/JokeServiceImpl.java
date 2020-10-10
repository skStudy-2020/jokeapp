package guru.springframework.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {


    @Override
    public String getJoke() {
        return "Joke wil be availavle soon... ";
    }
}
