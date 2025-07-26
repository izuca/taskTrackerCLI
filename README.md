# Task Tracker

Task Tracker é um projeto utilizado para rastrear e gerenciar suas tarefas. Nesta tarefa, você irá construir uma interface de linha de comando (CLI) simples para acompanhar o que você precisa fazer, o que já fez e no que está trabalhando atualmente. Este projeto vai te ajudar a praticar suas habilidades de programação, incluindo trabalhar com o sistema de arquivos, lidar com entradas do usuário e construir uma aplicação CLI simples.

## Requisitos

A aplicação deve ser executada pelo terminal, aceitar ações e entradas do usuário como argumentos, e armazenar as tarefas em um arquivo JSON. O usuário deve ser capaz de:

- Adicionar, atualizar e excluir tarefas
- Marcar uma tarefa como "em andamento" ou "concluída"
- Listar todas as tarefas
- Listar todas as tarefas concluídas
- Listar todas as tarefas não concluídas
- Listar todas as tarefas em andamento

### Restrições para a implementação

- Você pode usar qualquer linguagem de programação para construir este projeto.
- Use argumentos posicionais na linha de comando para aceitar entradas do usuário.
- Utilize um arquivo JSON para armazenar as tarefas no diretório atual.
- O arquivo JSON deve ser criado caso não exista.
- Use o módulo nativo de sistema de arquivos da sua linguagem para interagir com o arquivo JSON.
- Não utilize bibliotecas ou frameworks externos para construir este projeto.
- Garanta o tratamento de erros e casos extremos de forma adequada.

## Exemplo

A lista de comandos e seu uso está apresentada abaixo:

```bash
# Adicionando uma nova tarefa
task-cli add "Buy groceries"
# Output: Task added successfully (ID: 1)

# Atualizando e excluindo tarefas
task-cli update 1 "Buy groceries and cook dinner"
task-cli delete 1

# Marcando uma tarefa como em andamento ou concluída
task-cli mark-in-progress 1
task-cli mark-done 1

# Listando todas as tarefas
task-cli list

# Listando tarefas por status
task-cli list done
task-cli list todo
task-cli list in-progress
```

## Propriedades da Tarefa

Cada tarefa deve possuir as seguintes propriedades:

- **id**: Um identificador único para a tarefa
- **description**: Uma breve descrição da tarefa
- **status**: O status da tarefa (`todo`, `in-progress`, `done`)
- **createdAt**: A data e hora em que a tarefa foi criada
- **updatedAt**: A data e hora em que a tarefa foi atualizada pela última vez

Certifique-se de adicionar essas propriedades ao arquivo JSON ao criar uma nova tarefa e atualizá-las ao