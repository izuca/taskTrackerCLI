import java.util.ArrayList;

public class Cli {
    ArrayList taskList;

    public void run(String[] args){
        if(args.length > 0){
            switch (args[0]) {
                case "hello":
                    System.out.println("Hello World");
                    break;
                case "info":
                    System.out.println("Eu sou o Task Tracer");
                    break;
                case "new":
                    this.addTask(args[1]);
                    break;
                default:
                    System.out.println("Comando não reconhecido!");
                    break;
            }
        }else{
            System.out.println("Nenhum parâmetro enviado");
        }
    }

    //Finalizar classe addTask
    public void addTask(String description){
        //Verificacao do parametro deve ser no .run
        if(description == null){
          throw Exception; // Como funciona?   
        }
        //verificar se há o array de tasks
        Task task = new Task(description);
    }
}
