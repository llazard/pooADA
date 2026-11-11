# Une API à la main

Spé Dev Ada, J7 : passer d'un programme qui se termine à un serveur qui écoute, en Java,
sans framework. Le `HttpServer` du JDK, et Jackson pour écrire le JSON.

## La démo : la route de santé

`demo/` est un projet Maven. Ouvrez son `pom.xml` dans IntelliJ, puis lancez `rpg.Main`.

```
GET http://localhost:8080/health
{"status":"ok"}   200
```

| Fichier | Ce qu'il fait |
|---|---|
| `pom.xml` | Jackson, et `maven.compiler.parameters`, qui donne à Jackson les noms des paramètres des constructeurs |
| `rpg/Main.java` | crée le serveur sur le port 8080, confie `/health` au `HealthController`, et le démarre |
| `rpg/controller/HealthController.java` | répond `{"status":"ok"}`, code 200 |
| `rpg/controller/Json.java` | **fournie** : toutes les réponses passent par `Json.send(exchange, code, objet)`, Jackson écrit le JSON |

Avant de relancer `Main`, arrêtez le serveur précédent : sinon
`BindException: Address already in use`, le port 8080 est déjà pris.

## Les fiches

À ouvrir dans un navigateur, dans `ressources/` :

| Fiche | Exercice |
|---|---|
| `Fiche_0_Route_Sante.html` | la route de santé, refaite seul·es dans un projet neuf. Le corrigé est `demo/` |
| `Fiche_1_Heros_Et_Types.html` | `GET /heroes`, et en option `GET /roles` |
| `Fiche_2_Service_Filtres.html` | le service, les filtres `?role=` et `?name=`, et ses tests |
| `Fiche_3_Recruter_Heros.html` | optionnel : `POST /heroes`, recruter un héros |

## Les corrections

Une branche par exercice, publiée après sa correction. Le projet corrigé est dans
`j07-api-sans-framework/rpg-api/`.

| Branche | Contenu |
|---|---|
| `j07-exercice-1-heros-types` | le code fourni (`Hero` et `HeroRepository`), puis la correction de l'exercice 1, partie optionnelle comprise (`Role`, `/roles`) |
| `j07-exercice-2-service-filtres` | part de l'exercice 1 : le service, les filtres, les tests, et la partie optionnelle `GET /heroes/2` |
| `j07-exercice-3-recruter-heros` | part de l'exercice 2 : `POST /heroes` |
