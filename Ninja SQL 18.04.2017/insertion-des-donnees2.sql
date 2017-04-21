

--insertion dans la table Statut
insert into Statut
(staLibelle)
values

('accepte'),
('refuse'),
('encours de traitement'),
('traite'),
('expedie')

--insertion dans la table FraisDePort
insert into FraisDePort
(fraPrix)
values
(0.73),
(1.46),
(2.92),
(4.38),
(5.84),
(11.00)

--insertion dans la table Tva
insert into Tva
(tvaTaux)
values
(0.021),
(0.055),
(0.2)

--insertion dans la table editeur
insert into Editeur
(ediNom,ediTeleF,editEmail,ediStatut,ediChampLibre)
values
('Adrian Vang','06 39 44 71 92','elit.Aliquam@aaliquet.org',0,' '),
('Evan Franks','0280965118','sed@necdiam.co.uk',1,'jeune editeur'),
('Lamar Ochoa','0179190875','est.mollis.non@idantedictum.net',1,'livre de poche'),
('Garrett Rasmussen','0992873685','Quisque.fringilla.euismod@mi.com',0,'A d�menag�'),
('Chaim Hewitt','0542048534','Nunc@et.net',1,' '),
('Robert Peterson','0887120879','vel.lectus.Cum@lectusCumsociis.com',1,' ')

--insertion dans la table auteur
insert into Auteur
(autNom,autPrenom,autDateNaissance,autGenre,autBio)
values
('ronan','michel','25/07/1814',1,'Michel Roman, n� � Marseille le 25 juillet 1814 et mort � Paris le 25 mars 1875, est un romancier et auteur dramatique fran�ais.'),
('Brock','Denise Stuart','14/04/1930',2,''),
('Ross','aubrey','26/03/1950',2,''),
('Abra','Bernard','27/06/1838',1,'Bernard Abra, n� le 27 juin 1838 � Marylebone et mort le 12 octobre 1926 (� 87 ans), professeur et th�ologien anglais'),
('murphy','Lara','24/05/1920',2,' '),
('Knapp','Nicholas','24/07/1815',1,'Knapp Nicholas, n� le 24 juillet 1815 � Dublin  et mort le 8 novembre 1893 � Ciboure, est un g�ographe fran�ais connu pour ses voyages en �thiopie')

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
('Speciale salon du livre','2017-04-24T15:00:00','2017-04-29T17:00:00','Presentation des ecrivains feminins',0,'proImage1',0,''),
('Les ecrivains voyageurs','2017-05-02T15:00:00','2017-05-02T17:00:00','Jeune d�couverte',0,'proImage2',0,'Qui est Mathieu Grimaud, le narrateur de cette �trange histoire qui, quinze ans apr�s l�incendie de sa chambre, reste persuad� que sa m�re a voulu se d�barrasser de lui ?'),
('Coup de coeur','2017-06-06T09:00:00','2017-06-10T15:00:00','Gymnop�die pour une disparue',9.99,'proImage3',1,'Boris Sieger est un employ� de mairie attach� � sa vie ordinaire'),
('Coup de coeur','2017-06-06T09:00:00','2017-06-10T15:00:00','Le chagrin des vivants',9.99,'proImage4',1,'Durant les cinq premiers jours de novembre 1920, Angleterre attend arriv�e du Soldat inconnu, rapatri� depuis la France'),
('Le livre africain','2017-07-06T09:00:00','2017-08-06T15:00:00','visite guidee',0,'proImage5',0,'')

