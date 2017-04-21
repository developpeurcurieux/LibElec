use ninja;

/*sur la table employé
la date de sortie doit être superieure à la date d'entrée de l'employé */
ALTER TABLE Employe
ADD CONSTRAINT chkDateEntreeSortie
CHECK (empDateSortie > empDateEntree)

/*sur la table promotion
la date de début doit être superieure à la date de fin d'une promotion */
ALTER TABLE Promotion
ADD CONSTRAINT chkDateDebutFin
CHECK (proDateFIn > proDateDebut)

/*sur la table promotion
l'attribut "statut" de la table promotion
ne peut prendre que les valeurs "0", "1"
0 = finie, 1 = encours*/

/*ALTER TABLE Promotion
ADD CONSTRAINT chkPromotionStatut
CHECK (proStatut IN ('0','1'))*/

/*sur la table promotion
la reduction est positive ou nulle */

ALTER TABLE Promotion
ADD CONSTRAINT chkPromotionReduction
CHECK (proReduction >= 0)


/*sur la table avis
l'avis est unique
ALTER TABLE Avis
ADD CONSTRAINT unAviNoteUnique
UNIQUE (aviNote)*/

/*sur la table tva
la valeur de la tva est positive */
ALTER TABLE Tva
ADD CONSTRAINT chkTva
CHECK (tvaTaux >= 0)

/*sur la table lignedecommande
une commande est nulle ou positive */
ALTER TABLE LigneCommande
ADD CONSTRAINT chkQuantitéCommandée
CHECK (ligQuantiteCommandee >= 0)

/*sur la table client
l'attribut "genre" de la table client
ne peut prendre que les valeurs "1", "2"
1 = Homme, 2 = Femme*/

ALTER TABLE Client
ADD CONSTRAINT chkClientGenre
CHECK (cliGenre IN ('1','2'))

/*sur la table auteur
l'attribut "genre" de la table auteur
ne peut prendre que les valeurs "1", "2"
1 = Homme, 2 = Femme*/

ALTER TABLE Auteur
ADD CONSTRAINT chkAuteurGenre
CHECK (autGenre IN ('1','2'))

/*sur la table editeur
l'attribut "statut" de la table editeur
ne peut prendre que les valeurs "0", "1"
0 = inactif, 1 = actif*/

ALTER TABLE Editeur
ADD CONSTRAINT chkEditeurStatut
CHECK (ediStatut IN ('0','1'))

/*sur la table editeur
l'attribut "statut" de la table editeur
ne peut prendre que les valeurs "0", "1"
0 = inactif, 1 = en attente, 2 = actif*/

ALTER TABLE Client
ADD CONSTRAINT chkClientStatut
CHECK (cliStatut IN ('0','1','2'))

/*sur la table destinataire
l'attribut "statut" de la table destinataire
ne peut prendre que les valeurs "0", "1"
0 = inactif, 1 = actif*/

ALTER TABLE Destinataire
ADD CONSTRAINT chkDestinataireStatut
CHECK (desStatut IN ('0','1'))

/*sur la table transporteur
l'attribut "statut" de la table transporteur
ne peut prendre que les valeurs "0", "1"
0 = inactif, 1 = actif*/

ALTER TABLE Transporteur
ADD CONSTRAINT chkTransporteurStatut
CHECK (traStatut IN ('0','1'))

/*sur la table adresse
l'attribut "statut" de la table adresse
ne peut prendre que les valeurs "0", "1"
0 = inactif, 1 = actif*/

ALTER TABLE Adresse
ADD CONSTRAINT chkAdresseStatut
CHECK (adrStatut IN ('0','1'))

/*sur la table livre
l'ISBN est unique 

ALTER TABLE Livre
ADD CONSTRAINT unLivreIsbn
UNIQUE (isbn)*/

--le stock est positif ou nul
ALTER TABLE Livre
ADD CONSTRAINT chkLivreStock
CHECK (livStock >= 0)

/*sur la table livre
l'attribut "statut" de la table livre
ne peut prendre que les valeurs "0", "1"
0 = non-disponible, 1 = encours de commande 2 = disponible*/

ALTER TABLE Livre
ADD CONSTRAINT chkLivreStatut
CHECK (livStatut IN ('0','1','2'))

/*sur la table livre
l'attribut "livEdition" de la table livre
ne peut prendre que les valeurs "1", "2","3"*/

/*ALTER TABLE Livre
ADD CONSTRAINT chkLivreEdition
CHECK (livEdition IN ('1','2','3'))*/




