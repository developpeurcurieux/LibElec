/*==============================================================*/
/* Nom du projet :  Librairie Ninja                     */
/* Date de création :  13/04/2017 11:33:57                      */
/*==============================================================*/


/*==============================================================*/
/* Table : Adresse                                             */
/*==============================================================*/
create table Adresse (
   adrId                BIGINT IDENTITY,
   desId                BIGINT                  NULL,
   cliId                BIGINT                  NULL,
   cli_cliId            BIGINT                  NULL,
   adrNumVoie           INT						NULL,
   adrNomVoie           VARCHAR(50)         NOT NULL,
   adrNomVoieSuite      VARCHAR(50)             NULL,
   adrCp                VARCHAR(50)         NOT NULL,
   adrVille             VARCHAR(50)         NOT NULL,
   adrPays              VARCHAR(50)         NOT NULL,
   adrStatut            BIGINT                 NOT NULL,
   constraint pkAdresse primary key nonclustered (adrId)
)
go

/*==============================================================*/
/* Table :Appartenance                                     */
/*==============================================================*/
create table Appartenance (
   souNom               VARCHAR(50)          NOT NULL,
   ouvNom               VARCHAR(75)          NOT NULL,
   constraint pkAppartenance primary key nonclustered (souNom, ouvNom)
)
go

/*==============================================================*/
/* Table : Auteur                                               */
/*==============================================================*/
create table Auteur (
   autId                BIGINT IDENTITY,
   autNom               VARCHAR(50)          NOT NULL,
   autPrenom            VARCHAR(50)          NOT NULL,
   autDateNaissance     DATE					 NULL,
   autGenre             SMALLINT                 NULL,
   autBio               VARCHAR(500)			 NULL,
   constraint pkAuteur primary key nonclustered (autId)
)
go

/*==============================================================*/
/* Table : Avis                                                 */
/*==============================================================*/
create table Avis (
   aviId                BIGINT IDENTITY,
   cliId                BIGINT               NOT NULL,
   staType              BIGINT                  NOT NULL,
   aviNote              INT                  NOT NULL,
   aviCommentaire       VARCHAR(500)			 NULL,
   aviIp                VARCHAR(50)          NOT NULL,
   aviChampLibre		VARCHAR(500)			 NULL,
   constraint pkAvis primary key nonclustered (aviId)
)
go

/*==============================================================*/
/* Table : Client                                               */
/*==============================================================*/
create table Client (
   cliId                BIGINT IDENTITY,
   cliGenre             SMALLINT             NOT NULL,
   cliPrenom            VARCHAR(50)          NOT NULL,
   cliNom               VARCHAR(50)          NOT NULL,
   cliEmail             VARCHAR(50)          NOT NULL,
   cliMdp               VARCHAR(50)          NOT NULL,
   cliDateAdhesion      DATE                 NOT NULL,
   cliTelF              VARCHAR(50)				 NULL,
   cliTelM              VARCHAR(50)              NULL,
   cliStatut            BIGINT                  NOT NULL,
   cliChampLibre        VARCHAR(500)			 NULL,
   constraint pkClient primary key nonclustered (cliId)
)
go

/*==============================================================*/
/* Table : Commande                                             */
/*==============================================================*/
create table Commande (
   comId                BIGINT IDENTITY,
   adrId                BIGINT               NOT NULL,
   traId                BIGINT               NOT NULL,
   cliId                BIGINT               NOT NULL,
   fraId                BIGINT               NOT NULL,
   staType              BIGINT                  NOT NULL, 
   adr_adrId            BIGINT               NOT NULL,
   comDate              DATETIME             NOT NULL,
   comRemise            DECIMAL					 NULL,
   comModePaiement      INT                  NOT NULL,
   comIp                VARCHAR(50)          NOT NULL,
   comChampLibre        VARCHAR(500)			 NULL,
   comDateExpedition    DATE					 NULL,
   comNumeroDeSuivi     VARCHAR(50)				 NULL,
   constraint pkCommande primary key nonclustered (comId)
)
go

