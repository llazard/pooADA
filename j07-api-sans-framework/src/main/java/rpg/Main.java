package rpg;

import com.sun.net.httpserver.HttpServer;
import rpg.controller.HealthController;
import rpg.controller.HeroController;
import rpg.controller.RoleController;
import rpg.repository.HeroRepository;
import rpg.repository.RoleRepository;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Un serveur qui écoute sur le port 8080 de votre machine.
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Les routes : chaque chemin est confié à un contrôleur.
        server.createContext("/health", new HealthController());
        server.createContext("/heroes", new HeroController(new HeroRepository()));
        server.createContext("/roles", new RoleController(new RoleRepository()));

        server.start();
        System.out.println("Serveur démarré sur http://localhost:8080");
        // main se termine ici, mais le serveur continue d'attendre des requêtes.
    }
}
