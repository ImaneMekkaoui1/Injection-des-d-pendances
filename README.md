# Inversion de Contrôle (IoC) et Injection de Dépendances (DI)

Bienvenue dans ce projet de TP portant sur les concepts fondamentaux de l’architecture Java EE : l’Inversion de Contrôle (IoC) et l’Injection de Dépendances (DI).

## Objectif

Comprendre comment passer d’un code rigide (couplage fort) à une architecture flexible et évolutive (couplage faible) en utilisant différentes approches :

- Instanciation directe (new)
- Réflexion Java
- Spring (configuration XML)
- Spring (annotations)

---

# Architecture du Projet

Le projet est organisé en quatre couches principales afin de respecter la séparation des responsabilités.

## Couche DAO (`net.imane.dao`)

- Interface `IDao`
- Implémentations :
  - `DaoImpl`
  - `DaoImplV2`
- Rôle : simuler la récupération des données.

## Couche Métier (`net.imane.metier`)

- Interface `IMetier`
- Implémentation `MetierImpl`
- Rôle : contient la logique de calcul.

## Couche Extension (`net.imane.ext`)

- Contient `DaoImplV2`
- Permet de tester l’évolutivité du système sans modifier la couche métier.

## Couche Présentation (`net.imane.pres`)

- Classes de test :
  - `Pres1`
  - `Pres2`
  - `PresSpringXML`
  - `PresSpringAnnotation`

---

# Les 4 Étapes de l’Évolution

## 1. Couplage Fort – `Pres1`

- Instanciation directe avec le mot-clé `new`.

Verdict :  
Simple à comprendre, mais trop rigide.  
Si on change l’implémentation du DAO, il faut modifier le code (violation du principe Open/Closed).

---

## 2. La Réflexion Java – `Pres2`

Utilisation d’un fichier `config.txt` pour charger les classes dynamiquement au runtime.

Étapes :
- Lecture du fichier
- Chargement des classes avec `Class.forName()`
- Injection via constructeur dynamique

Verdict :  
On peut changer d’implémentation sans recompiler le code.  
Respect du principe Open/Closed.

---

## 3. Spring – Version XML (`PresSpringXML`)

- Gestion des objets (Beans) déléguée à Spring.
- Configuration via `applicationContext.xml`.
- Déclaration des beans et dépendances en dehors du code Java.

Verdict :  
Le framework prend en charge la gestion des dépendances.  
Le code devient plus structuré et maintenable.

---

## 4. Spring – Version Annotations (`PresSpringAnnotation`)

Approche moderne et recommandée.

Utilisation :
- `@Component` pour déclarer les composants
- `@Autowired` pour l’injection automatique
- `@Qualifier` pour choisir l’implémentation

Verdict :  
Configuration plus simple, code plus lisible et maintenance facilitée.

---

# Logique de Calcul

Le projet réalise le calcul suivant :

res = t × 12 × (π / 2) × cos(t)



---

# Stack Technique

- Java 21
- Spring Context 6.2.16
- Maven pour la gestion des dépendances

---

# Conclusion

Ce TP montre l’évolution progressive :

Couplage fort → Réflexion → Spring XML → Spring Annotations  

L’objectif final est de comprendre comment construire une application flexible, maintenable et évolutive en appliquant les principes IoC et DI.
