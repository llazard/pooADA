# La POO en pratique

Spé Dev Ada, J5 : les quatre piliers de la POO, l'héritage et les interfaces, en Java.

Le cours, à lire en ligne :
[Cours_POO_En_Pratique.html](https://htmlpreview.github.io/?https://github.com/llazard/pooADA/blob/main/j05-poo-en-pratique/ressources/Cours_POO_En_Pratique.html)

## Organisation des branches

La branche `main` contient, dans ce dossier, le cours et la démo. Chaque exercice a sa branche, qui part de
`main` et ajoute la fiche, le code fourni et la suite du cours : ce qu'il faut retenir
de l'exercice. Le cours de `main` s'arrête au lancement de l'exercice 1.

| Branche | Contenu |
|---|---|
| `main` | le cours, et la démo des animaux |
| `j05-exercice-1-heros` | l'équipe de héros : une interface, plusieurs classes qui l'implémentent |
| `j05-exercice-2-playlist` | la playlist : un attribut qui est un objet, une liste d'objets |
| `j05-exercice-3-salaries` | les salariés : une classe mère abstraite, la redéfinition |
| `j05-exercice-4-panier` | le panier : la surcharge de méthodes et de constructeurs |

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
