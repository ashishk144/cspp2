import java.util.*;
class SortedSet extends Set{
    int[] array = get();
    Set sortedset = new Set();
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
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
            for (i = 0; i < array.length; i++) {
                if(array[i] > fromElement) {
                    break;
                } 
            }
            for (j = array.length - 1; j > i; j++) {
                if(array[j] < toElement) {
                    break;
                }
            }
            for (int k = i; k < j; k++) {
                sortedset.add(array[k]);
            }
            return sortedset;
        }
    }
    public int last() throws Exception{
        if (array.length == 0) {
            throw new Exception("Set Empty Exception");
        }
        return array[array.length - 1];
    }
    public Set headSet(int toElement) {
        int j;
        for (j = array.length - 1; j >= 0; j++) {
                if(array[j] < toElement) {
                    break;
                }
            }
        sortedset.clear();
        for (int k = 0; k < j; k++) {
            sortedset.add(array[k]);
        }
        return sortedset;
    }
    public void addAll(int[] newarray) {
        for (int i: newarray) {
            sortedset.add(i);
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
                Set set = s.subSet(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                if (set != null) {
                    System.out.println(s.toString());
                }
                break;
            case "headSet":
                System.out.println(s.headSet(Integer.parseInt(tokens[1])).toString());
                break;
            case "last":
                System.out.println(s.last());
            default:
                break;
            }
        }
    }
}