/*==============================================================*/
/* Table : Destinataire                                     */
/*==============================================================*/
CREATE TABLE Destinataire (
   desId				BIGINT IDENTITY		NOT NULL,
   cliId				BIGINT				NOT NULL,
   desNom				VARCHAR(50)			NOT NULL,
   desPrenom			VARCHAR(50)			NOT NULL,
   desEmail				VARCHAR(50)				NULL,
   desTel				VARCHAR(20)				NULL,
   desStatut			BIGINT					NOT NULL,
   constraint pkDestinataire primary key nonclustered (desId)
)
go

/*==============================================================*/
/* Table : Ecrire                                     */
/*==============================================================*/
CREATE TABLE Ecrire ( 
	ouvNom				VARCHAR(75)			NOT NULL,
	autId				BIGINT				NOT NULL,
constraint pkEcrire primary key nonclustered (ouvNom, autId)
)
go

/*==============================================================*/
/* Table : Editeur	                                     */
/*==============================================================*/
CREATE TABLE Editeur (
	ediId				BIGINT IDENTITY		NOT NULL,
	ediNom				VARCHAR(50)			NOT NULL,
	ediTeleF			VARCHAR(50)				NULL,
	editEmail			VARCHAR(50)				NULL,
	ediStatut			BIGINT					NOT NULL,
	ediChampLibre		VARCHAR(500)			NULL,
constraint pkEditeur primary key nonclustered (ediId)
)
go

/*==============================================================*/
/* Table : Employe	                                     */
/*==============================================================*/
CREATE TABLE Employe (
	empId				BIGINT IDENTITY		NOT NULL,
	empMdp				VARCHAR(8)			NOT NULL,
	empNom				VARCHAR(50)			NOT NULL, 
	empPrenom			VARCHAR(50)			NOT NULL,
	empDateEntree		DATE				NOT NULL,
	empDateSortie		DATE					NULL,
	empEmail			VARCHAR(50)			NOT NULL,
	empGrade			INT					NOT NULL,
	empStatut			BIGINT					NOT NULL,
	empChampLibre		VARCHAR(500)			NULL,
constraint pkEmploye primary key nonclustered (empId)
)
go

/*==============================================================*/
/* Table : FraisDePort                                     */
/*==============================================================*/
CREATE TABLE FraisDePort (
	fraId				BIGINT IDENTITY		NOT NULL,
	fraPrix				DECIMAL				NOT NULL,
constraint pkFraisDePort primary key nonclustered (fraId)
)
go

/*==============================================================*/
/* Table : Infolibrairie                                        */
/*==============================================================*/
create table InfoLibrairie (
   infId                BIGINT IDENTITY,
   infNom               VARCHAR(50)          NOT NULL,
   infSiret             BIGINT               NOT NULL,
   infNumVoie           INT                      NULL,
   infNomVoie           VARCHAR(50)          NOT NULL,
   infNomVoieSuite      VARCHAR(50)              NULL,
   infCp                VARCHAR(50)          NOT NULL,
   infVille             VARCHAR(50)          NOT NULL,
   infPays              VARCHAR(50)          NOT NULL,
   constraint pkInfoLibrairie primary key nonclustered (infId)
)
go

/*==============================================================*/
/* Table : LigneCommande                                        */
/*==============================================================*/
create table LigneCommande (
   ligId                BIGINT IDENTITY,
   comId                BIGINT              NOT NULL,
   isbn                 VARCHAR(13)			NOT NULL,
   aviId                BIGINT                  NULL,
   ligQuantiteCommandee INT                 NOT NULL,
   ligPrix              DECIMAL             NOT NULL,
   ligTva               DECIMAL             NOT NULL,
   ligReduction         DECIMAL                 NULL,
   constraint pkLigneCommande primary key nonclustered (ligId)
)
go

