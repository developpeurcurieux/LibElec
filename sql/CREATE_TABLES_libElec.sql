
USE libelec
/*==============================================================*/
/* Table : Adresse                                             */
/*==============================================================*/
CREATE TABLE Adresse (
   adrId                BIGINT IDENTITY,
   desId                BIGINT                  NULL,
   cliId                BIGINT                  NULL,
   cli_cliId            BIGINT                  NULL,
   adrNumVoie           INT			NULL,
   adrNomVoie           VARCHAR(50)         NOT NULL,
   adrNomVoieSuite      VARCHAR(50)             NULL,
   adrCp                VARCHAR(50)         NOT NULL,
   adrVille             VARCHAR(50)         NOT NULL,
   adrPays              VARCHAR(50)         NOT NULL,
   adrStatut            BIGINT              NOT NULL,
)


/*==============================================================*/
/* Table :Appartenance                                     */
/*==============================================================*/
CREATE TABLE Appartenance (
   souNom               VARCHAR(50)          NOT NULL,
   ouvNom               VARCHAR(75)          NOT NULL,
  )


/*==============================================================*/
/* Table : Auteur                                               */
/*==============================================================*/
CREATE TABLE Auteur (
   autId                BIGINT IDENTITY,
   autNom               VARCHAR(50)          NOT NULL,
   autPrenom            VARCHAR(50)          NOT NULL,
   autDateNaissance     DATE			 NULL,
   autGenre             SMALLINT                 NULL,
   autBio               VARCHAR(500)		 NULL,
   
)


/*==============================================================*/
/* Table : Avis                                                 */
/*==============================================================*/
CREATE TABLE Avis (
   aviId                BIGINT IDENTITY,
   cliId                BIGINT               NOT NULL,
   staType              BIGINT                  NOT NULL,
   aviNote              INT                  NOT NULL,
   aviCommentaire       VARCHAR(500)		 NULL,
   aviIp                VARCHAR(50)          NOT NULL,
   aviChampLibre	VARCHAR(500)		 NULL,
   
)


/*==============================================================*/
/* Table : Client                                               */
/*==============================================================*/
CREATE TABLE Client (
   cliId                BIGINT IDENTITY,
   cliGenre             SMALLINT             NOT NULL,
   cliPrenom            VARCHAR(50)          NOT NULL,
   cliNom               VARCHAR(50)          NOT NULL,
   cliEmail             VARCHAR(50)          NOT NULL,
   cliMdp               VARCHAR(50)          NOT NULL,
   cliDateAdhesion      DATE                 NOT NULL,
   cliTelF              VARCHAR(50)		 NULL,
   cliTelM              VARCHAR(50)              NULL,
   cliStatut            BIGINT                  NOT NULL,
   cliChampLibre        VARCHAR(500)		 NULL,
 )


/*==============================================================*/
/* Table : Commande                                             */
/*==============================================================*/
CREATE TABLE Commande (
   comId                BIGINT IDENTITY,
   adrId                BIGINT               NOT NULL,
   traId                BIGINT               NOT NULL,
   cliId                BIGINT               NOT NULL,
   fraId                BIGINT               NOT NULL,
   staType              BIGINT                  NOT NULL, 
   adr_adrId            BIGINT               NOT NULL,
   comDate              DATETIME             NOT NULL,
   comRemise            DECIMAL	         	 NULL,
   comModePaiement      INT                  NOT NULL,
   comIp                VARCHAR(50)          NOT NULL,
   comChampLibre        VARCHAR(500)		 NULL,
   comDateExpedition    DATE			 NULL,
   comNumeroDeSuivi     VARCHAR(50)		 NULL,
)


/*==============================================================*/
/* Table : Destinataire                                     */
/*==============================================================*/
CREATE TABLE Destinataire (
   desId		BIGINT IDENTITY		NOT NULL,
   cliId	        BIGINT			NOT NULL,
   desNom		VARCHAR(50)	        NOT NULL,
   desPrenom		VARCHAR(50)		NOT NULL,
   desEmail		VARCHAR(50)		    NULL,
   desTel		VARCHAR(20)		    NULL,
   desStatut		BIGINT			NOT NULL,
)


/*==============================================================*/
/* Table : Ecrire                                     */
/*==============================================================*/
CREATE TABLE Ecrire ( 
ouvNom			VARCHAR(75)		NOT NULL,
autId			BIGINT			NOT NULL,
)


/*==============================================================*/
/* Table : Editeur	                                     */
/*==============================================================*/
CREATE TABLE Editeur (
	ediId		BIGINT IDENTITY		NOT NULL,
	ediNom		VARCHAR(50)		NOT NULL,
	ediTeleF	VARCHAR(50)	            NULL,
	editEmail	VARCHAR(50)	            NULL,
	ediStatut	BIGINT			NOT NULL,
	ediChampLibre	VARCHAR(500)		    NULL,
)


/*==============================================================*/
/* Table : Employe	                                     */
/*==============================================================*/
CREATE TABLE Employe (
	empId		BIGINT IDENTITY		NOT NULL,
	empMdp		VARCHAR(8)		NOT NULL,
	empNom		VARCHAR(50)		NOT NULL, 
	empPrenom	VARCHAR(50)		NOT NULL,
	empDateEntree	DATE			NOT NULL,
	empDateSortie	DATE			NULL,
	empEmail	VARCHAR(50)		NOT NULL,
	empGrade	INT			NOT NULL,
	empStatut	BIGINT			NOT NULL,
	empChampLibre	VARCHAR(500)	        NULL,
)


