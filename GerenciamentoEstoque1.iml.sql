create database db_gerenciamento_estoque;

use db_gerenciamento_estoque;

create table produtos(
idProdutos int not null,
nome varchar(45) not null,
quantidade_estoque int not null,
preco_unitario double not null,
fornecedor varchar(45) not null,
primary key(idProdutos)
);

INSERT INTO produtos (idProdutos, nome, quantidade_estoque, preco_unitario, fornecedor)
VALUES
  (1, 'Notebook HP', 50, 2500.00, 'Mega Eletrônicos'),
  (2, 'Smartphone Samsung', 100, 1200.00, 'Tech Store'),
  (3, 'Smart TV LG', 30, 1500.00, 'Eletro Mega'),
  (4, 'Impressora Epson', 20, 300.00, 'Papel e Tinta Ltda.'),
  (5, 'Geladeira Brastemp', 10, 2500.00, 'EletroFrio'),
  (6, 'Console Playstation', 40, 1800.00, 'Games Universe'),
  (7, 'Máquina de Café', 15, 150.00, 'Café Express'),
  (8, 'Forno Elétrico', 25, 500.00, 'EletroMaster'),
  (9, 'Aspirador de Pó', 12, 100.00, 'Clean Solutions'),
  (10, 'Liquidificador', 18, 50.00, 'MixBlender');

select * from produtos;

create table clientes(
idClientes int not null,
cpf varchar(45) not null,
nome varchar(45) not null,
telefone long not null
);

select * from clientes;

INSERT INTO clientes (idClientes, cpf, nome, telefone)
VALUES
  (1, '123.456.789-01', 'João da Silva', '(11) 9876-5432'),
  (2, '987.654.321-09', 'Maria Oliveira', '(21) 8765-4321'),
  (3, '111.222.333-44', 'Pedro Santos', '(31) 7654-3210'),
  (4, '555.666.777-88', 'Ana Pereira', '(41) 6543-2109'),
  (5, '999.888.777-66', 'Carlos Rocha', '(51) 5432-1098'),
  (6, '444.333.222-11', 'Luciana Fernandes', '(61) 4321-0987'),
  (7, '777.888.999-00', 'Rafaela Oliveira', '(71) 3210-9876'),
  (8, '333.222.111-00', 'Marcos Souza', '(81) 2109-8765'),
  (9, '123.321.123-32', 'Fernanda Lima', '(91) 1098-7654'),
  (10, '543.654.765-87', 'Guilherme Rodrigues', '(01) 8765-4321');
