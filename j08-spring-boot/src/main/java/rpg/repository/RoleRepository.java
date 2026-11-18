package rpg.repository;

import org.springframework.stereotype.Repository;
import rpg.model.Role;

import java.util.ArrayList;
import java.util.List;

// Partie optionnelle : les types de héros, gardés en mémoire.
@Repository
public class RoleRepository {
    private final List<Role> roles = new ArrayList<>();

    public RoleRepository() {
        roles.add(new Role("warrior", "Se bat au corps à corps et encaisse les coups"));
        roles.add(new Role("mage", "Lance des sorts puissants, mais reste fragile"));
        roles.add(new Role("archer", "Attaque à distance, flèche après flèche"));
        roles.add(new Role("priest", "Soigne et protège l'équipe"));
    }

    public List<Role> findAll() {
        return roles;
    }
}
