package home_work4.task;

public class SimpleKanbanTaskMain {
    public static void main(String[] args) {
        SimpleKanbanTask taskQAsetUp = new SimpleKanbanTask("Set-up environment for testing","1.Set-up JMeter 2. Set-up Postman");

        System.out.println(taskQAsetUp.getStatus());
        System.out.println(taskQAsetUp.getName());
        System.out.println(taskQAsetUp.getDescription());
        System.out.println(taskQAsetUp.getEstimation());
        System.out.println(taskQAsetUp.getOwner());
        taskQAsetUp.move();
        taskQAsetUp.setOwner("John Doyle");
        taskQAsetUp.setName("Set-up test's environment");
        taskQAsetUp.setDescription("1.Set-up JMeter 2. Set-up Insomnia");
        System.out.println(taskQAsetUp.getStatus());
        System.out.println(taskQAsetUp.getName());
        System.out.println(taskQAsetUp.getDescription());
        System.out.println(taskQAsetUp.getEstimation());
        System.out.println(taskQAsetUp.getOwner());
        taskQAsetUp.setEstimation(3);
        taskQAsetUp.move();
        System.out.println(taskQAsetUp.getStatus());
        System.out.println(taskQAsetUp.getName());
        System.out.println(taskQAsetUp.getDescription());
        System.out.println(taskQAsetUp.getEstimation());
        System.out.println(taskQAsetUp.getOwner());
        taskQAsetUp.setEstimation(2);
        taskQAsetUp.move();
        System.out.println(taskQAsetUp.getStatus());
        System.out.println(taskQAsetUp.getName());
        System.out.println(taskQAsetUp.getDescription());
        System.out.println(taskQAsetUp.getEstimation());
        System.out.println(taskQAsetUp.getOwner());
        taskQAsetUp.setEstimation(1);
        taskQAsetUp.move();
        System.out.println(taskQAsetUp.getStatus());
        System.out.println(taskQAsetUp.getName());
        System.out.println(taskQAsetUp.getDescription());
        System.out.println(taskQAsetUp.getEstimation());
        System.out.println(taskQAsetUp.getOwner());
    }

}
