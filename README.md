Inversion de Contrôle et Injection de Dépendances
Bienvenue dans ce projet de TP portant sur les concepts fondamentaux de l'architecture Java EE : L'Inversion de Contrôle (IoC) et l'Injection de Dépendances (DI).

L'objectif ici est de comprendre comment passer d'un code rigide (couplage fort) à une architecture flexible et évolutive (couplage faible) en utilisant différentes méthodes, de la réflexion Java native jusqu'au framework Spring.


Architecture du Projet
Le projet est découpé en quatre couches principales pour respecter la séparation des responsabilités :

Couche DAO (net.imane.dao) : Interface IDao et ses implémentations (DaoImpl, DaoImplV2). Elle simule la récupération de données.

Couche Métier (net.imane.metier) : Interface IMetier et MetierImpl. C'est ici que se trouve la logique de calcul.

Couche Extension (net.imane.ext) : Contient DaoImplV2 pour tester l'évolutivité du système sans modifier le métier.

Couche Présentation (net.imane.pres) : Contient les différentes classes de test (Pres1, Pres2, PresSpring...).


 Les 4 Étapes de l'Évolution1. 
 Le Couplage Fort (Pres1)
 L'instanciation se fait avec le mot-clé new.
 Verdict : Simple, mais trop rigide. Si on change de DAO, on casse tout.
 2. La Magie de la Réflexion (Pres2)
 On utilise un fichier config.txt pour charger les classes dynamiquement au runtime
 .Lecture du fichier
 .Chargement des classes avec Class.forName()
 .Injection via constructeur dynamique
 
 .Verdict : On peut changer de version sans recompiler ! C'est le principe Open/Closed.
 
 3. Spring version XML (PresSpringXML)On délègue la gestion des objets (Beans) à Spring via config.xml.Déclaration des beans et des dépendances en dehors du code.Verdict : Le framework commence à faire le travail lourd pour nous
4. Spring version Annotations (PresSpringAnnotation)
   La méthode moderne et élégante :
   @Component pour marquer les classes.
   @Autowired et @Qualifier pour lier les composants intelligemment.

   Verdict : Propre, lisible et ultra-efficace.

 La Logique de CalculLe projet effectue un calcul mathématique basé sur les données récupérées :
   $$res = t \times 12 \times \frac{\pi}{2} \times \cos(t)$$🛠️ 
   
   Stack Technique
   Java 21
   Spring Context 6.2.16
   Maven pour la gestion des dépendances
