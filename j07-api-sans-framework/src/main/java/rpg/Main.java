package rpg;

import com.sun.net.httpserver.HttpServer;
import rpg.controller.HealthController;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Un serveur qui écoute sur le port 8080 de votre machine.
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // La route : ce chemin est confié à ce contrôleur.
        server.createContext("/health", new HealthController());

        server.start();
        System.out.println("Serveur démarré sur http://localhost:8080");
        // main se termine ici, mais le serveur continue d'attendre des requêtes.
    }
}
