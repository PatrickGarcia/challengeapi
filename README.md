# Como executar o projeto:

- Pré-requisitos: Java 8

```bash
#Clonar o projeto:
git clone https://github.com/PatrickGarcia/challengeapi.git

#Acessar o diretório 'target/universal'
cd challengeapi/target/universal

#Extrair arquivos do zip challenge-1.0.zip
unzip challenge-1.0.zip

#Aessar o diretório /bin
cd challengeapi-1.0/bin/

#Executar o projeto
./challengeapi
```
A aplicação estará rodando no seguinte endereço: http://localhost:9000/

## Para consumir a API:

- **Endpoint:** http://localhost:9000/passwords

- **Método HTTP:** POST

- **Content type:** application/json

- **Body:**
```json
{
    "password":"AbTp9!fok"
}
```

# Detalhes sobre a sua solução

A solução para o case se baseou em resolver a problemática de forma simples, estruturando a aplicação de forma a tentar manter os princípios básicos de uma aplicação que atenda o que foi pedido, mas que não se limite a isso e permita a evolução e também o incremento de novas funcionalidades. Desta forma, o desenvolvimento se dividiu em
- Definir a regra de negócio
- Estruturar a arquitetura da aplicação
- Escolha do framework para implementação

## Regra de negócio
Dado o problema, a ideia de resolver a validação da senha se baseou na utilização de expressões regulares (Regex), pois atende exatamente ao objetivo proposto.

## Arquitetura

A ideia inicial era aplicar alguns conceitos de Clean architecture a fim de isolar cada camada com sua respectiva responsabilidade. Porém, dado o tamanho do problema, optou-se por implementar algo mais simplificado, mas que não deixe de ser potencialmente incrementado.
Desta forma, o modelo de arquitetura desenvolvido baseou-se no seguinte:

![image](https://user-images.githubusercontent.com/7719021/212222939-b9cfa0eb-d700-4039-b2b2-06ce36e71933.png)

Onde as camadas são definidas a seguir:
- **Domain:** regra de negócio
- **UseCases:** casos de uso da aplicação
- **Controller:** camada do framework web/interface com o usuário


## Escolha do framework para implementação

A escolha do framework para implementação foi baseada no conhecimento prévio, onde existe nível maior de familiaridade com o Play Framework v2.8.1. No princípio, a escolha era o desenvolvimento a partir da stack do Spring em função de se ter um volume maior de documentação, tutoriais e ferramentas que oferecem integração. Porém, dado o tempo restante para implementação e a curva de aprendizagem que ainda seria necessária, optou-se pelo Play a fim de tentar otimizar o tempo demandado com o desenvolvimento.

# Disponibilização da aplicação

A fim de deixar o acesso público para a aplicação, foi efetuado o deploy da mesma em uma instância AWS, utilizando a plataforma cloud de provisionamento de imagens Cloud Captain. Para acessar a aplicação, use o endereço:
http://challengeapi-patrickgarcia.boxfuse.io:9000/
