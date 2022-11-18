package home_work4.task;

public class SimpleKanbanTask {
    private String name;
    private String description;
    private String status;
    private int estimation;
    private String owner;

    private final String[] arrayOfStatuses = {"ToDo","InProgress","Done"};

    public SimpleKanbanTask(String name,String description) {
        this.name = name;
        this.description = description;
        this.status = arrayOfStatuses[0];
        this.estimation = 0;
        this.owner = "Unassigned";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getEstimation() {
        return estimation;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setEstimation(int estimation) {
        if (this.status.equals(arrayOfStatuses[0])) {
            this.estimation = estimation;
            System.out.println("Estimation is set");
        }
        else {
            System.out.println("Not possible to set estimation");
        }
    }
    public void move() {
        if (this.status.equals(arrayOfStatuses[arrayOfStatuses.length-1])) {
            System.out.println("Not possible to move task");
        } else if (this.status.equals(arrayOfStatuses[arrayOfStatuses.length-2])) {
            this.status = arrayOfStatuses[arrayOfStatuses.length-1];
            System.out.println("Moved to Done");
        }
        else {
            if (this.estimation > 0) {
                this.status = arrayOfStatuses[arrayOfStatuses.length-2];
                System.out.println("Moved to InProgress");
            }
            else {
                System.out.println("Estimation should be greater than 0 to move task");
            }

        }


    }

}
