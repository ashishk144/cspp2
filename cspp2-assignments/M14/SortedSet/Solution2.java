import java.util.*;
class SortedSet extends Set{
    SortedSet() {
        super();
    }
    public void sort() {
        for (int i = 0; i < size(); i++) {
            for (int j = i + 1; j < size(); j++) {
                if (set[i] > set[j]) {
                    int temp = set[j];
                    set[j] = set[i];
                    set[i] = temp;
                }
            }
        }
    }
    public Set subSet(int fromElement, int toElement) throws Exception {
        if (fromElement > toElement) {
            throw new Exception("Invalid Arguments to Subset Exception");
        } else {
            sort();
            int i; int j;
            for (i = 0; i < size(); i++) {
                if(set[i] > fromElement) {
                    break;
                } 
            }
            for (j = size() - 1; j > i; j++) {
                if(set[j] < toElement) {
                    break;
                }
            }
            for (int k = i; k < j; k++) {
                sortedset.add(set[k]);
            }
            return sortedset;
        }
    }
    public int last() throws Exception{
        if (size() == 0) {
            throw new Exception("Set Empty Exception");
        }
        return set[size() - 1];
    }
    public Set headSet(int toElement) {
        int j;
        for (j = size() - 1; j >= 0; j++) {
                if(set[j] < toElement) {
                    break;
                }
            }
        for (int k = 0; k < j; k++) {
            sortedset.add(set[k]);
        }
        return sortedset;
    }
    public void addAll(int[] newarray) {
        for (int i: newarray) { 
            add(i);
        }
    }
}


class Solution {
    Solution() {

    }
    public static void main(String[] args) throws Exception{
        SortedSet s = new SortedSet();
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "print":
                System.out.println(s);
                break;
            case "add":
                s.add(Integer.parseInt(tokens[1]));
                break;
            case "addAll":
                String[] arg = tokens[1].split(",");
                int[] arr = new int[arg.length];
                for (int i = 0; i < arg.length; i++) {
                    arr[i] = Integer.parseInt(arg[i]);
                }
                s.addAll(arr);
                break;
            case "subSet":
                String[] ar = tokens[1].split(",");
                int[] a = new int[ar.length];
                for (int i = 0; i < ar.length; i++) {
                    a[i] = Integer.parseInt(ar[i]);
                }
                try {
                Set set = s.subSet(a[0], a[1]);
                if (set != null) {
                    System.out.println(s.toString());
                }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "headSet":
                System.out.println(s.headSet(Integer.parseInt(tokens[1])).toString());
                break;
            case "last":
            try {
                System.out.println(s.last());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            default:
                break;
            }
        }
    }
}