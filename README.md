Inversion de Contrôle et Injection de Dépendances
Bienvenue dans ce projet de TP portant sur les concepts fondamentaux de l'architecture Java EE : L'Inversion de Contrôle (IoC) et l'Injection de Dépendances (DI).

L'objectif ici est de comprendre comment passer d'un code rigide (couplage fort) à une architecture flexible et évolutive (couplage faible) en utilisant différentes méthodes, de la réflexion Java native jusqu'au framework Spring.


Architecture du Projet
Le projet est découpé en quatre couches principales pour respecter la séparation des responsabilités :

Couche DAO (net.imane.dao) : Interface IDao et ses implémentations (DaoImpl, DaoImplV2). Elle simule la récupération de données.

Couche Métier (net.imane.metier) : Interface IMetier et MetierImpl. C'est ici que se trouve la logique de calcul.

Couche Extension (net.imane.ext) : Contient DaoImplV2 pour tester l'évolutivité du système sans modifier le métier.

Couche Présentation (net.imane.pres) : Contient les différentes classes de test (Pres1, Pres2, PresSpring...).
