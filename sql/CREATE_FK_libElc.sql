use libelec;
/*==============================================================*/
/* FK Adresse							*/
/*==============================================================*/

ALTER TABLE Adresse
ADD CONSTRAINT fkAdresseDestinataire
FOREIGN KEY (desId)
REFERENCES Destinataire(desId)	
ON UPDATE CASCADE;

ALTER TABLE Adresse
ADD CONSTRAINT fkAdresseClientLivraison
FOREIGN KEY (cliId)
REFERENCES Client(cliId);
/*--ON UPDATE CASCADE */

ALTER TABLE Adresse
ADD	CONSTRAINT fkAdresseClientFacture
FOREIGN KEY(cli_cliId)
REFERENCES Client(cliId);
/*
--ON UPDATE CASCADE
*/
/*==============================================================*/
/* FK Appartenance						*/
/*==============================================================*/

ALTER TABLE Appartenance
ADD	CONSTRAINT fkAppartenanceSousTheme
FOREIGN KEY(souNom)
REFERENCES SousTheme(souNom)
ON UPDATE CASCADE;

ALTER TABLE Appartenance
ADD	CONSTRAINT fkAppartenanceOuvrage
FOREIGN KEY(ouvNom)
REFERENCES Ouvrage(ouvNom)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK Avis						        */
/*==============================================================*/

ALTER TABLE Avis
ADD CONSTRAINT fkAvisClient
FOREIGN KEY(cliId)
REFERENCES Client(cliId)
ON UPDATE CASCADE;

ALTER TABLE Avis
ADD CONSTRAINT fkAvisStatut
FOREIGN KEY(staType)
REFERENCES Statut(staType)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK Commande							*/
/*==============================================================*/

ALTER TABLE Commande
ADD CONSTRAINT fkCommandeAdresseFacture
FOREIGN KEY(adrId)
REFERENCES Adresse(adrId);
/*--ON UPDATE CASCADE
*/
ALTER TABLE Commande
ADD CONSTRAINT fkCommandeTransporteur
FOREIGN KEY(traId)
REFERENCES Transporteur(traId)
ON UPDATE CASCADE;

ALTER TABLE Commande
ADD CONSTRAINT fkCommandeClient
FOREIGN KEY(cliId)
REFERENCES Client(cliId);
/*--ON UPDATE CASCADE
*/
ALTER TABLE Commande
ADD CONSTRAINT fkCommandeFraisDePort
FOREIGN KEY(fraId)
REFERENCES FraisDePort(fraId)
ON UPDATE CASCADE;

ALTER TABLE Commande
ADD CONSTRAINT fkCommandeStatut
FOREIGN KEY(staType)
REFERENCES Statut(staType);
/*--ON UPDATE CASCADE*/

ALTER TABLE Commande
ADD CONSTRAINT fkCommandeAdresseLivraison
FOREIGN KEY(adr_adrId)
REFERENCES Adresse(adrId);
/*--ON UPDATE CASCADE*/

/*==============================================================*/
/* FK Destinataire						*/
/*==============================================================*/

ALTER TABLE Destinataire 
ADD CONSTRAINT fkDestinataireClient 
FOREIGN KEY(cliId)
REFERENCES Client(cliId)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK Ecrire							*/
/*==============================================================*/

ALTER TABLE Ecrire 
ADD CONSTRAINT fkOuvrage 
FOREIGN KEY(ouvNom)
REFERENCES Ouvrage(ouvNom)
ON UPDATE CASCADE;

ALTER TABLE Ecrire
ADD CONSTRAINT fkEcrireAuteur
FOREIGN KEY (autId)
REFERENCES Auteur(autId)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK LigneCommande						*/
/*==============================================================*/

ALTER TABLE LigneCommande
ADD CONSTRAINT fkLigneCommandeCommande
FOREIGN KEY (comId)
REFERENCES Commande(comId)
ON UPDATE CASCADE;

ALTER TABLE LigneCommande
ADD CONSTRAINT fkLigneCommandeLivre
FOREIGN KEY (isbn)
REFERENCES Livre(isbn)
ON UPDATE CASCADE;

ALTER TABLE LigneCommande
ADD CONSTRAINT fkLigneCommandeAvis
FOREIGN KEY (aviId)
REFERENCES Avis(aviId)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK Livre							*/
/*==============================================================*/

ALTER TABLE Livre
ADD CONSTRAINT fkLivreEditeur
FOREIGN KEY (ediId)
REFERENCES Editeur(ediId)
ON UPDATE CASCADE;

ALTER TABLE Livre
ADD CONSTRAINT fkLivreTva
FOREIGN KEY (tvaId)
REFERENCES Tva(tvaId)
ON UPDATE CASCADE;

ALTER TABLE Livre
ADD CONSTRAINT fkLivrePromotion
FOREIGN KEY (proId)
REFERENCES Promotion(proId)
ON UPDATE CASCADE;

ALTER TABLE Livre
ADD CONSTRAINT fkLivreOuvrage
FOREIGN KEY (ouvNom)
REFERENCES Ouvrage(ouvNom)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK SousTheme							*/
/*==============================================================*/

ALTER TABLE SousTheme
ADD CONSTRAINT fkSousThemeTheme
FOREIGN KEY (theNom)
REFERENCES Theme (theNom)
ON UPDATE CASCADE;

/*==============================================================*/
/* FK Recherche							*/
/*==============================================================*/

ALTER TABLE Recherche
ADD CONSTRAINT fkRechercheMotCle
FOREIGN KEY (mocLibelle)
REFERENCES MotCle(mocLibelle)
ON UPDATE CASCADE;

ALTER TABLE Recherche
ADD CONSTRAINT fkRechercheLivre
FOREIGN KEY (isbn)
REFERENCES Livre(isbn)
ON UPDATE CASCADE;