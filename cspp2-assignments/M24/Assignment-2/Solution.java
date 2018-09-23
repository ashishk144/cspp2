import java.util.Scanner;
import java.io.File;
import java.lang.Math;
class Out {
      Out() {

      }
      public String outputPrint(String foldername) throws Exception {
            File folder = new File(foldername);
            File[] allfiles = folder.listFiles();
            String s = "", s1 = "             ", s2 = "";
            Longest l = new Longest();
            Load f = new Load();
            double max = 0, sim = 0;
            String fil1 = "", fil2 = "";
            for (File fil : allfiles) {
                  s1 += fil.getName() + "    ";
            } s1 += "\n";
            if (allfiles.length > 0) {
                  for (File file1 : allfiles) {
                        s += file1.getName() + "\t\t";
                        for (File file2 : allfiles) {
                              sim = l.similarity(f.loadString(file1), f.loadString(file2));
                              s += sim + "            ";
                              if (sim > max && sim != 100) {
                                    max = sim;
                                    fil1 = file1.getName();
                                    fil2 = file2.getName();
                              }
                        }
                        s = s.trim();
                        s += "\n";
                  }
                  // System.out.println(s);
            } else {
                  System.out.println("Empty Directory");
            }
            s += "Maximum similarity is between " + fil1 + " and " + fil2;
            s2 = s1 + s;
            return s2;
      }
}

class Load {
      Load() {

      }
      public String loadString(File f) {
            Scanner scan = new Scanner(System.in);
            try {
                  scan = new Scanner(f);
            } catch (Exception e) {
            }
            String store = "";
            while (scan.hasNextLine()) {
                  String s = scan.nextLine();
                  store += s.replaceAll("[^a-z A-Z 0-9 _]", "").toLowerCase();
            }
            return store;
      }
}

class Longest {
      Longest() {

      }
      public String lcs(String s1, String s2) {
            String news1 = "", news2 = "";
            for (int i = 0; i < s2.length(); i++) {
                  for (int j = i + 1; j <= s2.length(); j++) {
                        news1 = s2.substring(i, j);
                        if (s1.contains(news1)) {
                              if (news1.length() > news2.length()) {
                                    news2 = news1;
                              }
                        }
                  }
            }
            return news2;
      }
      public int repeatCount(String str, String compare) {
            int c = 0;
            for (int i = 0; i < str.length(); i++) {
                  String str1 = "";
                  if (compare.length() + i <= str.length()) {
                        str1 = str.substring(i, compare.length() + i);
                  }
                  if (str1.equals(compare)) {
                        c++;
                  }
            }
            // System.out.println(c);
            return c;
      }
      public double similarity(String string1, String string2) {
            String longeststring = lcs(string1, string2);
            double count1 = repeatCount(string1, longeststring);
            double count2 = repeatCount(string2, longeststring);
            double fileslength = string1.length() + string2.length();
            double sim;
            if (fileslength > 0) {
                  sim = ((count1 + count2) * longeststring.length()) / fileslength;
            } else {
                  return 100;
            }
            return Math.round((sim * 100));
      }
}
class Solution {
      Solution() {

      }
      public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextLine()) {
                  String foldername = scan.nextLine();
                  Out lines = new Out();
                  System.out.println(lines.outputPrint(foldername));
            } else {
                  System.out.println("Empty Directory");
            }
      }
}
