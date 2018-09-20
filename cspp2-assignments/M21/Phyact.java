class Phyact {
    private String actname;
    private String date;
    private String starttime;
    private String endtime;
    private String notes;
    public Phyact(String activity, String date, String start, String end) {
        this.actname = activity;
        this.date = date;
        this.starttime = start;
        this.endtime = end;
        this.notes ="";
    }
    public Phyact(String activity, String date, String start, String end, String note) {
        this.actname = activity;
        this.date = date;
        this.starttime = start;
        this.endtime = end;
        this.notes = note.replace(":"," ");
    }
    public String getAct() {
        return this.actname;
    }
    public String getDate() {
        return this.date;
    }
    public String getStart() {
        return this.starttime;
    }
    public String getEnd() {
        return this.endtime;
    }
    public String getNotes() {
        return this.notes;
    }
    public String toString() {
        String s = "";
        s += "PHYSICAL ACTIVITY \n";
        if (this.notes.equals("")) {
            s += "Activity: " + this.actname + "\nDate: " + this.date 
            + "\nStart Time: " + this.starttime + "\nEnd Time: "
            + this.endtime + "\n";
        } else {
            s += "Activity: " + this.actname + "\n" + "Date: " + this.date
            + "\n" + "Start Time: " + this.starttime + "\n" + "End Time: "
            + this.endtime + "\n" + "Notes: " + this.notes + "\n";
        }
        return s;
    }
}