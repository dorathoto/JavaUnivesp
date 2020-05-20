### Objetivo
Familiarizar os alunos com os conceitos básicos de orientação a objetos, entre eles:
 - Classes
 - Objetos
 - Herança
 - Polimorfismo
  Além de introduzir técnicas de programação baseadas nesses conceitos e alguns temas adicionais como programação genérica e tratamento de erros e exceções.

### Ementa - resumo
Conceitos básicos e avançados de programação orientada a objetos. Aplicação dos conceitos usando uma linguagem orientada a objetos.

------------
**Além dos tópicos acima eu colo:**
- Encapsulamento
- Abstração

------------


### Porque utilizamos POO?
Programação estrutural falar dos problemas, ex: 
**page1.php**
```csharp
//string de conexao
//select
//exibir dados
```
**page2.php**
```csharp
//string de conexao
//select
//exibir dados
```
Se precisar mexer na string de conexão? terá que alterar todas as pages, solução função
**func_stringConexao.php**
```//string conexao```
**page1.php**
```csharp
//func_StringConexao
//select
//exibir dados
```
**page2.php**
```csharp
//func_StringConexao
//select
//exibir dados
```
Em um primeiro momento isso é fantastico, depois terá 200 funções, muitas delas são muito parecidas só muda alguns poucos detalhes (pouco aproveitamento de código) quando mexe em uma função quebra 20 páginas que dependiam dela (alto acoplamento)
Então a POO é uma tecnica de programação, quase como um designer partner, que visa toda uma nova abordagem de desenvolvimento, suas vantagens:

------------


**Vantagens **
- Maior facilidade para reutilização de código e por conseqüência do projeto;
- Ciclo de vida mais longo para os sistemas.

**Desvantagens**
- Complexidade no aprendizado para desenvolvedores de linguagens estruturadas;
- Maior esforço na modelagem de um sistema OO do que estruturado (porém menor esforço de codificação, sendo uma vantagen);


------------
Ex: Prático
[Pessoa.java](https://github.com/dorathoto/JavaUnivesp/blob/master/mypackage/Pessoa.java "Pessoa.java")
