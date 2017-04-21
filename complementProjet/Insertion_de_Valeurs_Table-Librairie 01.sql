/*==============================================================*/
/* On insert des livres dans la table Livre                                            */
/*==============================================================*/

INSERT INTO Livre
(isbn,ediId,tvaId,proId,ouvNom,livEdition,livDateEdition,livResume,livPrix,livStock,livImage,livSousTitre,livStatut,livChampLibre)
VALUES
('9782035832030','000001','001','','Britannicus','1','23-08-2006','Empereur Néron règne depuis un an ','6','10','image01','','1',''),
('9782038716825','000001','001','','Phedre','1','01-01-1998', 'la piece se situe dans la Grece','5','1','image02','','1',''),
('9782081386693','000002','001','','La Republique','2','22-06-2016 ','Texte intégral de l"un des plus importants écrits de la philosophie politique','2','10','image03','','1',''),
('9782266199285','000003','001','','Germinal','1','10-09-2009', 'Pour suivre le destin d"Etienne Lancier, Zola visite les bassins houillers','4','3','image04','','1',''), 
('9782035842756','000001','001','','Colomba','1','04-06-2008','De sa mission d"inspection des monuments historiques en Corse','3.50','0','image05','','0','')

/*==============================================================*/
/* On insert des editeurs dans la table Editeur                 */
/*==============================================================*/

INSERT INTO Editeur
(ediId,ediNom,ediTeleF,editEmail,ediStatut,ediChampLibre)
VALUES
('000001','Larousse','+33144394400','','1',''),
('000002','Flammarion','+33140513100','','1',''),
('000003','Pocket','+33144160500 ','','1','')

