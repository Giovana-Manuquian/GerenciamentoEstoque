**Readme.md**

# Sistema de Gerenciamento de Estoque em Java

Este é um projeto de um sistema de gerenciamento de estoque desenvolvido em Java, com funcionalidades abrangentes para a administração de produtos, clientes e vendas. O sistema utiliza MySQL como banco de dados para armazenar dados de maneira eficiente e estruturada.

## Funcionalidades Principais

### 1. Gestão de Produtos

- **Registro:** Cadastre novos produtos no sistema, incluindo informações como nome, quantidade em estoque, preço unitário e fornecedor.
  
- **Listagem:** Visualize a lista completa de produtos cadastrados.

- **Exclusão:** Remova produtos do sistema informando o nome do produto.

- **Consulta:** Pesquise produtos por nome para obter informações detalhadas.

- **Edição:** Atualize informações de produtos existentes, como fornecedor.

### 2. Gestão de Clientes

- **Registro:** Cadastre novos clientes no sistema, informando CPF, nome e número de telefone.

- **Listagem:** Consulte a lista completa de clientes cadastrados.

- **Exclusão:** Remova clientes do sistema informando o CPF.

- **Consulta:** Busque clientes por nome para visualizar detalhes.

- **Edição:** Atualize informações de clientes existentes, como número de telefone.

### 3. Gestão de Vendas

- **Registro de Vendas:** Registre vendas, associando produtos e clientes, e armazenando informações como nome do produto, nome do cliente e preço do produto.

## Estrutura do Projeto

O projeto está estruturado em pacotes Java para melhor organização:

- **`br.senai.sp.jandira`**: Contém a classe principal `Main` que inicia o sistema.
  
- **`br.senai.sp.jandira.controller`**: Engloba controladores para as entidades do sistema, como `ProductsController`, `CustomerController` e `SaleController`.

- **`br.senai.sp.jandira.model`**: Inclui classes de modelo para representar entidades do sistema, como `Products`, `Customer` e `Sale`.

- **`br.senai.sp.jandira.model`**: Contém a classe responsável pela conexão com o banco de dados, `Connection`.

## Pré-requisitos

- Java JDK instalado
- MySQL Server instalado
- IDE Java (recomendado: IntelliJ, Eclipse)

## Configuração do Banco de Dados

1. Execute o script SQL fornecido (`script.sql`) para criar o banco de dados e popular as tabelas com dados iniciais.

2. No arquivo `Conection.java` (pacote `br.senai.sp.jandira.model`), ajuste as configurações de conexão com o banco de dados, se necessário.

## Como Executar

1. Abra o projeto em sua IDE Java.

2. Execute a classe `Main` localizada no pacote `br.senai.sp.jandira`.

3. Siga as instruções no console para interagir com o sistema.

## Autora

Giovana-Manuquian

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
