use libelec;

--insertion dans la table Statut
insert into Statut
(staType, staLibelle)
values

(0,'accepte'),
(10, 'refuse'),
(20, 'en cours de traitement'),
(30, 'traite'),
(40, 'expedie')

--insertion dans la table FraisDePort
insert into FraisDePort
(fraPrix)
values
(0.2),
(0.055),
(0.021)

--insertion dans la table Tva
insert into Tva
(tvaTaux)
values
(0.01),
(3.99),
(7.99)

--insertion dans la table editeur
insert into Editeur
(ediNom,ediTeleF,editEmail,ediStatut,ediChampLibre)
values
--('Adrian Vang','06 39 44 71 92','elit.Aliquam@aaliquet.org',0,' '),
('Evan Franks','02 80 96 51 18','sed@necdiam.co.uk',1,'jeune editeur'),
('Lamar Ochoa','01 79 19 08 75','est.mollis.non@idantedictum.net',1,'livre de poche'),
('Garrett Rasmussen','09 92 87 36 85','Quisque.fringilla.euismod@mi.com',0,'A d�menag�'),
('Chaim Hewitt','05 42 04 85 34','Nunc@et.net',1,' '),
('Robert Peterson','08 87 12 08 79','vel.lectus.Cum@lectusCumsociis.com',1,' ')


--insertion dans la table auteur
insert into Auteur
(autNom,autPrenom,autDateNaissance,autGenre,autBio)
values
('Ronan','Michel','25-07-1814',1,'Michel Roman, n� � Marseille le 25 juillet 1814 et mort � Paris le 25 mars 1875, est un romancier et auteur dramatique fran�ais.'),
('Brock','Denise Stuart','14-04-1930',2,''),
('Ross','Aubrey','26-03-1950',2,''),
('Abra','Bernard','27-06-1838',1,'Bernard Abra, n� le 27 juin 1838 � Marylebone et mort le 12 octobre 1926 (� 87 ans), professeur et th�ologien anglais'),
('Murphy','Lara','24-05-1920',2,' '),
('Knapp','Nicholas','24-07-1815',1,'Knapp Nicholas, n� le 24 juillet 1815 � Dublin  et mort le 8 novembre 1893 � Ciboure, est un g�ographe fran�ais connu pour ses voyages en �thiopie')


--insertion dans la table transporteur
insert into Transporteur
(traNomLivreur,traTelF,traEmail,traStatut,traChampLibre)
values
('Chronopost','0717273837','chronopost@molestiesodales.edu',1,'Tr�s serieux'),
('TNT','0163442370','tnt@vel.ca',1,''),
('DHL','0253016076','dhl@magnaSedeu.org',0,'bas� en France'),
('Colissimo','0593570516','colissimo@luctus.com',0,'en rupture de contrat'),
('FEDEX','0306939190','fedex@ornarelectusjusto.net',1,' ')


--insertion dans la table promotion
insert into Promotion
(proNom,proDateDebut,proDateFin,proDescription,proReduction,proImage,proStatut,proChampLibre)
values
('Speciale salon du livre','2017-04-24T15:00:00','2017-04-29T17:00:00','Presentation des ecrivains feminins',0,'ciel',0,''),
('Les ecrivains voyageurs','2017-05-02T15:00:00','2017-05-02T17:00:00','Jeune d�couverte',0,'voiture',0,'Qui est Mathieu Grimaud, le narrateur de cette �trange histoire qui, quinze ans apr�s l�incendie de sa chambre, reste persuad� que sa m�re a voulu se d�barrasser de lui ?'),
('Coup de coeur','2017-06-06T09:00:00','2017-06-10T15:00:00','Gymnop�die pour une disparue',9.99,'livre',1,'Boris Sieger est un employ� de mairie attach� � sa vie ordinaire'),
('Coup de coeur','2017-06-06T09:00:00','2017-06-10T15:00:00','Le chagrin des vivants',9.99,'livre',1,'Durant les cinq premiers jours de novembre 1920, Angleterre attend arriv�e du Soldat inconnu, rapatri� depuis la France'),
('Le livre africain','2017-07-06T09:00:00','2017-08-06T15:00:00','visite guidee',0,'lion',0,'')


