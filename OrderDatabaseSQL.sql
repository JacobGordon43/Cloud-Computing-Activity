-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cst339
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cst339
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cst339` DEFAULT CHARACTER SET utf8 ;
USE `cst339` ;

-- -----------------------------------------------------
-- Table `cst339`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cst339`.`order` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `order_no` VARCHAR(25) NOT NULL,
  `product_name` VARCHAR(128) NOT NULL,
  `price` FLOAT NOT NULL,
  `quantity` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
