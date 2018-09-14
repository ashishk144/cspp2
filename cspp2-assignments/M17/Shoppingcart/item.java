class Item {
    String productName;
    int quantity;
    double unitPrice;
    public Item(String name, int quant) {
        this.productName = name;
        this.quantity = quant;
        // this.unitPrice = 0;
    }
    public Item(String prodname, int quan, double price) {
        this.productName = prodname;
        this.quantity = quan;
        this.unitPrice = price;
    }
    public String toString() {
        return this.productName + " " + this.quantity + " " + this.unitPrice;
    }
    public String name() {
        return this.productName;
    }
    public int quantity() {
        return this.quantity;
    }
    public double price() {
        return this.unitPrice;
    }
    public void quantityinc(int incquan) {
        this.quantity += incquan;
    }
    public void quantitydec(int decquan) {
        this.quantity -= decquan;
    }
    public String toStrings() {
        return this.productName + " " + this.quantity;
    }
}