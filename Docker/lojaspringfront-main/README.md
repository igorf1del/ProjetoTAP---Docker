# Frontend da loja

Frontend feito com React para a loja

## Arquivos de configuração

* Dockerfile
* docker-compose.yml

## Configurando a aplicação

Altere o valor da URL na linha 7 do arquivo `Dockerfile` para apontar para o host onde o backend está rodando (use o IP real do seu computador ao invés de localhost)

## Construindo a imagem

```
docker build . -t lojaspringfront
```

## Executando a aplicação

```
docker-compose up
```
