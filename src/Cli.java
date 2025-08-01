import java.util.ArrayList;
public class Cli {
    ArrayList<Task> taskList;

    public void run(String[] args){
        if(args.length > 0){
            switch (args[0]) {
                case "hello":
                    System.out.println("Hello World");
                    break;
                case "list":
                    this.listTask();
                    break;
                case "new":
                    this.addTask(args[1]);
                    break;
                default:
                    System.out.println("Comando não reconhecido!");
            }
        }else{
            System.out.println("Argumento não pode ser nulo");
        }
    }

    
    public void addTask(String description){
        if(description == null){
          System.out.println("Argumento não pode ser nulo");
        }
        if(taskList == null)
            taskList = new ArrayList<>();
        Task task = new Task(description);
        taskList.add(task);
        System.out.println("Task adicionada!");
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
