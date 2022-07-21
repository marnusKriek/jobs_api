-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema job_application_api
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema job_application_api
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `job_application_api` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `job_application_api` ;

-- -----------------------------------------------------
-- Table `job_application_api`.`applicants`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `job_application_api`.`applicants` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `create_date` DATETIME(6) NULL DEFAULT NULL,
  `date_of_birth` DATE NULL DEFAULT NULL,
  `first_name` VARCHAR(255) NULL DEFAULT NULL,
  `last_name` VARCHAR(255) NULL DEFAULT NULL,
  `modified_date` DATETIME(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `job_application_api`.`listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `job_application_api`.`listings` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `active` BIT(1) NULL DEFAULT NULL,
  `create_date` DATETIME(6) NULL DEFAULT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  `modified_date` DATETIME(6) NULL DEFAULT NULL,
  `title` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
