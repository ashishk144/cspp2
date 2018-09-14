class ShoppingCart {
    Item[] items;
    int itemsize = 0;
    Item[] cart;
    int cartsize = 0;
    double percent, disc, tax;
    ShoppingCart() {
        items = new Item[20];
        cart = new Item[20];
    }
    public void addToCatalog(Item item) {
        items[itemsize++] = item;
    }
    public void showCatalog() {
        for (int i = 0; i < itemsize; i++) {
            System.out.println(items[i].toString());
        }
    }
    public void addToCart(Item item) {
        int flag = 0;
        // System.out.println("Entered add");
        if (itemsize > 0) {
            for (int i = 0; i < itemsize; i++) {
                if(items[i].name().equals(item.name())) { 
                    if (cartsize > 0) {
                        for (int j = 0; j < cartsize; j++) {
                            if(cart[j].name().equals(item.name())) {
                                flag = 1;
                                if(items[i].quantity() >= item.quantity()) {
                                    cart[j].quantityinc(item.quantity());
                                    items[i].quantitydec(item.quantity());
                                    // System.out.println("added in 1st");
                                }
                            }
                        }
                    }
                }
            }
            if (flag == 0) {
                for (int i = 0; i < itemsize; i++) {
                    if(items[i].name().equals(item.name())) {
                        if(items[i].quantity() >= item.quantity()) {
                            items[i].quantitydec(item.quantity());
                            cart[cartsize++] = item;
                            // System.out.println("added in 2nd");

                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < itemsize; i++) {
                if(items[i].name().equals(item.name())) {
                    if(items[i].quantity() >= item.quantity()) {
                        items[i].quantitydec(item.quantity());
                            cart[cartsize++] = item;
                            // System.out.println("added in 3rd");
                    }
                }
            }
        }
    }
    public double getPrice(String name, int quantity) {
        for (int i = 0; i < itemsize; i++) {
            if(items[i].name().equals(name)) {
                return (items[i].price())*quantity;
            }
        }
        return 0;   
    }
    public void showCart() {
        for (int i = 0; i < cartsize; i++) {
            System.out.println(cart[i].toStrings());
        }
    }
    public void removeFromCart (Item item) {
        int position = 0, flag = 0;
        for (int i = 0; i < cartsize; i++) {
            if (cart[i].name().equals(item.name())) {
                if (cart[i].quantity() == item.quantity()) {
                    position = i;
                    flag = 1;
                    break;
                } else if (cart[i].quantity() > item.quantity()) {
                    cart[i].quantitydec(item.quantity());
                    break;
                }
            }
        }
        if (flag == 1) {
            for (int j = position; j < cartsize; j++) {
                cart[j] = cart[j + 1];
            }
            cartsize--;
        }
    }
    public double getTotalAmount() {
        double total = 0;
        for (int i = 0; i < cartsize; i++) {
            total += getPrice(cart[i].name(), cart[i].quantity());
        }
        return total;
    }
    public double applyCoupon(String coupon) {
        String[] coupons = {"IND10","IND20","IND30","IND40"};
        for (String coup: coupons) {
            if (coup.equals(coupon)) {
                String[] couponcode = coupon.split("D");
                double percent = Integer.parseInt(couponcode[1])/100;
                return percent;
            }
        }
        System.out.println("Invalid Coupon");
        return 0;
    }
    public double getPayableAmount() {
        double total = getTotalAmount();
        disc = percent*total;
        tax = total * 0.15;
        total = total + tax - disc;
        return total;
    }
    public double getPrice(String name) {
        for (int i = 0; i < itemsize; i++) {
            if(items[i].name().equals(name)) {
                return (items[i].price());
            }
        }
        return 0;
    }
    public void printInvoice() {
        System.out.println("Name   quantity   Price");
        for (int i = 0; i < cartsize; i++) {
            System.out.println(cart[i].toStrings()+" "+getPrice(cart[i].name()));
        }
        System.out.println("Total:"+getTotalAmount());
        System.out.println("Disc%:"+disc);
        System.out.println("Tax:"+tax);
        System.out.println("Payable Amount: "+getPayableAmount());
    }
}