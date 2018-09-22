import java.util.Arrays;
class Todolist {
    Task[] tasks;
    int size = 0;
    Todolist() {
        tasks = new Task[10];
        size  = 0;
    }
    public void addTask(Task t) {
        if (size == tasks.length) {
            resize();
        }
        tasks[size++] = t;
    }
    private void resize() {
        tasks = Arrays.copyOf(tasks, (tasks.length * 2));
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += tasks[i].toString() + "\n";
        }
        return str;
    }
    public Task getNextTask(String name) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getName().equals(name) && tasks[i].getStatus().equals("todo")) {
                if (tasks[i].getImportance() && (!(tasks[i].getUrge()))) {
                    return tasks[i];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (tasks[i].getName().equals(name) && tasks[i].getStatus().equals("todo")){
                if (tasks[i].getImportance() && tasks[i].getUrge()) {
                    return tasks[i];
                }
            }
        }
        return null;
    }
    public Task[] getNextTask(String name, int number) {
        Task[] newtasks = new Task[number];
        int newsize = 0;
        for(int i = 0; i < size; i++) {
            if (tasks[i].getName().equals(name) && tasks[i].getStatus().equals("todo")) {
                if(newsize < number) {
                    newtasks[newsize++] = tasks[i];
                }
            }
        }
        return newtasks;
    }
    public int totalTime4Completion() {
        int totaltime = 0;
        for(int i = 0; i < size; i++) {
            if (tasks[i].getStatus().equals("todo")) {
                totaltime += tasks[i].getTime();
            }
        }
        return totaltime;
    }
}
