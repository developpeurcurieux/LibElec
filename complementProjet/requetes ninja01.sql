

--Affiche les clients et ses informations 
--trier en fonction de la date d'adhesion
SELECT * FROM client
ORDER BY cliDateAdhesion ASC

--Affiche tous les commandes et ses informations 
--trier en fonction de la date de commande
SELECT * FROM commande
ORDER BY comDate ASC

--on affiche le nom, le prenom, le statut, des client
--ainsi que ses commandes (id) et la date des commandes
--trier en fonction de la date de commande

SELECT comDate, cliNom,cliPrenom,cliStatut,comId
FROM client
JOIN commande
ON client.cliId = commande.cliId
ORDER BY comDate ASC


--on affiche le nom, le prenom des client
--ainsi que ses commandes (id) et la date des commandes
--commandé en aout
SELECT cliNom,cliPrenom,cliStatut,comId,comDate
FROM client
JOIN commande
ON client.cliId = commande.cliId
WHERE DATEPART(MONTH, comDate) = '08'

select * from Commande
--on affiche le nom, le prenom et le statut des client
--ainsi que leur adresse de facturation (n° de voie, nom de voie, Nom de voie suite, Code postal, Ville, Pays)
--trier par Nom

SELECT cliNom,cliPrenom,cliStatut,adrNumVoie,adrNomVoie,adrNomVoieSuite,adrCp,adrVille,adrPays
FROM client
JOIN adresse
ON client.cliId = adresse.cli_cliId
ORDER BY cliNom ASC
select * from Adresse

--on affiche le nom, le prenom, et le statut des destinataire
--ainsi que leur adresse de livraison (n° de voie, nom de voie, Nom de voie suite, Code postal, Ville, Pays)
--trier par Nom
SELECT desNom,desPrenom,desStatut,adrNumVoie,adrNomVoie,adrNomVoieSuite,adrCp,adrVille,adrPays
FROM destinataire
JOIN adresse
ON Destinataire.desId = adresse.desId
ORDER BY Destinataire.desId ASC

--ON AFFICHE LES EVENEMENTS SANS REDUCTION DE L'ANNEE 2017
SELECT proDateDebut, proNom, proDescription FROM Promotion
WHERE proReduction = 0 AND DATEPART(YEAR, proDateDebut) = '2017'

--ON AFFICHE LES LIVRES SOUS EVENEMENTS
SELECT ouvNom, livSousTitre, proNom FROM Livre
JOIN Promotion 
ON Livre.proId = Promotion.proId
ORDER BY proNom ASC

--ON AFFICHE TOUS LES LIVRES D'UN MEME THEME
SELECT ouv.ouvNom, livSousTitre, livResume, autNom, autPrenom, sou.SouNom, theNom  FROM Ouvrage ouv
JOIN Livre liv
ON ouv.ouvNom = liv.ouvNom
JOIN Ecrire ecr
ON ouv.ouvNom = ecr.ouvNom
JOIN Auteur aut
ON ecr.autId = aut.autId
JOIN Appartenance app
ON app.ouvNom = ouv.ouvNom
JOIN SousTheme sou
ON sou.souNom = app.souNom
WHERE sou.theNom = 'Amour'

select * from SousTheme
select * from Recherche

--SIMULATION DE RECHERCHE
select livre.isbn, ouvNom from livre
join recherche rec
on rec.isbn = livre.isbn
where 

-- RECHERCHE DES LIVRES QUI ONT UNE TVA = 0
select ouvNom, Livre.tvaId, tvaTaux from Livre
join Tva
ON Livre.tvaId = Tva.tvaId
Where tvaTaux = 0

--Recherche des livres par auteur
select ouv.ouvNom, livSousTitre, autNom, autPrenom from Auteur aut
join Ecrire ecr 
On aut.autId = ecr.autId
join Ouvrage ouv
on ecr.ouvNom = ouv.ouvNom
join Livre liv
on ouv.ouvNom = liv.ouvNom
WHERE aut.autId = 2

select cli.cliNom, cli.cliPrenom, ouvNom, com.comId from Client cli
join Commande com
on cli.cliId = com.cliId 
join LigneCommande lc
on com.comId = lc.comId
join Livre liv
on lc.isbn = liv.isbn
WHERE cliNom = 'Randall'

select * from client
SELECT cli.cliNom + ' '+ cliPrenom, desNom + ' ' + desPrenom ,adrNumVoie, adrNomVoie + ' ' + adrCp + ' ' + adrVille FROM Adresse
JOIN Client cli
ON Adresse.cliId = cli.cliId 
JOIN Destinataire dest
ON cli.cliId = dest.cliId
WHERE cli.cliId = 1

