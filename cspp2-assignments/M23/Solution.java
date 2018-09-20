import java.io.*;
import java.util.*;
class Frequency {
    Frequency() {

    }
    public Hashtable<String,Integer> loadWordstodict (String filename)
    throws Exception {
        FileInputStream fileinp = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(fileinp));
        String str;
        Hashtable<String,Integer> dictionary = new Hashtable<String,Integer>();
        try {
            int c = 0;
            while ((str = reader.readLine()) != null) {
                // String s = str.replaceAll("[;:.,\"\\[\\]/!@#$%^&*()]","");
                String s = str.replaceAll("[^a-z A-Z 0-9 _]","").toLowerCase();
                String[] line = s.split(" ");
                for (int i = 0; i < line.length; i++) {
                    if (dictionary.containsKey(line[i])) {
                        dictionary.put(line[i], dictionary.get(line[i]) + 1);
                    } else {
                        dictionary.put(line[i], 1);
                    }
                c++;
                }
            }
            System.out.println(c);
        } catch (Exception e) {
            throw new Exception("File not found");
        }
        return dictionary;
    }
}

class Distance {
    Distance() {

    }
    public double Euclidean(Hashtable<String,Integer> dict1) {
        long sum = 0;
        for(Map.Entry<String, Integer> m: dict1.entrySet()) {
            // int val = (int)m.getValue();
            sum += m.getValue()*m.getValue();
        }
        double prod = Math.sqrt(sum);
        return prod;
    }
    public double DotProduct(Hashtable<String,Integer> dict1,
        Hashtable<String,Integer> dict2) {
        String key;
        int sum = 0;
        for (Map.Entry<String, Integer> m: dict1.entrySet()) {
            key = m.getKey();
            if (dict2.containsKey(key)) {
                int val1 = dict1.get(key);
                int val2 = dict2.get(key);
                sum += (val1*val2);
            }
        }
        return sum;
    }
    public double similarity(Hashtable<String,Integer> dictionary1,
        Hashtable<String,Integer> dictionary2) {
        double a = Euclidean(dictionary1);
        double b = Euclidean(dictionary2);
        double num = a*b;
        double deno = DotProduct(dictionary1, dictionary2);
        double result = deno/num;
        return result * 100;
    }
}

class Solution {
    Solution () {

    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String filename1 = scan.nextLine();
        String filename2 = scan.nextLine();
        Frequency f = new Frequency();
        Distance d = new Distance();
        System.out.format("%.2f", d.similarity(f.loadWordstodict(filename1), f.loadWordstodict(filename2)));
        System.out.print("%");
        // f.loadWordstodict(filename1);
        // f.loadWordstodict(filename2);
    }
}