# Projeto-Loja_de_Livros

# 📚 Sistema de Gestão - Loja de Livros

Este projeto consiste em uma aplicação desktop orientada a objetos desenvolvida em Java, focada na gestão de uma loja de livros. O sistema foi construído seguindo uma arquitetura em camadas, utilizando Java Swing para a interface gráfica e serialização de objetos para a persistência de dados.

## 🎯 Requisitos do Projeto

O projeto atende aos seguintes requisitos acadêmicos e funcionais:

1.  **Tema:** Loja de Livros (T17).
2.  **Arquitetura:** Implementação em camadas (Modelo, Persistência, Negócio, Apresentação).
3.  **Persistência de Dados:** Utilização de arquivos binários via Serialização em Java (`java.io`).
4.  **Interface com o Usuário:** Gráfica, desenvolvida com Java Swing.
5.  **Nomenclatura:** Classes, métodos e variáveis nomeados em Português.

## ✨ Funcionalidades Principais

O sistema oferece as seguintes funcionalidades de gestão:

| Módulo | Funcionalidades |
| :--- | :--- |
| **Gestão de Livros** | CRUD (Cadastro, Consulta, Atualização, Exclusão) completo. |
| **Gestão de Clientes** | CRUD (Cadastro, Consulta, Atualização, Exclusão) de clientes. |
| **Gestão de Vendas** | Registro de vendas, cálculo de total e atualização automática de estoque. |
| **Faturamento** | Emissão de fatura por venda e geração automática em arquivo PDF. |
| **Controle de Estoque** | Alerta visual e funcional quando o estoque de um livro atinge o nível mínimo definido. |
| **Relatórios de Gestão** | Total de vendas por período, produto mais/menos vendido, melhor cliente e dia de maior venda. |

## 🏗️ Arquitetura em Camadas

O projeto está dividido em quatro camadas principais para garantir a separação de responsabilidades:

| Camada | Pacote | Responsabilidade |
| :--- | :--- | :--- |
| **Modelo** | `modelo` | Contém as classes de entidade do domínio (`Livro`, `Cliente`, `Venda`, `ItemVenda`). |
| **Persistência** | `persistencia` | Responsável pela leitura e escrita de dados em arquivos (Serialização). Implementa o padrão DAO. |
| **Negócio** | `negocio` | Contém as regras de negócio, validações e lógica de gestão (`ServicoLivro`, `ServicoVenda`, etc.). |
| **Apresentação** | `apresentacao` | Responsável pela interface gráfica (Java Swing) e interação com o usuário. |

## 📁 Estrutura do Projeto

```
LojaDeLivros/
├── src/
│   ├── Main.java              # Ponto de entrada da aplicação
│   ├── apresentacao/          # Camada de Interface Gráfica (Swing)
│   ├── modelo/                # Camada de Entidades
│   ├── negocio/               # Camada de Regras de Negócio e Serviços
│   └── persistencia/          # Camada de Acesso a Dados (DAO)
├── run.sh                     # Script de execução
├── README.md                  # Documentação do projeto
└── diagrama_classes.puml      # Código-fonte do Diagrama UML
```

## ⚙️ Tecnologias Utilizadas

*   **Linguagem:** Java (Recomendado JDK 11+ para `Collectors.toList()` ou JDK 8 com a correção aplicada).
*   **Interface Gráfica:** Java Swing.
*   **Persistência:** Serialização de Objetos (`java.io`).
*   **Geração de Documentos:** Geração de PDF via ferramenta de linha de comando (`manus-md-to-pdf`).

## 🚀 Como Executar o Projeto

### Pré-requisitos

*   Java Development Kit (JDK) instalado (versão 8 ou superior).

### Passos para Execução

1.  **Clone o repositório** (ou descompacte o arquivo do projeto).
2.  **Compile o código** (se não estiver usando o arquivo ZIP já compilado):
    ```bash
    # Navegue até o diretório raiz do projeto
    cd LojaDeLivros
    # Compile todos os arquivos Java
    find src -name "*.java" > sources.txt && javac -d bin -cp src @sources.txt
    ```
3.  **Execute a aplicação:**
    O projeto inclui um script `run.sh` para facilitar a execução:
    ```bash
    ./run.sh
    ```
    Alternativamente, execute diretamente o comando Java:
    ```bash
    java -cp bin Main
    ```

A aplicação iniciará na **Tela Inicial**, onde você poderá escolher entre "Iniciar Aplicação" ou "Sair".

## 📊 Diagrama de Classes UML

O diagrama de classes que ilustra a arquitetura e os relacionamentos do projeto está disponível no arquivo `diagrama_classes.puml`. Você pode visualizá-lo usando qualquer ferramenta compatível com PlantUML.

---
*Desenvolvido como projeto acadêmico da Disciplina: Programação Orientada a Objetos.*
*Ministrada pelo professor: Guilherme Cavalcanti.*
*Curso: Engenharia de Software.*
*Instituição: IFPE(Campus Belo Jardim).*
*Equipe: Marcelo Augusto de Barros Araújo e Marcel Gustavo de Barros Araújo.*
