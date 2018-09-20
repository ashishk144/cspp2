class Data {
    private String foodname;
    private double quantity;
    private String time;
    public Data(String name, double quant, String time) {
        this.foodname = name;
        this.quantity = quant;
        this.time = time;
    }
    public Data(double waterq, String watertime) {
        this.foodname = "Water";
        this.quantity = waterq;
        this.time = watertime;
    }
    public String toString() {
        String s ="";
        if (this.foodname.equals("Water")) {
            s += "WATER Consumption \n" + "Quantity: " + this.quantity
            + " ml\n" + "Time: " + this.time + "\n";
        } else {
            s += "FOOD Consumption\n" + "Food: " + this.foodname+"\n"
            + "Quantity: " + this.quantity + " grams\n"
            + "Time: " + this.time + "\n";
        }
        return s;
    }
}