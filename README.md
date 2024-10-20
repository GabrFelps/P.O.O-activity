# P.O.O-activity

Explique com suas palavras a diferença entre uma classe e um objeto e como
esses dois conceitos se relacionam. Além disso, apresente um exemplo do mundo
real para cada um (por exemplo, usando a classe Carro e instâncias como Fusca e
Civic).


### Diferença entre Classe o Objeto
Classe é um molde que serve para a criação de objetos, pode definir seus atributos e métodos.Os Objetos representam algo mais concreto, possuem valores definidos aos seus atributos e são capazes de executar métodos. 
Classe e Objetos se diferenciam em sua abrangência(classes), concreticidade(objetos) e na sua aplicação, já que os objetos aplicam o que as classes definem. 


### Relação entre Classe e Objeto
A relação entre objetos e classes existe pois as classes servem como moldes para os objetos. Os objetos utilizam a estrutura e as definições da classe. Podem existir vários objetos dentro de uma classe, podendo cada uma ter sua característica própria, mas todas compartilhando a mesma estrutura da classe.

### Exemplo Real
Como vimos a classe serve como um molde para suas instâncias(objetos), e uma classe pode ter vários objetos com características diferentes mas que apresentam o mesmo modelo
- Classe Carro: A classe carro possui alguns atributos e métodos
  - Atributos: modelo, cor, ano
  - Métodos: acelerar(), frear(), ligar(), desligar()

## Contextos/Sistemas distintos em que os atributos abaixo seriam relevantes:
#### CPF
- Sistema em que não é importante:
  - Sistemas Internacionais
- Sistema em que é moderadamente importante
  - Sistemas de Delivery
- Sistema em que é essencial
  - Sistemas de Banco

#### Histórico de Sáude
- Sistema em que não é importante:
  - Sistema de E-Commerce
- Sistema em que é moderadamente importante
  - Sistemas de Farmácia
- Sistema em que é essencial
  - Sistema Hospitalar
#### Quantidade de Seguidores
- Sistema em que não é importante:
  - Sistema de Transporte
- Sistema em que é moderadamente importante
  - Sistemas de Ensino e Cursos
- Sistema em que é essencial
  - Sistemas de Rede Social 
#### Habilidade Destra
- Sistema em que não é importante:
  - Sistema de Ensino Online
- Sistema em que é moderadamente importante
  - Sistemas de Design Gráfico
- Sistema em que é essencial
  - Sistemas de Cirurgia
#### Endereço
- Sistema em que não é importante:
  - Sistemas de Jogos
- Sistema em que é moderadamente importante
  - Sistemas de Recrutamento
- Sistema em que é essencial
  - Sistemas de Navegação
#### Saldo em Conta
- Sistema em que não é importante:
  - Sistemas de Rede Social
- Sistema em que é moderadamente importante
  - Sistemas de Streaming
- Sistema em que é essencial
  - Sistemas de Bancos
#### Etnia
- Sistema em que não é importante:
  - Sistemas de Rede Social
- Sistema em que é moderadamente importante
  - Sistemas de Educação
- Sistema em que é essencial
  - Sistema de Pesquisa Demográfica

## Considerando os objetos e Pessoa Conta
 - #### Seria interessante em um sistema bancário um objeto "conta" possuir uma "pessoa" como um atributo interno representando o titular da conta?
   - Sim, a conta de um sistema bancário possuir "pessoa" como atributo é benéfico principalmente na organização e clareza. Para gerenciar relacionamentos caso a pessoa tenha mais de uma conta. Encapsulamento de Dados, pois dentro de pessoa, poderiam ter dados importantes como cpf, endereço, nome. Facilitando assim, a manutenção dos dados
 - #### Olhando no sentido inverso, seria interessante uma pessoa possuir mais de uma conta como atributo? Que elemento da programação estruturada melhor representaria o conjunto de contas de uma pessoa?
    - Sim, geralmente, um indivíduo possui várias contas bancárias para diversos fins. Logo, seria muito importante uma pessoa possuir mais de uma conta como atributo
    
## Objetos de um sistema de controle acadêmico
#### Sala

Representa os espaços onde as aulas acontecem. Pode incluir atributos como número da sala, capacidade e etc.
#### Nota

Representa as notas dos alunos em uma disciplina. Pode incluir atributos como valor da nota, tipo de avaliação (prova, trabalho) e etc.
#### Matrícula

Representa o identificador único do aluno em curso ou disciplina. Pode incluir atributos como data de matrícula, status (ativa, cancelada), e informações do aluno e disciplina.
#### Curso

Representa as formações disponíveis. Pode incluir atributos como nome do curso, grau (graduação, pós-graduação), e  suas disciplinas obrigatórias.
#### Calendário Acadêmico

Representa as datas importantes do ano letivo, como início e término de semestres, feriados e períodos de matrícula.

