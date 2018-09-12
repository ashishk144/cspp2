class Show {
    String movieName, showDnt;
    String[] seatNo;
    public Show(String movie, String dAndt, String[] seat ) {
        this.movieName = movie;
        this.showDnt = dAndt;
        this.seatNo = seat;
    }
    public String name() {
        return this.movieName;
    }
    public String[] seats() {
        return this.seatNo;
    }
    public String time() {
        return this.showDnt;
    }
    public boolean equals(Show other) {
        if(this.movieName.equals(other.name()) && this.showDnt.equals(
            other.time())) {
            return true;
        }
        return false;
    }
    public String toString() {
        return this.movieName + "," + this.showDnt;
    }
}