/*==============================================================*/
/* Table : FraisDePort                                     */
/*==============================================================*/
CREATE TABLE FraisDePort (
	fraId		BIGINT IDENTITY		NOT NULL,
	fraPrix		DECIMAL			NOT NULL,
)

/*==============================================================*/
/* Table : Infolibrairie                                        */
/*==============================================================*/
CREATE TABLE InfoLibrairie (
   infId                BIGINT IDENTITY,
   infNom               VARCHAR(50)          NOT NULL,
   infSiret             BIGINT               NOT NULL,
   infNumVoie           INT                      NULL,
   infNomVoie           VARCHAR(50)          NOT NULL,
   infNomVoieSuite      VARCHAR(50)              NULL,
   infCp                VARCHAR(50)          NOT NULL,
   infVille             VARCHAR(50)          NOT NULL,
   infPays              VARCHAR(50)          NOT NULL,
)


/*==============================================================*/
/* Table : LigneCommande                                        */
/*==============================================================*/
CREATE TABLE LigneCommande (
   ligId                BIGINT IDENTITY,
   comId                BIGINT              NOT NULL,
   isbn                 VARCHAR(13)         NOT NULL,
   aviId                BIGINT                  NULL,
   ligQuantiteCommandee INT                 NOT NULL,
   ligPrix              DECIMAL             NOT NULL,
   ligTva               DECIMAL             NOT NULL,
   ligReduction         DECIMAL                 NULL,
)


/*==============================================================*/
/* Table : Livre                                                */
/*==============================================================*/
CREATE TABLE Livre (
   isbn                 VARCHAR(13)          NOT NULL,
   ediId                BIGINT               NOT NULL,
   tvaId                BIGINT               NOT NULL,
   proId                BIGINT			 NULL,
   ouvNom               VARCHAR(75)          NOT NULL,
   livEdition           INT                  NOT NULL,
   livDateEdition       DATE		     NOT NULL,
   livResume            VARCHAR(500)         NOT NULL,
   livPrix              DECIMAL              NOT NULL,
   livStock             INT                  NOT NULL,
   livImage             VARCHAR(100)         NOT NULL,
   livSousTitre         VARCHAR(75)		 NULL,
   livStatut            BIGINT               NOT NULL,
   livChampLibre        VARCHAR(500)		 NULL,
)


/*==============================================================*/
/* Table : Motcle                                               */
/*==============================================================*/
CREATE TABLE MotCle (
   mocLibelle           VARCHAR(50)          NOT NULL,
)

/*==============================================================*/
/* Table : Ouvrage                                              */
/*==============================================================*/
CREATE TABLE Ouvrage (
   ouvNom              VARCHAR(75)          NOT NULL,
)

/*==============================================================*/
/* Table : Promotion                                           */
/*==============================================================*/
CREATE TABLE Promotion (
   proId               BIGINT IDENTITY,  
   proNom              VARCHAR(50)		NULL,
   proDateDebut        DATETIME	            NOT NULL,
   proDateFin          DATETIME             NOT NULL,
   proDescription      VARCHAR(50)	    NOT NULL,
   proReduction        DECIMAL			NULL,
   proImage            VARCHAR(50)		NULL,
   proStatut           BIGINT               NOT NULL,
   proChampLibre       VARCHAR(500)		NULL,
)


/*==============================================================*/
/* Table : Recherche                                          */
/*==============================================================*/
CREATE TABLE Recherche (
   mocLibelle          VARCHAR(50)         NOT NULL,
   isbn                VARCHAR(13)         NOT NULL,
)


/*==============================================================*/
/* Table : SousTheme                                            */
/*==============================================================*/
CREATE TABLE SousTheme (
   souNom               VARCHAR(50)          NOT NULL,
   theNom               VARCHAR(100)         NOT NULL,
)

/*==============================================================*/
/* Table : Statut                                               */
/*==============================================================*/
CREATE TABLE Statut (
   staType              BIGINT               NOT NULL,
   staLibelle           VARCHAR(50)          NOT NULL,
)


/*==============================================================*/
/* Table : Theme                                                */
/*==============================================================*/
CREATE TABLE Theme (
   theNom               VARCHAR(100)         NOT NULL,
)


/*==============================================================*/
/* Table : Transporteur                                               */
/*==============================================================*/
CREATE TABLE Transporteur (
   traId		BIGINT      IDENTITY,
   traNomLivreu		VARCHAR(50)	    NOT NULL, 
   traTelF		VARCHAR(50)	    NOT NULL, 
   traEmai		VARCHAR(50)	    NOT NULL, 
   traStatut		BIGINT		    NOT NULL,						
   traChampLibre	VARCHAR(500)	        NULL, 
)

/*==============================================================*/
/* Table : Tva                                                  */
/*==============================================================*/
CREATE TABLE Tva (
   tvaId                BIGINT IDENTITY,
   tvaTaux              DECIMAL             NOT NULL,
)


