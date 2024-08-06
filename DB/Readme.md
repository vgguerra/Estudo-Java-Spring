# Banco de dados

## MER e DER
    O Modelo de Entidade-Relacionamento(MER) é representado através de diagramas chamados Diagrams Entidade-Relacionamento


Para especificar que uma determinada tabela está relacionada a outra, utilizamos `id{nome da tabela}` 

        
- Restrição de valores
    - NOT NULL - Idicara que o campo é obrigatório
    - UNIQUE - Indicara que o determinado valor é único
    - DEFAULT - Indicara valores padrões para as colunas dentro da tabela
- Chaves primárias e estrangeiras
- Auto incremento


### Atributos
    São características ou propriedades das entidades. Eles descrevem informações específicas sobre uma entidade.

    # Banco de dados relacionais


### Criação da tabelas
    Para a criação da tabela, utiliza-se o comando `CREATE TABLE {NOME DA TABELA}( {Atributo1,Atributo2...} )`

    <a href="https://creately.com" style="color:#F69392">Site para modelagem de banco de dados¹</a><br>
    Tem-se também um <a href="https://www.quickdatabasediagrams.com">site</a> que irá realizar a modelagem de banco de dados utilizando código apenas. 

Para inserir dados em sua tabela, deve-se utilizar a sintaxe da seguinte forma:
````bash
INSERT INTO {nome_tabela}(valor1,valor2,valor2) VALUE(
    "Equivalente valor1",
    "Equivalente valor2",
    "Equivalente valor3"
);
````

## Imprimindo os valores da tabela

1. Imprimindo todos

````bash
SELECT * FROM nome_tabela
````
>**OBSERVAÇÃO**: O "\*" serve para dizer que quermos todos os valores dentro da tabela

2. Imprimindo especificamente
````bash
SELECT * FROM nome_tabela WHERE idade = 8; 
````
Neste caso, o mySQL irá retornar apenas os usuários que tem a **idade** igual a 8. 

    Para verificar padrões, como por exemplo, mostrar todos que tem o primeiro nome "JOÃO" utiliza-se o LIKE
<br>
<br>

## Deletando registros no MySQL

Para deletar um registro em sua tabela, usamos o comando `DELETE`:
````bash
DELETE FROM _nome_table WHERE nome = value
````
>**CUIDADO** : Se o comando `DELETE` for utlizado sozinho, sem o `WHERE`, desta forma => `DELETE FROM _name_table` <= toda a sua tabela será apagado. 

<br>
<br>

## Atulizando dados no banco de dados

````bash
UPDATE _name_table SET nome = "Novo nome" WHERE nome = "Nome antigo"
````

>**CUIDADO** : Assim como o `DELETE`, não use este comando sem o `WHERE`.

<br>
<br>

## Apagando uma tabela
    Para apagar uma tabela, basta utiliza o comando "DROP table {nome_tabela}".

## Chaves primárias
- Um atributo que identifica de forma excluisava cada registro de nossa tabela
-  Impede a duplicação de registros
- Não pode conter valores nulos
- Uma tabela pode ter apenas uma chave primária

Podemos criar uma tabela com um auto incremento utilizando o seguinte comando:
````bash
CREATE TABLE {{nome_tabela}}(ID PRIMARY KEY AUTOINCREMENT);
````
Ou caso você já tenha criado a tabela e queira adiconar uma primarykey a ela, utilize o seguinte comando:
````bash
ALTER TABLE{{nome_tabela}} MODIFY COLUMN ID INT PRIMARY KEY;
````

## Chaves Estrangeiras

Uma `chave estrangeira` é usada para estabelecer uma relação entre duas  tabelas, mantendo a integridade dos dados entre tabelas relacionadas

- Pode ser nula
- Pode ter mais de uma ou nenhuma em uma tabela

Para usa-la utiliza-se o seguinte comando:
````bash
CREATE TABLE {{nome_tabela}}(
id INT PRIMARY KEY,
chave_estrangeira INT,
FOREIGN KEY (chave_estrangeira) REFERENCES{{outra_tabela}}(id)
)
````
  Restrições:
  <img src="./da.png">

## Normalização de dados
  A normalização de dados é um processo no qual se organiza e estrutura um banco de dados relacional de forma a eliminar redundâncias e anomalias, garantindo a consistência e integridade dos dados
