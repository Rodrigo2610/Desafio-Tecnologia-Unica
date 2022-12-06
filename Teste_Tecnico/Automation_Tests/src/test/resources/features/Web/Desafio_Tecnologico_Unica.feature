@desafiotecnico
Feature: Desafio Tecnologico Única - automação Web

  Scenario: Acessar Portal do Magazine Luiza
    Given que eu acesse o portal do "http://www.magazineluiza.com.br"
    Then devera ser validado o titulo "Magazine Luiza | Pra você é Magalu!"

  Scenario Outline: Buscar produto
    Given eu informe um produto "<produto>" para pesquisar
    When eu clicar em buscar
    Then o "<produto>" devera ser retornado com sucesso

    Examples: 
      | produto                                                      |
      | iPhone 12 Apple 64GB (PRODUCT)RED 6,1” - Câm. Dupla 12MP iOS |

  Scenario Outline: Escolher produto
    Given eu clique no "<produto>" escolhido
    When abrir a pagina de detalhes do "<produto>"
    Then devera ser exibido os detalhes do "<produto>" escolhido

    Examples: 
      | produto                                                      |
      | iPhone 12 Apple 64GB (PRODUCT)RED 6,1” - Câm. Dupla 12MP iOS |

  Scenario Outline: Adicionar ao carrinho
    Given eu adicione o "<produto>" ao carrinho
    When abrir a pagina do carrinho
    Then devera ser exibido o "<produto>" adicionado

    Examples: 
      | produto                                                                     |
      | iPhone 12 Apple 64GB (PRODUCT)RED 6,1” - Câm. Dupla 12MP iOS - Product, Red |
