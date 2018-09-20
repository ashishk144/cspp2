class Weight {
    private double weight;
    private double fatpercent;
    private String date;
    public Weight(double weight, double fat, String date) {
        this.weight = weight;
        this.fatpercent = fat;
        this.date = date;
    }
    public String toString() {
        String s = "";
        s += "WEIGHT ATTRIBUTES\n" + "Weight: " + this.weight + "KGS\n";
        s += "Fat: " + this.fatpercent + "%\n";
        s += "Date: " + this.date + "\n";
        return s;
    }
}