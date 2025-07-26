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
        this.status = "new";
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
        this.id = taskNumber;
        taskNumber++;
    }

    

}