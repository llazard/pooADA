# Spé Dev Ada : les corrections

Les cours, les démos et les corrections de la spé Dev, en Java. Un dossier par journée,
avec son propre README.

| Dossier | Journée |
|---|---|
| [`j03-tests-unitaires/`](j03-tests-unitaires/) | J3 : les tests unitaires avec JUnit 5, la démo de la calculatrice |
| [`j05-poo-en-pratique/`](j05-poo-en-pratique/) | J5 : la POO en pratique, les quatre piliers, l'héritage et les interfaces |
| [`j07-api-sans-framework/`](j07-api-sans-framework/) | J7 : une API à la main, un serveur Java sans framework, et sa route de santé |

## Organisation des branches

La branche `main` contient, pour chaque journée, le cours et sa démo. Chaque exercice a sa
branche, préfixée par sa journée : elle ajoute la fiche et le code fourni, puis un commit
« correction ». Les branches sont publiées au fil des corrections.

| Branche | Contenu |
|---|---|
| `main` | les cours et les démos : la calculatrice du J3, les animaux du J5, la route de santé du J7, et son filtre en commentaire |
| `j03-exercice-1-fizzbuzz` | J3 : FizzBuzz, puis la règle Qix, testés avec JUnit |
| `j03-exercice-2-mot-de-passe` | J3 : le mot de passe, testé avec JUnit |
| `j03-exercice-3-chiffres-romains` | J3 : les chiffres romains, testés avec JUnit |
| `j05-exercice-1-heros` | J5 : l'équipe de héros, une interface, plusieurs classes qui l'implémentent |
| `j05-exercice-2-playlist` | J5 : la playlist, un attribut qui est un objet, une liste d'objets |
| `j05-exercice-3-salaries` | J5 : les salariés, une classe mère abstraite, la redéfinition |
| `j05-exercice-4-panier` | J5 : le panier, la surcharge de méthodes et de constructeurs |
| `j07-exercice-1-heros-types` | J7 : `GET /heroes`, et en option `GET /roles` |
| `j07-exercice-2-service-filtres` | J7 : le service, les filtres `?name=` et `?role=`. Part de l'exercice 1 |

Pour récupérer une correction :

```
git fetch
git switch j07-exercice-1-heros-types
```
