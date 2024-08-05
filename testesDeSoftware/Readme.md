# Teste de software
    
     O teste de software não é nada mais do que a realização de testes para encontrar bugs em nossa aplicação


## Conceitos básicos

### A evolução dos testes na Engenharia de software

    Antes, se utilizava o "Modelo Cascata", que consistia em primeiro especificar o projeto, realizar o projeto, reaalizar a implementação, realizar os teste e após isso implantação do projeto.

    Com o Processo de desenvolvimento ágil, onde tem-se um ciclo que se realiza várias vezes. Por exemplo,  é analisado, desenvolvido e testado várias vezes. Isso nos trouxe o mundo de desenvolvimento e teste muito mais próximos um ao outro.

### Defeitos, erro e falha

- Falha: é considera falha tudo que se é visível para o usuário
- Erro: é um cenário pelo qual o desenvolvedor não se atentou, se refere mais a falha humando perante a este sistema
- Defeito: é um erro técico, como algo desenvolvido incorretamente, como uma  linha de código de validação incorreta

### Verificação e validação

- Verificação: Estamos construindo o sistema certo?
    - Requisitos mais amplos do sistema
- Validação:  Estamos construindo o software certo?
    - Entender se as espectativas de negócio do produto está sendo atendida

## Níveis e técnicas de teste
1. Entender níveis de teste
2. Técnicas de teste

### Níveis de teste

UNIDADE ➡️ INTEGRAÇÃO ➡️ SISTEMA ➡️ REGRESSÃO ➡️ ACEITAÇÃO

#### Teste de unidade
    Testamos direcionados a pequenas unidades de softwares.

    Iremos testar cada parte, método, função de nosso programa.

#### Teste de integração
    É um teste um tanto quanto de mais alto nível

#### Teste de sistema
    É um teste que é realizado quando se faz um deploy, de uma versão minimamente estável de minha aplicação e coloco-o em ambiente de testes para algumas pessoas já começarem a testar a aplicação

#### Teste de unidade
    É um teste onde são realizados testes para que possamos confirmar se as atualizações que estamos impondo em nosso código não está quebrando as validações feitas em nossos testes anteriores

#### Teste alfa e beta
- Teste alfa: Um a versão que quase com certeza terá algo para se alterar, que será disponibilizado apenas para um público bem seleto, como por exemplo nosso time de desenvolvedores

- Teste beta: Uma versão que será disponibilizada ao público, que estará melhor estruturada

 
 ### Técnicas de teste

  - Teste de Caixa Branca: é quando você realiza o teste conhecendo o código fonte de sua aplicação

  - Teste de caixa Preta: é quando você realiza o teste sem conhecer o código fonte da aplicação, apenas tendo como base as especificações da aplicação

## Teste não funcionais
  São testes que são realizados em relação a questão que não tem diretamente as regras de negócio de nossa aplicação, como por exemplo desempenho da aplicação. 

### Teste de carga
    O teste de carga é realizado para verificar qual o volume de transações, acessos simultâneos ou usuários que um servidor/software/sistema suporta. Pontos de atenção:

- Objetvios para clareza de resultados
- Ambiente
- Cenários
- Execução de testes
- Analise de resultado

Ferramentas:
    - Gattling
    - Apache Jmeter

### Teste de stress

    Este teste é realizado para submter o software a situações extremas. Basicamente o teste de stress baseia-se em testar os limites do software e analisar o seu comportamento.

### Teste de segurança
    É um processo crítico de segurança cibernética que visa detectar vulnerabilidades em sistemas, software, redes e aplicativo

## Testes unitários com JUnit
    A importância de realizar os teste unitários é de conseguir testar parte a parte de nossa aplicação para entregar o projeto final o mais conciso possível.

    Nos ajuda também a compreender o código fonte, corrigir bugs com segurança,  refatorar o código sem introduzir bugs.