CREATE TABLE `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(8) DEFAULT NULL,
  `sex` enum('male','female') DEFAULT NULL,
  PRIMARY KEY (`id`)
);