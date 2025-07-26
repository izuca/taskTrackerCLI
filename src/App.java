public class App {
    public static void main(String[] args) throws Exception {
        if(args.length > 0){
            switch (args[0]) {
                case "hello":
                    System.out.println("Hello World");
                    break;
                case "info":
                    System.out.println("Eu sou o Task Tracer");
                    break;
                default:
                    System.out.println("Comando não reconhecido!");
                    break;
            }
        }else{
            System.out.println("Nenhum parâmetro enviado");
        }
        
    }
}