--insertion dans la table client
insert into Client
(cliGenre,cliPrenom,cliNom,cliEmail,cliMdp,cliDateAdhesion,cliTelF,cliTelM,cliStatut,cliChampLibre)
values
(2,'Justine Rose','Randall','velit.Cras.lorem@euturpis.edu','Jr2016Ran','26-10-2016','0163442370','0763442345',1,'client fidel'),
(1,'Jerome','Wyatt','Integer@ipsumsodales.co.uk','Jr2012Wy','02-02-2012','0293570516','0647658848',1,''),
(1,'Gonzales','Aaron','odio.Aliquam.vulputate@Crasvulputatevelit.org','Go2015Aa','15-04-2013','0523967365','0770947291',0,'Ne paie pas les factures'),
(2,'Lillith','Ian','porttitor@felisegetvarius.org','Ia1999Li','15-02-1999','0531875928','0770947291',0,'decede'),
(1,'Daniel','Franklin','mi.felis.adipiscing@turpisAliquam.com','Fr2017Da','25-03-2017','0306939190','0770947291',1,'')


--insertion dans la table destinataire
insert into Destinataire
(cliId,desNom,desPrenom,desEmail,desTel,desStatut)
values
(1,'Randall','Justine Rose','velit.Cras.lorem@euturpis.edu','0163442370',1),
(2,'Wyatt','Jerome','Integer@ipsumsodales.co.uk','0647658848',1),
(3,'Hector','Phyllis','elit.Etiam@interdum.co.uk','0442739679',0),
(4,'Edward','Doris','nec.diam@mauris.co.uk','0536186069',0),
(5,'Tiger','Maynard','velit.Sed@Mauris.co.uk','0420509215',0)

--insertion dans la table adresse
use librairie
insert into Adresse
(desId,cliId,cli_cliId,adrNumVoie,adrNomVoie,adrNomVoieSuite,adrCp,adrVille,adrPays,adrStatut)
values
(1,1,null,16,'rue Enim','',69668,'La Granja','France',1),
(NULL,null,1,50,'impasse de la butte','',75000,'Paris','France',1),
(3,3,null,20,'avenue Natoque','app1',35400,'Montpellier','France',0),
(4,4,null,18,'bd Montmartre','',95500,'Cergy','France',0),
(null,null,4,120,'rue de gare','',78230,'Les Mureaux','France',1)
SELECT * FROM Client
SELECT * FROM Destinataire

--insertion dans la table theme
insert into Theme
(theNom)
values
('Litterature'),
('Oeuvres anciennes'),
('Litterature etrangere')

--insertion dans la table ouvrage
insert into Ouvrage
(ouvNom)
values
('Orgueil et pr�jug�s'),
('Voyage au bout de la nuit'),
('La Divine Com�die'),
('Crime et Ch�timent'),
('Madame Bovary')

--insertion dans la table motcle
insert into MotCle
(mocLibelle)
values
('Litterature'),
('Oeuvres'),
('anciennes'),
('etrangere'),
('Ronan'),
('Michel'),
('Brock'),
('Denise Stuart'),
('Ross'),
('Aubrey'),
('Abra'),
('Bernard'),
('Murphy'),
('Lara'),
('Knapp'),
('Nicholas')








/*
select * from Transporteur
select * from Destinataire
select * from Client


drop table Adresse

ALTER TABLE Livre
DROP CONSTRAINT fkLivrePromotion

ALTER TABLE Adresse 
MODIFY cliId bigint not null */

--changer le nom d'une colonne 
-- EXEC sp_RENAME 'Transporteur.traEmai' , 'traEmail', 'COLUMN'
