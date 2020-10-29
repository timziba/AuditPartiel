# PROJET DE GESTION ECOLE CAS : ENSUP 

## PREREQUIS: 

Installer [tomcat](https://tomcat.apache.org/tomcat-8.5-doc/setup.html)

Installer [mysql](https://dev.mysql.com/doc/refman/8.0/en/installing.html)

## POCEDURES:

### ETAPE 1 : 
  Clonez le projet a partir du repository ```git clone https://github.com/timziba/AuditPartiel.git```

### ETAPE 2 : 
  Créer la base de donnée : ```create database demojpa;```

  Executer le fichier .sql situé dans la répertoire BDD du repository.

  Ouvrir le fichier de configuration AuditPartiel/gesensup-dao/src/main/resources/META-INF/persistencce.xml

  Changer les parametres de connection de la base de données selon votre configuration.

  Paramètres par défaut
    
  > url : localhost:3306/demojpa
  >
  > login : root
  >
  > password :

### ETAPE 3 :
  Ouvrir une ligne de commande depuis la racine du repository local
  
  Exécuter la commande ```mvn clean package```
  
  Récupérer et déployer dans tomcat le fichier "AuditPartiel/gesensup-web/target/gesEnsup-web.war"
  
### ETAPE 4 : 
  Accéder à "localhost:8080/gesensup-web/"
  
  Connecter vous à l'application avec 
  
  > login : admin 
  > 
  > password : admin

### ETAPE 5

  Les log sont par défaut dans le fichier logs/app.log de la racine de la machine, soit
  > linux : "/home/logs/app.log"
  > windows : "C:\logs\app.log"
  
  Pour configurer un chemin spécifique, accéder au fichier log4j2.xml "AuditPartiel/gesEnsup-dao/src/main/resources/log4j2.xml"
  Modifier l'attribut FileName de la balise File
  
  ``` 
  <File name="LogFile" FileName="chemin_du_fichier_log">
      <PatternLayout>
        <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
      </PatternLayout>
    </File>
   ```

