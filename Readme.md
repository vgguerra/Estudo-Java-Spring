# Gerenciamento de dependências e building com MAVEN

## O que é o maven
 - Maven é uma ferramenta de gerenciamento de projetos e build assim como o Gradle, CMake,etc.
    - O maven vem para nos auxiliar a compilar uma aplicação com diversas classes, empacotamento de nossa aplicação, entre outros.
- O maven endereça como o software foi construído e suas dependências através do POM(Project Object Model), facilitando assim, a compreensão do desenvolvedor

### Criando um projeto via cmd

Para isso, digite em seu terminal, o seguinte comando:

````bash
mvn archetype:generate -DgroupID=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinterativeMode=false
````

### Comando que auxiliam o dia a dia

- Compilar os arquivo:
    - mvn compile

Ao executar essa linha, nosso arquivo será compilado

- Realizar testes
    - mvn test

Ao executar essa linha, o maven irá buscar todas os testes da aplicação e irá executa-los

- Empacotar a aplicação
    - mvn package

Irá gerar um .jar de nosso projeto

### Gerando diferentes tipos de projetos

    Para gerar o melhor tipo de projeto para minha aplicação utilizando maven, posso consultar "maven archetype list" no navegador e verificar qual opção faz mais sentido em meu cenário

## POM
    Abreviação de "Project Object Model". No arquivo POM, terá nossas dependêwncias, módulos, etc.
    O mesmo utilza o formato XML.
    Nele, é detalhado como construir o projeto, o nome do projeto, depedências, módulos, configurações de build,etc.

### Repositórios
    Locais onde poderemos encontrar plugins e bibliotecas que o maven nos provê.

    O repositório remoto. é automaticamente configurado pelo Super POM para utilizar o MavenCentral

### Dependencias
    Para adcionar uma nova dependência em nosso projeto, primeiro iremos selecionar qual será a dependência, normalmente no maven central, e iremos adiconar a tag "<dependency>" em nosso projeto junt com a chamada da mesma.


# Banco de dados relacionais

## MER

Para especificar que uma determinada tabela está relacionada a outra, utilizamos `id{nome da tabela}` 

        
- Restrição de valores
    - NOT NULL - Idicara que o campo é obrigatório
    - UNIQUE - Indicara que o determinado valor é único
    - DEFAULT - Indicara valores padrões para as colunas dentro da tabela
- Chaves primárias e estrangeiras
- Auto incremento

### Criação da tabelas
Para a criação da tabela, utiliza-se o comando `CREATE TABLE {NOME DA TABELA}( {Atributo1,Atributo2...} )`




<a href="https://creately.com" style="color:#F69392">Site para modelagem de banco de dados¹</a><br>
Tem-se também um <a href="https://www.quickdatabasediagrams.com">site</a> que irá realizar a modelagem de banco de dados utilizando código apenas. 