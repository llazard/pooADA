package rpg.service;

import org.springframework.stereotype.Service;

// Le métier de la route de santé. Ni HTTP ni JSON ici.
@Service
public class HealthService {

    public String status(String name) {
        return "ok " + name;
    }
}
