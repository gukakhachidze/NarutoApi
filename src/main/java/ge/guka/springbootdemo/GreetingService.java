package ge.guka.springbootdemo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String prepareGreeting(String name) {
        return "Hi " + name;

    }
}
