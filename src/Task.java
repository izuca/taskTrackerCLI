import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Task{
    private static int taskNumber = 0;
    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void Task(String description){
        this.description = description;
        this.status = "new";
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
        this.id = taskNumber;
        taskNumber++;
    }

    
}