import java.util.*;
class SortedSet extends Set {
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++ )
                if(set[i] > set[j]) {
                    int temp = set[j];
                    set[j] = set[i];
                    set[j] = temp;
                }
        }
    }
    public int getIndex(int element) {
        sort();
        if (size > 0) {
            for (int i = 0; i < size() - 1; i++) {
                if (set[i] > element) {
                    return i;
                }
            }
        }
        return -1;
    }
    public Set subSet(int fromElement, int toElement) throws Exception {
        if (fromElement > toElement) {
            throw new Exception("Invalid Arguments to Subset Exception");
        } else {
            sort();
            int fromindex = getIndex(fromElement);
            int toindex = getIndex(toElement);
            Set subset = new Set();
            int k = 0;
            for (int i = fromindex; i < toindex; i++) {
                    subset.add(this.get(i));
            }
            return subset;
        }
    }
    public Set headSet(final int toele) throws Exception {
        sort();
        return subSet(getIndex(0), toele);
    }
    public void addAll(int[] newarray) {
        add(newarray);
        sort();
    }
    public int last(){
    if (size() == 0) {
        System.out.println("Set Empty Exception");
        return -1;
    }
    return set[size() - 1];
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