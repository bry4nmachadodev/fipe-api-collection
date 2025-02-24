🚗 Projeto: Consulta de Veículos via API FIPE

📌 Sobre o Projeto

O objetivo deste projeto é consumir a API da Tabela FIPE para permitir a consulta de informações detalhadas sobre veículos. Com ele, o usuário pode obter os preços médios de um carro específico com base na marca, modelo e ano.

⚙️ Funcionalidades Principais

Consumo da API FIPE: Recuperação de dados sobre veículos brasileiros, incluindo marcas, modelos e preços médios.

Interação com o Usuário: O usuário pode escolher entre carros, motos ou caminhões, e então selecionar a marca e o modelo desejado.

Listagem de Anos e Valores: Após a escolha do modelo, são exibidos todos os anos disponíveis junto com os preços médios correspondentes.

Processamento e Modelagem dos Dados: Uso de Streams e Listas para manipulação eficiente das informações retornadas pela API.

🛠 Tecnologias Utilizadas

Java

Spring Framework (Sem Web)

Jackson (para manipulação de JSON)

Streams e Collections para processamento de dados

🎯 Objetivo Final

O sistema possibilita que o usuário visualize a variação de preços médios dos veículos ao longo dos anos, auxiliando na tomada de decisão para compra ou venda de um automóvel.

📌 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/bry4nmachadodev/fipe-api-collection.git

Abra o projeto em sua IDE de preferência.

Certifique-se de ter o Java instalado corretamente.

Execute a aplicação.

📄 Estrutura do Projeto

📂 src/main/java/com/seu-projeto
 ┣ 📂 model      # Modelagem das classes da aplicação
 ┣ 📂 service    # Camada de serviços (interação com a API FIPE)
 ┣ 📂 utils      # Métodos utilitários para processamento dos dados
 ┗ 📂 main       # Ponto de entrada da aplicação

📌 Contato

Caso tenha dúvidas ou sugestões, fique à vontade para contribuir com o projeto!

📧 Email: bryanmachado1703@icloud.com 🐙 GitHub: bry4nmachadodev

