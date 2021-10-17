INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (1,'E1001',23,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (2,'E1002',10,false, null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (3,'E1003',8,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (4,'E1004',4,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (5,'E2001',4,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (6,'E2002',15,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (7,'E2003',7,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (8,'E2004',9,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (9,'E3001',13,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (10,'E3002',8,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (11,'E3003',9,false,null);
INSERT INTO salle(id_salle,nom_salle, capacite_salle,reserved,date_reservation) VALUES (12,'E3004',4,false,null);



INSERT INTO materiel(id_materiel,nom_materiel,NOMBRE_EQUIPEMENTS) VALUES (1,'Ecran',1);
INSERT INTO materiel(id_materiel,nom_materiel,NOMBRE_EQUIPEMENTS) VALUES (2,'Pieuvre',1);
INSERT INTO materiel(id_materiel,nom_materiel,NOMBRE_EQUIPEMENTS) VALUES (3,'Webcam',1);
INSERT INTO materiel(id_materiel,nom_materiel,NOMBRE_EQUIPEMENTS) VALUES (4,'Tableau',1);
INSERT INTO materiel(id_materiel,nom_materiel,NOMBRE_EQUIPEMENTS) VALUES (5,'Néant',1);


INSERT INTO MATERIEL_SUPLEMENTAIRE(ID_MATERIEL_SUP,NOM_MATERIEL_SUP,NOMBRE_EQUIPEMENT_SUP) VALUES (1,'Pieuvre',4);
INSERT INTO MATERIEL_SUPLEMENTAIRE(ID_MATERIEL_SUP,NOM_MATERIEL_SUP,NOMBRE_EQUIPEMENT_SUP) VALUES (2,'Ecran',5);
INSERT INTO MATERIEL_SUPLEMENTAIRE(ID_MATERIEL_SUP,NOM_MATERIEL_SUP,NOMBRE_EQUIPEMENT_SUP) VALUES (3,'Webcam',4);
INSERT INTO MATERIEL_SUPLEMENTAIRE(ID_MATERIEL_SUP,NOM_MATERIEL_SUP,NOMBRE_EQUIPEMENT_SUP) VALUES (4,'Tableau',2);

INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(1,5);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(2,1);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(3,2);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(4,4);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(5,5);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(6,1);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(6,3);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(7,5);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(8,4);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(9,1);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(9,2);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(9,3);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(10,5);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(11,1);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(11,2);
INSERT INTO T_SALLES_MATERIELS_ASSOCIATIONS(id_salle,id_materiel) VALUES(12,5);



