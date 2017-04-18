USE librairie

INSERT INTO Client 
(cliGenre, cliPrenom, cliNom, cliEmail, cliMdp, cliDateAdhesion, cliTelF, cliTelM, cliStatut, cliChampLibre)
VALUES 
(0, 'Joseph', 'LACOURT', 'dui@malesuadavelconvallis.edu', 'ninja01', '2016-12-17', '01 97 86 51 83', '06 80 26 43 87', '', ''),
(0, 'Georges','HENRY', 'sodales.Mauris.blandit@malesuada.org', 'ninja02', '2016-07-17', '01 70 59 40 51', '', '', ''),
(1, 'Veronique','GURY', 'consequat.purus@quamvel.org', 'ninja03', '2015-05-24', '', '06 58 28 23 52', '', ''),		
(0, 'Laurence','DY', 'in@egetipsumSuspendisse.co.uk', 'ninja04', '2017-01-31', '01 92 84 07 41', '06 35 77 49 33', '', '')



INSERT INTO Transporteur 
(traNomLivreur, traTelF, traEmail, traStatut, traChampLibre)
VALUES
('DHL', '01 32 56 98 74', 'contact-client@dhl.com', '', ''),
('CHRONOPOST', '01 02 54 78 95', 'suivi-client@chronopost.fr', '', ''),
('TNT', '02 03 54 95 65', 'contact@tnt.fr', '', ''),
('UPS', '09 98 09 76 76', 'suivi-contact-client@ups.com', '', '')



INSERT INTO Editeur 
(ediNom, ediTelF, ediEmail, ediStatut, ediChampLibre)
VALUES
('Larousse','+33144394400','contacts@larousse.fr', '' ,''),
('Flammarion','+33140513100','envoi@Flammarion.fr', '', ''),
('Pocket','+33144160500','pocket-client@pocket.fr', '', '')



INSERT INTO Ouvrage
(ouvNom)
VALUES
('Britannicus'),
('Phedre'),
('La Republique'),
('Germinal'),
('Colomba')



INSERT INTO InfoLibrairie
(infNom, infSiret,infNumVoie,infNomVoie,infNomVoieSuite,infCp,infVille,infPays)
VALUES
('LibElec', 35334885700031, 6 ,'Georges et Mai Politzer','rue','75012','Paris','France')



INSERT INTO Auteur
(autNom, autPrenom, autDateNaissance, autGenre, autBio)
VALUES
('Zola', 'Emile', '1840-04-02', 0, 'ecrivain et journaliste francais'),
('Hugo', 'Victor', '1802-02-26', 1, 'ecrivain et poete francais'),
('Proust', 'Marcel', '1871-07-10', 1, 'ecrivain francais')



INSERT INTO Statut
(staLibelle)
VALUES
('valide'),
('Non-valide'),
('disponible'),
('Non-disponible'),
('en cours de traitement'),
('expedie'),
('en cours de paiement'),
('paye'),
('Non-paye'),
('en cours dapprovisonement'),
('en stock'),
('Rupture de stock'),
('indisponible - fin de serie'),
('rupture contrat editeur'),
('en cours de demenagement'),
('nouveau editeur'),
('nouveau client'),
('client decede'),
('client injoinable'),
('erreur adresse destinataire'),
('destinataire non present')



INSERT INTO FraisDePort
(fraPrix)
VALUES
(7.50),
(20.10)


INSERT INTO Tva
(tvaTaux)
VALUES
(0.0),
(5.5),
(19.6),
(20.00)



INSERT INTO Promotion
(proNom, proDateDebut, proDateFin, proDescription, proStatut)
VALUES
('Salon agriculture', '2017-04-10', '2017-05-02', 'genial pour les petits curieux', 0)



INSERT INTO Theme
(theNom)
VALUES
('Roman'),
('Naturalisme'),
('Policier'),
('Poesie')


INSERT INTO MotCle
(mocLibelle)
VALUES
('auteur'),
('theme'),
('livre'),
('promotion'),
('evenement'),
('ouvrage')