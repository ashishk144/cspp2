class Patron {
    String userName, mobileNo;
    public Patron(String name, String number) {
        this.userName = name;
        this.mobileNo = number;
    }
    public String user() {
        return this.userName;
    }
    public String mobile() {
        return this.mobileNo;
    }
}