import java.util.Arrays;

public class BookYourShow {
    int size = 0;
    Show[] shows = new Show[10];
    String[][] bookings = new String[10][3];
    int bookSize = 0;
    public void addAShow(Show newshow) {
        shows[size++] = newshow;
    }

    public Show getAShow(String movie, String time) {
        for(int i = 0; i < size; i++) {
            if(shows[i].name().equals(movie) && shows[i].time().equals(time)) {
                return shows[i];
            }
        }
        return null;
    }
    public void bookAShow(String mov, String time, Patron user,
        String[] seats) {
        if (bookavailableSeat(mov, time, seats)) {
            bookings[bookSize][0] = user.mobile();
            bookings[bookSize][1] = mov;
            bookings[bookSize][2] = time;
            bookSize++;
        } else {
            System.out.println("No show");
        }
    }
    public void printTicket(String mov, String time, String mob) {
        for (int i = 0; i < bookSize; i++) {
            if (bookings[i][0].equals(mob) && bookings[i][1].equals(
                mov) && bookings[i][2].equals(time)) {
                System.out.println(mob + " " + mov + " " + time);
                return;
            }
        }
        System.out.println("Invalid");
    }
    public void showAll() {
        // System.out.println("Show array");
        for (int i = 0; i < size; i++) {
            System.out.println(shows[i].name() + " " + shows[i].time() + " " + Arrays.toString(shows[i].seats()).replace(" ",""));
        }
        // System.out.println("Bookings");
        // for (int i = 0; i < bookSize; i++) {
        //     System.out.println(bookings[i][0] + " " + bookings[i][1] + " " + bookings[i][2]);
        // }
    }
    private boolean bookavailableSeat(String mov, String time, String[] seats) {
        for(int i = 0; i < size; i++) {
            if(shows[i].name().equals(mov) && shows[i].time().equals(time)) {
                String[] reqSeats = shows[i].seats();
                for (int j = 0; j < reqSeats.length; j++) {
                    for (int k = 0; k < seats.length; k++) {
                        if(reqSeats[j].equals(seats[k])) {
                            reqSeats[k] = "N/A";
                            return true;
                        }
                    }
                }
            }
        }
    return false;
    }
}