/*==============================================================*/
/* Table : Livre                                                */
/*==============================================================*/
create table Livre (
   isbn                 VARCHAR(13)          NOT NULL,
   ediId                BIGINT               NOT NULL,
   tvaId                BIGINT               NOT NULL,
   proId                BIGINT					 NULL,
   ouvNom               VARCHAR(75)          NOT NULL,
   livEdition           INT                  NOT NULL,
   livDateEdition       DATE				 NOT NULL,
   livResume            VARCHAR(500)         NOT NULL,
   livPrix              DECIMAL              NOT NULL,
   livStock             INT                  NOT NULL,
   livImage             VARCHAR(100)         NOT NULL,
   livSousTitre         VARCHAR(75)				 NULL,
   livStatut            BIGINT                  NOT NULL,
   livChampLibre        VARCHAR(500)			 NULL,
   constraint pkLivre primary key nonclustered (isbn)
)
go

/*==============================================================*/
/* Table : Motcle                                               */
/*==============================================================*/
create table MotCle (
   mocLibelle           VARCHAR(50)          NOT NULL,
   constraint pkMotCle primary key nonclustered (mocLibelle)
)
go

/*==============================================================*/
/* Table : Ouvrage                                              */
/*==============================================================*/
create table Ouvrage (
   ouvNom              VARCHAR(75)          NOT NULL,
   constraint pkOuvrage primary key nonclustered (ouvNom)
)
go

/*==============================================================*/
/* Table : Promotion                                           */
/*==============================================================*/
create table Promotion (
   proId               BIGINT IDENTITY,
   proNom              VARCHAR(50)				NULL,
   proDateDebut        DATETIME				NOT NULL,
   proDateFin          DATETIME             NOT NULL,
   proDescription      VARCHAR(50)			NOT NULL,
   proReduction        DECIMAL				NULL,
   proImage            VARCHAR(50)				NULL,
   proStatut           BIGINT                  NOT NULL,
   proChampLibre       VARCHAR(500)				NULL,
   constraint pkPromotion primary key nonclustered (proId)
)
go

/*==============================================================*/
/* Table : Recherche                                          */
/*==============================================================*/
create table Recherche (
   mocLibelle          VARCHAR(50)         NOT NULL,
   isbn                VARCHAR(13)         NOT NULL,
   constraint pkRecherche primary key nonclustered (mocLibelle, isbn)
)
go

/*==============================================================*/
/* Table : SousTheme                                            */
/*==============================================================*/
create table SousTheme (
   souNom               VARCHAR(50)          NOT NULL,
   theNom               VARCHAR(100)         NOT NULL,
   constraint pkSousTheme primary key nonclustered (souNom)
)
go

/*==============================================================*/
/* Table : Statut                                               */
/*==============================================================*/
create table Statut (
   staType              BIGINT	                IDENTITY,
   staLibelle           VARCHAR(50)          NOT NULL,
   constraint pkStatut primary key nonclustered (staType)
)
go

/*==============================================================*/
/* Table : Theme                                                */
/*==============================================================*/
create table Theme (
   theNom               VARCHAR(100)         NOT NULL,
   constraint pkTheme primary key nonclustered (theNom)
)
go

/*==============================================================*/
/* Table : Transporteur                                               */
/*==============================================================*/
create table Transporteur (
   traId				BIGINT IDENTITY,
   traNomLivreur		VARCHAR(50)			 NOT NULL, 
   traTelF				VARCHAR(50)			 NOT NULL, 
   traEmail				VARCHAR(50)			 NOT NULL, 
   traStatut			BIGINT					 NOT NULL,						
   traChampLibre		VARCHAR(500)			 NULL, 
   constraint pkTransporteur primary key nonclustered (traId)
)
go

/*==============================================================*/
/* Table : Tva                                                  */
/*==============================================================*/
create table Tva (
   tvaId                BIGINT IDENTITY,
   tvaTaux              DECIMAL             NOT NULL,
   constraint pkTva primary key nonclustered (tvaId)
)
go

