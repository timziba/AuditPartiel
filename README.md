# AuditPartiel
# ** PROJET DE GESTION ECOLE CAS : ENSUP **

PREREQUIS: 

1 / Télécharger eclipse

2 / Télécharger  Wamp pour utiliser le serveur de base de données : PhpMyAdmin

INSTALLATION :

1 / Installer l'editeur eclipe

2 / Installer Wamp


POCEDURES:
ETAPE 1 : Lancer le moteur de base de données et excétuer la commande ci-dessous pour creer la base de données

  > create database nombasededonnée;
  
ETAPE 2 : Télécharger le projet a partir du repository

ETAPE 3 : Lancer l'editeur Eclipse et Importer le projet 

ETAPE 4 : Ouvrir le fichier de configuration  persistencce.xml dans le package ressources/META-INF
          
          Changer les parametres de connection de la base de données selon votre configuration :
           url : localhost:numeroport/nombasededonnée 
           login : root
           password : mettre mot de passe s'il y a en sinon laissé vide  
           
ETAPE 5 : Ouvrir une ligne de commande , aller a la racine du projet et taper la commande :
          mvn clean package
          Ouvrir la dossier target a la racine du projet et lancer le fichier .jar
Lancer le programme et c'est tout 

