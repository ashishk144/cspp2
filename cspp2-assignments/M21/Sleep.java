class Sleep {
    private String startdnt;
    private String enddnt;
    public Sleep(String start, String end) {
        this.startdnt = start;
        this.enddnt = end;
    }
    public String toString() {
        String s = "";
        s += "SLEEP TRACK\n" + "Time of going to bed : " + this.startdnt
        + "\nTime of waking up: " + this.enddnt + "\n";
        return s;
    }
}