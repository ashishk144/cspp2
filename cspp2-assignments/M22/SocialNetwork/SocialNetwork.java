import java.util.*;
class SocialNetwork {
    static Hashtable<String, ArrayList<String>> network = new Hashtable<String, ArrayList<String>>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] input = line.replace(".","").split(" is connected to ");
            String[] friend = input[1].split(", ");
            ArrayList<String> friends = new ArrayList<String>(Arrays.asList(friend));
            network.put(input[0], friends);
        }
        addUser("Kelly", new ArrayList<String>(Arrays.asList("London", "Tokyo", "New York")));
        addConnection("Kelly", "Dubai");
        getConnections("Kelly");
        getallConnections();
        getCommon("John", "Freda"); 
    }
    public static void getConnections(String name) {
        String key;
        for(Map.Entry<String, ArrayList<String>> m: network.entrySet()){
            key = m.getKey();
            if(key.equals(name)) {
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
    public static void addUser(String name, ArrayList<String> connections) {
        if (network.containsKey(name)) {
            return;
        } else {
            network.put(name, connections);
        }
    }
    public static void addConnection(String user, String friend) {
        if (network.containsKey(user)) {
            network.get(user).add(friend);

        } else {
            System.out.println("User not in network");
        }
    }
    public static void getallConnections() {
        for(Map.Entry<String, ArrayList<String>> m: network.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public static void getCommon(String user1, String user2) {
        if (network.containsKey(user1)) {
            if(network.containsKey(user2)) {
                ArrayList<String> user1con = network.get(user1);
                ArrayList<String> user2con = network.get(user2);
                ArrayList<String> common = new ArrayList<String>();
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
            System.out.println("Either one of the user not found");
        }
    }
}
