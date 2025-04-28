# Projeto: Sistema de Gestão de Perfumes Gambá

Este projeto é um sistema desenvolvido em Java para gerenciar as operações da empresa fictícia Perfumes Gambá, como parte do trabalho final da disciplina de Programação Orientada a Objetos Visual (POOV) no IFTM - Campus Uberaba Parque Tecnológico.

O sistema permite a gestão de clientes, perfumes e pedidos, incluindo cadastro, atualização, remoção, buscas específicas e geração de relatórios em PDF.


## 🛠️ Funcionalidades

- **Clientes**: Cadastro, edição, remoção e busca de clientes por nome ou CPF.
- **Perfumes**: Cadastro, edição, remoção e busca de perfumes por lote.
- **Pedidos**: Cadastro de pedidos vinculados a clientes e consulta de pedidos antigos.
- **Relatórios**: Geração de arquivos PDF e .txt a partir das listagens do sistema.
- **Interface Gráfica**: Telas intuitivas com Java Swing, usando JTable, JComboBox, JMenuBar, ícones, atalhos e máscaras de data.


## 🎯 Objetivo

Desenvolver um sistema de gerenciamento interno para a empresa Perfumes Gambá, permitindo o controle eficiente dos clientes, perfumes e pedidos, com foco em organização dos dados e geração de relatórios automatizados.


## 🗂️ Estrutura do Projeto

```plaintext
/src
  /conexao    → Código para conexão com banco de dados (MySQL).
  /dao        → Classes de acesso a dados (clientes, perfumes, pedidos).
  /entidade   → Classes modelo (Cliente, Perfume, Pedido).
  /principal  → Classe principal que inicia o sistema.
  /tela       → Interfaces gráficas (JFrames) de clientes, perfumes e pedidos.

/lib
  → Bibliotecas necessárias (.jar) como itextpdf e mysql-connector-java.
```


## 🚀 Como Executar

1. Instale o **Java JDK 8 ou superior** (recomendado JDK 17).
2. Instale o **MySQL Server** e crie um banco chamado `loja_perfume`.
3. Importe o arquivo `loja_perfume.sql` para criar as tabelas.
4. Adicione os `.jar` de `lib/` ao classpath do projeto.
5. Atualize `Conexao.java` com o seu usuário e senha do banco, se necessário.
6. Compile e execute `principal.Principal`.


## 📋 Requisitos

- Java JDK 8 ou superior
- MySQL Server
- Apache NetBeans 13 ou Visual Studio Code
- Bibliotecas externas: `itextpdf-5.5.13.3.jar`, `mysql-connector-java.jar`


## ✍️ Autor

Eduardo Barbosa dos Santos  
Instituto Federal do Triângulo Mineiro - Campus Uberaba Parque Tecnológico


## 📄 Licença

Projeto acadêmico, livre para uso educacional.
