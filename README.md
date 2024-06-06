<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Calculadora REST com Spring Boot em Java</h1>

<p>Este é um projeto de uma calculadora REST desenvolvida com o framework Spring Boot em Java. A aplicação permite realizar operações matemáticas básicas através de requisições HTTP.</p>

<h2>Funcionalidades Principais</h2>

<ul>
    <li><strong>Soma:</strong> <code>/sum/{numberOne}/{numberTwo}</code> - realiza a soma de dois números.</li>
    <li><strong>Subtração:</strong> <code>/subtract/{numberOne}/{numberTwo}</code> - realiza a subtração entre dois números.</li>
    <li><strong>Multiplicação:</strong> <code>/multiplication/{numberOne}/{numberTwo}</code> - realiza a multiplicação de dois números.</li>
    <li><strong>Divisão:</strong> <code>/division/{numberOne}/{numberTwo}</code> - realiza a divisão entre dois números.</li>
    <li><strong>Cálculo da Média:</strong> <code>/mean/{numbers}</code> - calcula a média de uma lista de números.</li>
    <li><strong>Cálculo da Raiz Quadrada:</strong> <code>/sqrt/{number}</code> - calcula a raiz quadrada de um determinado número.</li>
</ul>

<h2>Tecnologias Utilizadas</h2>

<ul>
    <li>Spring Boot</li>
    <li>Java</li>
</ul>

<h2>Estrutura do Projeto</h2>

<p>O projeto está estruturado em classes de controlador, serviço e utilitário para separar as responsabilidades e facilitar a manutenção do código.</p>

<pre>
src/
|-- main/
|   |-- java/
|   |   |-- br.com.api_gateway/
|   |   |   |-- controller/
|   |   |   |-- service/
|   |   |   |-- util/
|   |-- resources/
|-- test/
|   |-- java/
|   |   |-- br.com.api_gateway/
|   |   |   |-- controller/
|   |   |   |-- service/
</pre>

<h2>Como Usar</h2>

<ol>
    <li>Clone o repositório:</li>
</ol>

<pre>
<code>git clone https://github.com/seu-usuario/calculadora-rest-spring-boot.git</code>
</pre>

<ol start="2">
    <li>Importe o projeto em sua IDE preferida.</li>
    <li>Execute a aplicação Spring Boot.</li>
    <li>Faça requisições HTTP para os endpoints listados acima para realizar as operações matemáticas desejadas.</li>
</ol>


</body>
</html>
