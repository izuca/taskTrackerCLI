import java.util.ArrayList;
import java.util.Scanner;

public class Cli {
    private ArrayList<Task> taskList;

    public void run(){
        boolean endCli = false;

        while (!endCli) {
            Scanner scanner = new Scanner(System.in);
            String linha = scanner.nextLine();
            String[] comandos = linha.split(" ");

            if(comandos.length > 0){
                switch (comandos[0]) {
                    case "info":
                        System.out.println("Bem vindo ao taskTracker!");
                        System.out.println("Use 'taskTracker new <tarefa>' para adicionar uma nova task");
                        System.out.println("Use 'taskTracker exit' para desligar");
                        break;
                    case "list":
                        this.listTask();
                        break;
                    case "new":
                        this.addTask(comandos[1]);
                        break;
                    case "exit":
                        endCli = true;
                        break;
                    default:
                        System.out.println("Comando não reconhecido!");
                }
            }
        }
    }

    public void addTask(String description){
        if(description == null){
          System.out.println("insira tasktracker new <tarefa>");
        }
        if(taskList == null)
            taskList = new ArrayList<>();
        Task task = new Task(description);
        taskList.add(task);
        System.out.println("Task adicionada! (ID: " + task.getId() + ")");
    }



    public void listTask(){
        if(taskList == null){
            System.out.println("Lista de tasks vazia");
        } else {
            System.out.println("--------------Lista de Tasks--------------");
            for(Task task : taskList){
                System.out.println(task.getId() + ": " + task.getDescription() + " ---> " + task.getStatus());
            }
        }

    }
}
