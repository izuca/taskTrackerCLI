import java.time.LocalDateTime;

public class Task{
    private static int taskNumber = 0;
    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String description){
        this.description = description;
        this.status = "novo";
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
        this.id = taskNumber;
        taskNumber++;
    }

    //Getters e Setters

    public int getTaskNumber(){
        return taskNumber;
    }

    public int getId(){
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }

    public String getStatus(){
        return this.status;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return this.updatedAt;
    }


    public void setDescription(String description){
        this.description = description;
        this.setUpdatedAt();
    }

    public void getStatus(String status){
        this.status = status;
        this.setUpdatedAt();
    }

    public void setUpdatedAt(){
        this.updatedAt = LocalDateTime.now();
    }

    

}