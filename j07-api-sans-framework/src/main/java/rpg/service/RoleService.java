package rpg.service;

import rpg.model.Role;
import rpg.repository.RoleRepository;

import java.util.List;

// Partie optionnelle de l'exercice 2 : le métier des types de héros.
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    // Le type qui porte ce nom, sans tenir compte des majuscules, ou null.
    public Role findByName(String name) {
        for (Role role : roleRepository.findAll()) {
            if (role.getName().equalsIgnoreCase(name)) {
                return role;
            }
        }
        return null;
    }
}
