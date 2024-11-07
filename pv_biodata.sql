create schema pv_biodata;

use pv_biodata;

CREATE TABLE tbl_biodata (
    id INT NOT NULL AUTO_INCREMENT,
    nama VARCHAR(255) NOT NULL,
    nim VARCHAR(12) NOT NULL UNIQUE,
    ttl VARCHAR(50) NOT NULL,
    jekel VARCHAR(50) NOT NULL,
    prodi VARCHAR(255) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


