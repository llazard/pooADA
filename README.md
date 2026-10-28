# La POO en pratique

Spé Dev Ada, J5 : les quatre piliers de la POO, l'héritage et les interfaces, en Java.

## Organisation des branches

La branche `master` contient le cours et la démo. Chaque exercice a sa branche, qui part de
`master` et ajoute la fiche, le code fourni et la suite du cours : ce qu'il faut retenir
de l'exercice. Le cours de `master` s'arrête au lancement de l'exercice 1.

| Branche | Contenu |
|---|---|
| `master` | le cours, et la démo des animaux |
| `exercice-1-heros` | l'équipe de héros : une interface, plusieurs classes qui l'implémentent |
| `exercice-2-playlist` | la playlist : un attribut qui est un objet, une liste d'objets |
| `exercice-3-salaries` | les salariés : une classe mère abstraite, la redéfinition |
| `exercice-4-panier` | le panier : la surcharge de méthodes et de constructeurs |

Pour commencer un exercice :

```
git checkout exercice-1-heros
```

## Structure

```
ressources/
  Cours_POO_En_Pratique.html   le cours, à ouvrir dans un navigateur
src/
  demo/                        la démo du cours
    Animal.java                classe mère abstraite de tous les animaux
    Dog.java, Cat.java, Duck.java
    Swimmer.java               interface : une capacité partagée par des animaux sans lien de parenté
    Main.java                  crée les animaux et les fait agir
```

Sur chaque branche d'exercice, la fiche est dans `ressources/`, et le code fourni dans son
propre package de `src/`, avec son `Main`.

## Le reflexion.md

À la fin de chaque exercice, répondez aux questions de la fiche dans un fichier
`reflexion.md`, une section par exercice. C'est le livrable de la journée.

## Exercice 2 : la playlist

La fiche : `ressources/Fiche_2_Playlist.html`. Le code fourni : `src/playlist/`. Lancez
`playlist.Main` pour la question 0.
Après la correction : `ressources/Cours_Exercice_2.html`, ce qu'il faut retenir.
