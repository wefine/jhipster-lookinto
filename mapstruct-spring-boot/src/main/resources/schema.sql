CREATE DATABASE IF NOT EXISTS jhipster
    COLLATE = 'utf8_general_ci'
    DEFAULT CHARACTER SET = 'utf8';

USE jhipster;

CREATE TABLE IF NOT EXISTS `superhero` (
    `id`         INT(11)     NOT NULL AUTO_INCREMENT,
    `name`       VARCHAR(32) NOT NULL,
    `first_name` VARCHAR(32),
    `last_name`  VARCHAR(32),
    `good`       BIT(1),
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = 'utf8';
