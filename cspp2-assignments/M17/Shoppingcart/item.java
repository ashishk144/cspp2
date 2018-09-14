class Item {
    String productName;
    int quantity;
    double unitPrice;
    public Item(String prodname, int quan, double price) {
        this.productName = prodname;
        this.quantity = quan;
        this.unitPrice = price;
    }
    public Item(String name, int quant) {
        this.productName = name;
        this.quantity = quant;
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
    public int quantityinc(int incquan) {
        return this.quantity+incquan;
    }
    public int quantitydec(int incquan) {
        return this.quantity-incquan;
    }
    public String toStrings() {
        return this.productName + " " + this.quantity;
    }
}