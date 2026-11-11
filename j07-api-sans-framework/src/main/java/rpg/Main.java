package rpg;

import com.sun.net.httpserver.HttpServer;
import rpg.controller.HealthController;
import rpg.controller.HeroController;
import rpg.controller.HeroDetailController;
import rpg.controller.RoleController;
import rpg.repository.HeroRepository;
import rpg.repository.RoleRepository;
import rpg.service.HeroService;
import rpg.service.RoleService;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Un serveur qui écoute sur le port 8080 de votre machine.
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Les couches s'assemblent à la main : les repositories dans les services, les services dans les contrôleurs.
        HeroRepository heroRepository = new HeroRepository();
        RoleRepository roleRepository = new RoleRepository();
        RoleService roleService = new RoleService(roleRepository); // partie optionnelle
        HeroService heroService = new HeroService(heroRepository, roleService);

        // Les routes : chaque chemin est confié à un contrôleur.
        server.createContext("/health", new HealthController());
        server.createContext("/heroes", new HeroController(heroService));
        server.createContext("/roles", new RoleController(roleService));
        server.createContext("/heroeswithdetail", new HeroDetailController(heroService)); // partie optionnelle

        server.start();
        System.out.println("Serveur démarré sur http://localhost:8080");
        // main se termine ici, mais le serveur continue d'attendre des requêtes.
    }
}
