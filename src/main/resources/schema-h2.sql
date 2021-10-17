CREATE TABLE salle(id_salle integer,
                    nom_salle VARCHAR(255),
                    capacite_salle int,
                    date_reservation Time,
                    reserved boolean);
                   

CREATE TABLE materiel(
                    id_materiel integer  ,
                    nom_materiel VARCHAR(255),
                    NOMBRE_EQUIPEMENTS int
                    );
            
CREATE TABLE MATERIEL_SUPLEMENTAIRE(
                    ID_MATERIEL_SUP integer not null PRIMARY KEY,
                    NOM_MATERIEL_SUP VARCHAR(255),
                    NOMBRE_EQUIPEMENT_SUP int
                    );

CREATE TABLE T_SALLES_MATERIELS_ASSOCIATIONS (
    id_salle   integer     ,
    id_materiel   integer     
    );
                   
CREATE TABLE T_SALLES_MATERIELS_SUP_ASSOCIATIONS (
    id_salle   integer ,
    ID_MATERIEL_SUP   integer);
    
                   
    
    

                