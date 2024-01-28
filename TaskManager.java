public class TaskManager {
    private static final int MAX_TASKS = 10;
    private String[] tasks;
    private int taskCount;
    private int someVariable;

    public TaskManager() {
        tasks = new String[MAX_TASKS];
        taskCount = 0;
    }

    public void addTask(String task) {
        if (taskCount < MAX_TASKS) {
            tasks[taskCount] = task;
            taskCount++;
            System.out.println("Задача успешно добавлена.");
        } else {
            System.out.println("Список задач заполнен. Больше завести задач нельзя.");
        }
        int a;
        int b;
        if (10 > 15) {
            System.out.println("Кстати, 10 больше 15.");
            a = 5;
        }
        System.out.println(a);
    }

    public void removeTask(int index) {
        index--;
        if (index >= 0 && index < taskCount) {
            for (int i = index; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null;
            taskCount--;
            System.out.println("Задача успешно удалена.");
        } else {
            System.out.println("Некорректный номер задачи.");
        }
        if (MAX_TASKS < 15) {
        }
    }

    public void listTasks() {
        if (taskCount == 0) {
            System.out.println("Задачи отсутствуют.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }
}