--insertion dans la table client
insert into Client
(cliGenre,cliPrenom,cliNom,cliEmail,cliMdp,cliDateAdhesion,cliTelF,cliTelM,cliStatut,cliChampLibre)
values
(2,'Justine Rose','Randall','velit.Cras.lorem@euturpis.edu','Jr2016Ran','26/10/2016','0163442370','0763442345',1,'client fidel'),
(1,'Jerome','Wyatt','Integer@ipsumsodales.co.uk','Jr2012Wy','02/02/2012','0293570516','0647658848',1,''),
(1,'Gonzales','Aaron','odio.Aliquam.vulputate@Crasvulputatevelit.org','Go2015Aa','15/04/2013','0523967365','0770947291',0,'Ne paie pas les factures'),
(2,'Lillith','Ian','porttitor@felisegetvarius.org','Ia1999Li','15/02/1999','0531875928','0770947291',0,'decede'),
(1,'Daniel','Franklin','mi.felis.adipiscing@turpisAliquam.com','Fr2017Da','25/03/2017','0306939190','0770947291',1,'')


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
insert into Adresse
(desId,cliId,cli_cliId,adrNumVoie,adrNomVoie,adrNomVoieSuite,adrCp,adrVille,adrPays,adrStatut)
values
(1,1,null,16,'rue Enim','',69668,'La Granja','France',1),
(NULL,null,1,50,'impasse de la butte','',75000,'Paris','France',1),
(3,3,null,20,'avenue Natoque','app1',35400,'Montpellier','France',0),
(4,4,null,18,'bd Montmartre','',95500,'Cergy','France',0),
(null,null,4,120,'rue de gare','',78230,'Les Mureaux','France',1)

--insertion dans la table theme
insert into Theme
(theNom)
values
('Amour'),
('Policier'),
('Aventure'),
('Fantastique'),
('Science-Fiction'),
('Litterature'),
('Oeuvres anciennes'),
('Litterature etrangere')

--insertion dans la table ouvrage
insert into Ouvrage
(ouvNom)
values
('Germinal'),
('Orgueil et pr�jug�s'),
('Voyage au bout de la nuit'),
('La Divine Com�die'),
('Crime et Ch�timent'),
('Madame Bovary'),
('Harry Potter et la Coupe de feu'),
('hunger Game'),
('Promise'),
('Le Seigneur des Anneaux'),
('Le vol de P�gase'),
('Le myst�re Olphite')
select * from Ouvrage

--insertion dans la table livre
insert into Livre
(isbn,ediId,tvaId,proId,ouvNom,livEdition,livDateEdition,livResume,livPrix,livStock,livImage,ouvSousTitre,livStatut,livChampLibre)
values
('9782035832030',1,3,1,'Orgueil et pr�jug�s',1,'12/01/2017','Roman de d�veloppement personnel',22.00,10,'LivImage1','Premi�res impressions',1,''),
('9782038716825',2,2,2,'Voyage au bout de la nuit',2,'01/02/2017','Voyage au bout de la nuit est un r�cit � la premi�re personne',13.00,100,'LivImage2','condition sociale',1,'Bon livre'),
('9782081386693',3,1,3,'La Divine Com�die',3,'02/03/2017','La Divine Com�die se d�roule � la moiti� du chemin de notre vie',89.50,1,'LivImage3','Commedia',0,'Psycho'),
('9782266199285',4,1,4,'Madame Bovary',1,'15/03/2017','Emma Rouault fille du riche fermier a �t� �lev�e dans un couvent',55.99,50,'LivImage4','un marchand',0,'Madame Bovary rec�le des aspects r�alistes et des aspects romantiques'), 
('9782035842756',5,2,5,'Germinal',2,'30/03/2017','Fils de Gervaise Macquart et de son amant Auguste Lantier',60.10,10,'LivImage5','Lutte des classes',1,'La derni�re phrase du roman sugg�re que les efforts collectifs des ouvriers'),
('9782035832050',1,3,1,'Harry Potter et la Coupe de feu',1,'20/05/2015','June est un prodige. � quinze ans, elle fait partie de l��lite de son pays',35.00,20,'LivImage6','fantastique1',1,''),
('9782038716870',2,3,2,'hunger Game',2,'10/02/2013','Day est le criminel le plus recherch� du territoire',25.99,100,'LivImage7','Jeux',1,'Gr�ce � Tally'),
('9782081386692',3,2,3,'Promise',3,'15/03/1850','En 2140, un traitement a �t� d�couvert pour lutter contre la vieillesse',18.75,1,'LivImage8','Mariage',0,''),
('9782266199150',4,1,4,'Le Seigneur des Anneaux',1,'02/12/2012','Anna h�ro�ne du roman qui endoctrin�e par son �ducation stricte',12.99,50,'LivImage9','La bataille',0,'Aya fait une d�couverte tellement inqui�tante'), 
('9782035842760',5,1,5,'Le vol de P�gase',2,'05/10/2012','A la t�te de une mission scientifique fran�aise',22.39,10,'LivImage10','Le voyage',1,'Pour faire face aux p�nuries'),
('9782035842761',5,2,1,'Le myst�re Olphite',2,'12/06/2014','A plus de 900 m�tres sous la glace, quelque chose appelle',10.50,10,'LivImage11','drolerie',1,'Un roman universel devenu')

