CREATE TABLE `pessoa` (
  `id_pessoa` int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `nome` varchar(100) NOT NULL,
  `dt_nasc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `cliente` (
  `id_cliente` int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `cpf` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL,
  `telefone` varchar(200) NOT NULL,
  `id_pessoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `cliente` ADD KEY `fk_pessoa` (`id_pessoa`);

ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_pessoa` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`);
COMMIT;

INSERT INTO `pessoa`(`id_pessoa`, `nome`, `dt_nasc`) VALUES (1,'maria lucia','01/10/1980');

INSERT INTO `cliente`(`id_cliente`, `cpf`, `email`, `telefone`, `id_pessoa`) VALUES (1,'32423212','marialucia@gmail.com','32248273',1);
