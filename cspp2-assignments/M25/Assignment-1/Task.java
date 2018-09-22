class Task {
    private String title;
    private String name;
    private int time;
    private boolean importance;
    private boolean urgency;
    private String status;
    Task() {

    }
    Task(String task, String person, int mins, boolean imp, boolean urge, String stat) throws Exception {
        if (task.length() > 0) {
            this.title =task;
        } else {
            throw new Exception("Title not provided");
        }
        this.name = person;
        if (mins > 0) {
            this.time = mins;
        } else {
            throw new Exception("Invalid time TimeToComplete " + mins);
        }
        this.importance = imp;
        this.urgency = urge;
        if (stat.equals("todo") || stat.equals("done")) {
            this.status = stat;
        } else {
            throw new Exception("Invalid status " + stat);
        }
    }
    public String getTask() {
        return this.title;
    }
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.time;
    }
    public boolean getImportance() {
        return this.importance;
    }
    public boolean getUrge() {
        return this.urgency;
    }
    public String getStatus() {
        return this.status;
    }
    public String toString() {
        String s ="";
        s += this.title + ", " + this.name + ", " + this.time;
        if (getImportance()) {
            s += "Important" + ", ";
        } else {
            s += "Not Important" + ", ";
        }
        if (getUrge()) {
            s += "Urgent" + ", ";
        } else {
            s += "Not Urgent" + ", ";
        }
        s += this.status;
        return s;
    }
}
