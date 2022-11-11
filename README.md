# Projet Spring Boot 
# « Kaddem » , c’est quoi?:
>C’est un projet qui vise à encourager les jeunes étudiants à améliorer leurs compétences professionnelles notamment dans le cadre des nouvelles tendances du monde de l’informatique.
# Objectif:
>Dans le but de préparer les étudiants aux nouvelles exigences du marché d’emploi, nous proposons de travailler sur le projet « KADDEM ».
# Qu’est-ce-qu’on veut faire?
>-On désire créer une application de gestion des contrats d’étudiants dans le cadre du projet « Kaddem ».
-Ce projet définit dans chaque département des universités adhérentes un programme de répartition des étudiants par équipes.
-Chaque équipe aura l’un des niveaux (junior/senior ou expert) dans l’une des spécialités suivantes: IA, réseaux, sécurité, cloud.
-Ce projet propose donc aux étudiants des contrats selon la spécialité et le niveau.
-Chaque étudiant obtient un contrat s’il adhère à une équipe, Dans le cas ou il sera affecté à plusieurs équipe, il aura un contrat pour chaque activité avec une équipe.
-Le contrat constitue simplement un engagement moral entre l’étudiant et son université ➡️ il doit donc honorer son engagement en participant activement à l’évolution de son équipe.
# Etapes:

## 1-Créer les entités et les associations 
![diagrame](https://user-images.githubusercontent.com/61566287/200142880-1b3017a2-d828-4e7c-8ed2-36f071a10393.PNG)

## 2-Créer les services
## Créer les CRUD des différentes entités
![se](https://user-images.githubusercontent.com/61566287/200142960-bd06a05a-6754-4162-a71e-d611bdb8470b.PNG)
### Exemple
>Entité Etudiant

List<Etudiant> retrieveAllEtudiants();

Etudiant addEtudiant (Etudiant e);

Etudiant updateEtudiant (Etudiant e);

Etudiant retrieveEtudiant(Integer idEtudiant);

void removeEtudiant(Integer idEtudiant);

## 3-Spring MVC REST
>Exposer les services implémentés avec Postman et/ou Swagger pour les tester.
  ### Exemple
 >Afficher liste les Etudiants :
![1](https://user-images.githubusercontent.com/61566287/200143161-32bf16be-2315-4082-89db-9af7b9eb0c18.PNG)
  >Ajouter Etudiant :
  ![2](https://user-images.githubusercontent.com/61566287/200143186-c9bf3c73-e0d9-44db-9674-779aa1a4ff20.PNG)
  >Modifier Etudiant :
![3](https://user-images.githubusercontent.com/61566287/200143190-2fa56578-667d-412b-a4a4-bde4f0c2f5be.PNG)
  >Afficher Etudiant By id : 
![4](https://user-images.githubusercontent.com/61566287/200143193-2e60a4e6-9392-48a8-b93c-35f842a8bf25.PNG)
  >Supprimer Etudiant :
![5](https://user-images.githubusercontent.com/61566287/200143201-b2b9d857-f30d-4658-9099-bfdc5047baf2.PNG)


  