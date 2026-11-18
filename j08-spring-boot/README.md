# La même API, en Spring Boot

Spé Dev Ada, J8 : l'API de J7, les mêmes routes, avec Spring Boot. Un projet généré par
Spring Initializr, avec **Spring Web** et **SpringDoc OpenAPI**.

## La démo : la route de santé et son filtre

Ce dossier est un projet Maven, généré sur https://start.spring.io : `pom.xml` et `src/`.
Ouvrez-le dans IntelliJ, puis lancez `rpg.RpgApiApplication`. La console affiche
`Tomcat started on port 8080 (http)`.

```
GET http://localhost:8080/health
{"status":"ok"}   200

GET http://localhost:8080/health?name=Lucie
{"status":"ok Lucie"}   200
```

| Fichier | Ce qu'il fait |
|---|---|
| `pom.xml` | Spring Boot, Spring Web et SpringDoc OpenAPI |
| `rpg/RpgApiApplication.java` | généré : `SpringApplication.run` démarre Tomcat sur le port 8080, et cherche les classes annotées dans le paquet `rpg` |
| `rpg/controller/HealthController.java` | `@RestController` : `GET /health`, et le filtre `name` lu par `@RequestParam` |
| `rpg/service/HealthService.java` | `@Service`, le métier : `status` rend `ok Lucie`. Spring le donne au contrôleur |

Ce qui a disparu depuis J7 : `HttpServer`, `createContext`, `handle`, `UtilsController`,
et la classe `Json`. Spring Web apporte Jackson, et l'appelle pour vous.

Votre API documentée : http://localhost:8080/swagger-ui.html

Avant de relancer, arrêtez le serveur précédent : sinon `Port 8080 was already in use`.

## Les corrections

Une branche par exercice, publiée après sa correction : elle remplace le `src/` de ce
dossier par le code de l'exercice.

| Branche | Contenu |
|---|---|
| `j08-exercice-1-heros-filtres` | `GET /heroes` et ses filtres `?name=`, `?role=`, et les deux à la fois. Partie optionnelle : `GET /roles`, `GET /roles?name=`, `GET /heroeswithdetail` |
| `j08-exercice-2-ajouter-modifier-supprimer` | part de l'exercice 1 : `POST /heroes`, `PUT /heroes/{name}`, `DELETE /heroes/{name}` |
