import java.util.*;
class User {
    String username;
    ArrayList<String> connections; 
    User (String name, ArrayList<String> connect) {
        this.username = name;
        this.connections = connect;
    }
    public String getUsername() {
        return this.username;
    }
    public ArrayList<String> getConnect() {
        return this.connections;
    }
    public String toString() {
       String s = this.username + ": " + this.connections;
       return s;
    }
}

class Social {
    private User[] users;
    private int size;
    Social() {
        users = new User[50];
        size = 0;
    }
    public int getSize() {
        return this.size;
    }
    public void addUser(User user) {
        users[size++] = user;
    }
    public ArrayList<String> getConnections(String name) {
        for (int i = 0; i < getSize(); i++) {
            if (users[i].getUsername().equals(name)) {
                return users[i].getConnect();
            }
        }
        System.out.println("Not an user");
        // return new ArrayList<String>();
        return null;
    }
    public void addConnection(String name, String friend) {
        for (int i = 0; i < getSize(); i++) {
            if (users[i].getUsername().equals(name)) {
                users[i].getConnect().add(friend);
                return;
            }
        }
        ArrayList<String> friends = new ArrayList<String>();
        friends.add(friend);
        users[size++] = new User(name, friends);
    }
    public void getCommon(String user1, String user2) {
        ArrayList<String> common = new ArrayList<String>();
        if (contains(user1)) {
            if (contains(user2)) {
                ArrayList<String> user1con = getConnections(user1);
                ArrayList<String> user2con = getConnections(user2);
                for(String friend: user1con) {
                    for(String friends: user2con) {
                        if(friend.equals(friends)) {
                            common.add(friends);
                            break;
                        }
                    }
                }
                System.out.println(common);
            }

        } else {
            System.out.println("Either one of the user not found in Network");
        }
    }
    public boolean contains(String name) {
        for(int i = 0; i < size; i++) {
            if (users[i].getUsername().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public void getallConnections() {
        int c = 0;
        if (size > 0) {
            ArrayList<String> keys = new ArrayList<String>(); 
            for (int i = 0; i < getSize(); i++) {
                keys.add(users[i].getUsername());
            }
            Collections.sort(keys);
            for(String key: keys) {
                for(int i = 0; i < getSize() - 1; i++) {
                    if (c != getSize() - 1) {
                        if (users[i].getUsername().equals(key)) {
                            System.out.print(users[i].toString() + ", ");
                            c++;
                            break;
                        }
                    } else {
                        if (users[i].getUsername().equals(key)) {
                            System.out.print(users[i].toString());
                        }
                    }
                }
            }
            System.out.println();
        } else {
            System.out.println("[]");
        }
    }
}

class Solution {
    public Solution() {

    }
    public static void main(String[] args) {
        Social obj = new Social();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] inputs = line.split(" ", 2);
            switch (inputs[0]) {
                case "Create":
                int n = Integer.parseInt(inputs[1]);
                for(int i = 0; i < n; i++) {
                    String inp = scan.nextLine();
                    String[] input = inp.replace(".","").split(" is connected to ");
                    String[] friend = input[1].split(", ");
                    ArrayList<String> friends = new ArrayList<String>(Arrays.asList(friend));
                    obj.addUser(new User(input[0], friends));
                }
                break;
                case "Network":
                    obj.getallConnections();
                    break;
                case "addConnections":
                    String[] inp = inputs[1].split(" ");
                    obj.addConnection(inp[0], inp[1]);
                    break;
                case "getConnections":
                    if (obj.getConnections(inputs[1]) != null) {
                        System.out.println(obj.getConnections(inputs[1]));
                    }
                    break;
                case "CommonConnections":
                    inp = inputs[1].split(" ");
                    obj.getCommon(inp[0], inp[1]);
                    break;
                case "size":
                    obj.getSize();
                    break;
                default:
                    break;
            }
        }

        // obj.addUser(new User("Kelly", new ArrayList<String>(
        //     Arrays.asList("London", "Tokyo", "New York"))));
        // obj.addConnection("Kelly", "Dubai");
        // System.out.println(obj.getConnections("Kelly"));
        // obj.getallConnections();
        // obj.getCommon("John", "Freda");
    }
}
