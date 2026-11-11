# Tests unitaires

Spé Dev Ada, J3 : tester son code avec JUnit 5.

## La démo : la calculatrice

Un projet Maven, avec JUnit 5. Ouvrez `pom.xml` comme projet Maven dans IntelliJ. Lancez
`Main` pour voir ce que rend la calculatrice, puis `CalculatorTest` pour la tester.

| Fichier | Ce qu'il fait |
|---|---|
| `pom.xml` | la dépendance JUnit 5 |
| `src/main/java/Calculator.java` | le code testé |
| `src/main/java/Main.java` | lance la calculatrice et affiche ce qu'elle rend, sans test |
| `src/test/java/CalculatorTest.java` | ses tests, écrits pendant la démo |

## Les fiches

À ouvrir dans un navigateur, dans `ressources/` : la démo (`Fiche_0_Demo_Calculatrice.html`),
puis FizzBuzz, le mot de passe et les chiffres romains.

## Les corrections

Une branche par exercice, publiée après sa correction : le code fourni, puis un commit
« correction », dans ce dossier.

| Branche | Contenu |
|---|---|
| `j03-exercice-1-fizzbuzz` | FizzBuzz, puis la règle Qix |
| `j03-exercice-2-mot-de-passe` | le mot de passe |
| `j03-exercice-3-chiffres-romains` | les chiffres romains |
