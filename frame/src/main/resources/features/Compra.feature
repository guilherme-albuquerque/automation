#language: pt
#encoding: utf-8

@login @regressivo
Funcionalidade: Acessar o site


 @web
  Cenario: Realizar Compra no site
    Dado que eu acesso o site
    E clico no produto desejado
    E clico em checkout
    E verifico se e o produto
    E clico em checkout Sumario
    Quando preencher o email
    E clico em criar conta
    E preencho o formulario
    E clico em prosseguir
    E aceito os termos
    Então seleciono o tipo de pagamento e finalizo a compra
