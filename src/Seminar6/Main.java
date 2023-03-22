package Seminar6;

public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().salary(25000).setName("Olga").cabinet((byte)12).build();
        System.out.println(worker.toString());
    }
}
