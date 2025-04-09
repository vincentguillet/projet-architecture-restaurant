/* Création de la base */
CREATE DATABASE IF NOT EXISTS restaurant;
USE restaurant;

/* Création de la table clients */
CREATE TABLE IF NOT EXISTS clients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomClient VARCHAR(50) NOT NULL,
    telephone VARCHAR(13) NOT NULL UNIQUE,
    adresseMail VARCHAR(150) DEFAULT NULL UNIQUE  
);

/* Création de la table reservations */
CREATE TABLE IF NOT EXISTS reservations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dateReservation DATETIME NOT NULL,
    nombrePersonnes INT NOT NULL,
    client_id INT NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);

/* Création de la table commandes */
CREATE TABLE IF NOT EXISTS commandes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    prixCommande INT NOT NULL,
    dateCommande DATETIME NOT NULL,
    client_id INT NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);

/* Création de la table menus */
CREATE TABLE IF NOT EXISTS menus (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomMenu VARCHAR(20) NOT NULL,
    prixMenu INT NOT NULL
);

/* Création de la table plats */
CREATE TABLE IF NOT EXISTS plats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomPlat VARCHAR(50) NOT NULL,
    descriptionPlat VARCHAR(255) DEFAULT NULL,
    prixPlat INT NOT NULL
);

/* Création de la table menus_plats */
CREATE TABLE IF NOT EXISTS menus_plats (
    menu_id INT NOT NULL,
    plat_id INT NOT NULL,
    PRIMARY KEY (menu_id, plat_id),
    FOREIGN KEY (menu_id) REFERENCES menus(id),
    FOREIGN KEY (plat_id) REFERENCES plats(id)
);

/* Création de la table commandes_menus */
CREATE TABLE IF NOT EXISTS commandes_menus (
    commande_id INT NOT NULL,
    menu_id INT NOT NULL,
    PRIMARY KEY (commande_id, menu_id),
    FOREIGN KEY (commande_id) REFERENCES commandes(id),
    FOREIGN KEY (menu_id) REFERENCES menus(id)
);

/* Création de la table commandes_plats */
CREATE TABLE IF NOT EXISTS commandes_plats (
    commande_id INT NOT NULL,
    plat_id INT NOT NULL,
    PRIMARY KEY (commande_id, plat_id),
    FOREIGN KEY (commande_id) REFERENCES commandes(id),
    FOREIGN KEY (plat_id) REFERENCES plats(id)
);