--insertion dans la table avis
insert into Avis
(cliId,staType,aviNote,aviCommentaire,aviIp,aviChampLibre)
values
(3,0,3,'tr�s bon livre','10.12.45.16',''),
(4,0,0,'','88.99.10.2',''),
(5,0,4,'Ce livre est tres plaisant � lire','10.45.1.130',''),
(1,1,2,'une merde incroyable','145.10.50.30',''),
(2,1,0,'','99.100.10.75',''),
(2,0,0,'je le recommande � tous','10.20.35.43','')

--insertion dans la table ecrire
insert into Ecrire
(ouvNom,autId)
values
('Crime et Ch�timent',3),
('La Divine Com�die',4),
('Madame Bovary',5),
('Orgueil et pr�jug�s',6),
('Voyage au bout de la nuit',1),
('Germinal',2),
('Harry Potter et la Coupe de feu',3),
('hunger Game',4),
('Le myst�re Olphite',5),
('Le Seigneur des Anneaux',6),
('Le vol de P�gase',3),
('Promise',4)



--insertion dans la table soustheme
insert into SousTheme
(souNom,theNom)
values
('Poesie','Amour'),
('Roman','Aventure'),
('Mythologie','Fantastique'),
('Enquette','Policier'),
('Exploration','Science-Fiction')



--insertion dans la table appartenance
insert into Appartenance
(souNom,ouvNom)
values
('Poesie','Promise'),
('Poesie','Madame Bovary'),
('Roman','Voyage au bout de la nuit'),
('Roman','Orgueil et pr�jug�s'),
('Roman','Germinal'),
('Mythologie','Crime et Ch�timent'),
('Mythologie','La Divine Com�die'),
('Mythologie','Harry Potter et la Coupe de feu'),
('Enquette','Le vol de P�gase'),
('Enquette','Le Seigneur des Anneaux'),
('Exploration','hunger Game'),
('Exploration','Le myst�re Olphite')

--insertion dans la table commande
insert into Commande
(adrId,traId,cliId,fraId,staType,adr_adrId,comDate,comRemise,comModePaiement,comIp,comChampLibre,comDateExpedition,comNumeroDeSuivi)
values
(2,1,1,2,0,1,'14/04/2017',2,1,'10.12.45.16','','17-04-2017',00000001),
(5,2,4,3,0,4,'01/02/2017',3.5,0,'88.99.10.2','','',''),
(2,3,1,1,0,1,'05/03/2015',7.25,1,'10.45.1.130','','08-03-2015',00000002),
(5,4,4,2,0,4,'10/05/2017',10,1,'145.10.50.30','','13-05-2017',00000003),
(2,5,1,3,0,1,'20/08/2016',4.5,1,'99.100.10.75','','23-08-2016',00000004),
(5,1,4,1,0,4,'20/08/2016',15,1,'99.100.10.75','','23-08-2016','')

--insertion dans la table lignedecommande
insert into LigneCommande
(comId,isbn,aviId,ligQuantiteCommandee,ligPrix,ligTva,ligReduction)
values
(1,9782035832030,1,1,22,0.021,2),
(2,9782038716825,2,5,13,0.055,3.5),
(3,9782081386693,3,1,90,0.2,7.25),
(4,9782266199285,4,2,56,0.055,10),
(5,9782035842756,5,3,60,0.021,4.5),
(6,9782035832050,6,3,35,0.055,15)

--insertion dans la table motcle
insert into MotCle
(mocLibelle)
values
('Promise'),
('pr�jug�s'),
('Voyage'),
('hunger'),
('Poesie'),
('Oeuvres'),
('Mythologie'),
('Enquette'),
('Exploration'),
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
('Nicholas'),
('Germinal')


--insertion dans la table recherche
insert into Recherche
(mocLibelle,isbn)
values
('Abra',9782035832030),
('Exploration',9782038716825),
('Aubrey',9782081386693),
('Bernard',9782266199285),
('Brock',9782035842756),
('hunger',9782035832050),
('Ronan',9782038716870),
('Knapp',9782081386692),
('Lara',9782266199150),
('Voyage',9782035842760),
('Michel',9782035842761)
