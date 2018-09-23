// class Test {
//     public static String lcs(String s1, String s2) {
//         String news1 = "", news2 = "";
//         // for(int i = 0; i < s1.length(); i++) {
//         //     for(int j = 0; j < s1.length(); j++) {
//         //         // System.out.println(s1.length() + i-j + " " + s1.length());
//         //      if (s1.length() + i-j < s1.length()) {
//         //          news1 = s1.substring(i, s1.length() -i - j);
//         //      } else {
//         //       break;
//         //      }
//         //         for(int k = 0; k < s2.length(); k++) {
//         //             for(int l = 0; l < s2.length(); l++) {
//         //                 // System.out.println(s2.length() + k-l + " " + s2.length());
//         //              if (s2.length() -k - l < s2.length()) {
//         //                  news2 = s2.substring(k, s2.length() -k - l);
//         //                 } else {
//         //                  break;
//         //                 }
//         //                 System.out.println(news1 + " " + news2);
//         //                 if(news1.equals(news2)) {
//         //                     return news1;
//         //                 }
//         //             }
//         //         }
//         //     }
//         // }s
//         // return "";
//         // for (int i = s1.length(); i >= 0; i--) {
//         //     for (int j = 0; j < i; j++) {
//         //         if(j < i-j) {
//         //             news1 = s1.substring(j, i-j);
//         //         }
//         //         for (int k = s2.length(); k >= 0; k--) {
//         //             for (int l = 0; l < k; l++) {
//         //                 // System.out.println(l + " " + k);
//         //                 if (l < k-l) {
//         //                     news2 = s2.substring(l, k-l);
//         //                 }
//         //                 if (news1.equals(news2)) {
//         //                     return news1;
//         //                 }
//         //             }
//         //         }
//         //     }
//         // }
//         // return "";
//         // for (int i = 0; i < s1.length(); i++) {
//         //     for (int j = 0; j < s2.length(); j++) {
//         //         news1 = s1.substring(j, i+j);
//         //         System.out.println(s);
//         //     }
//         //     c++;
//         // }
//         // int c = 0;
//         // // // for (int i = s1.length(); i >= 0; i--) {
 
//         // // //     news1 = s1.substring(j, i-j);
//         // for (int i = s1.length(); i >= 0; i--) {
//         //     for(int j = 0; j < s1.length(); j++) {
//         //         for (int k = 0; k < s1.length(); k++) {
//         //             if(j+k < i+k && i+k <= s1.length()) {
//         //                 news1 = s1.substring(j+k, i+k);
//         //                 // System.out.println(news1);
//         //             }
//         //             for (int l = s1.length(); l >= 0; l--) {
//         //                 for(int m = 0; m < s1.length(); m++) {
//         //                     for (int n = 0; n < s1.length(); n++) {
//         //                         if(m+n < l+n && l+n <= s2.length()) {
//         //                             news2 = s2.substring(m+n, l+n);
//         //                         }
//         //                     }
//         //                     System.out.println(news1 + "+" + news2);
//         //                     if (news1.equals(news2)) {
//         //                         return news1;
//         //                     }
//         //                 }
//         //             }
//         //         }
//         //     }
//         // }
//         // return "";
//         }
//         public static void main(String[] args) {
//             System.out.println(lcs("what is your name", "my name is xyz"));
//         }
//     }

// class test{
//     double static price = 0;
//     public static void main(String[] args) {
//         new Test().changeValue();
//         System.out.println(price);
//     }
//     public void changeValue() {
//         price = 30;
//     }
// }
// class Base {
//     private void show() {
//         System.out.println("s");
//     }
// }
// class Derived extends Base {
//     public void show2() {
//         System.out.println("s");
//     }
// }
// class test {
//     public static void main(String[] args) {
//         Derived d = new Derived();
//         d.show();
//         d.show2();
//     }
// }
// public class A1 {
//     public String message;
//     public A1(String message) {
//         this.message = message;
//     }
//     public String getMessage() {
//         return this.message;
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         A1 a1 = new A1("Hi...");
//         A1 a2 = new A1("Hi... how are you");
//         System.out.println(a1.getMessage());
//         System.out.println(a2.getMessage());
//     }
// }
// class B1 {
//     private String message;
//     public B1(String message) {
//         this.message = message;
//     }
//     public String getMessage() {
//         return this.message;
//     }
//     public void setMessage(String message) {
//         this.message = message;
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         B1 b1 = new B1("Hello World");
//         System.out.println(b1.getMessage());
//         b1.setMessage("New");
//         System.out.println(b1.getMessage());
//     }
// }
// class test {
//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 3};
//         int arr2[] = {1, 2, 3};
//         if(arr1.equals(arr2)) {
//             System.out.println("S");
//         }
//         else {
//             System.out.println("NS");
//         }
//     }
// }


// class Parent {
//     public int x = 10;
//     protected int y =20;
//     int z = 30;
//     public void print() {
//         System.out.println(x);
//     }
// }

// class Child extends Parent {
//     Child() {
//         x += 10;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }

// public class test {
//     public static void main(String[] args) {
//         Child c = new Child();
//     }
// }

// interface A {
//     void method1();
// }

// class Two implements A {
//     public int method1() {
//         int x = 10;
//         return x;
//     }
//     public static void main(String[] args) {
//         Two t = new Two();
//         int x = t.method1();
//         x +=12;
//         System.out.println(x);
//     }
// }
// 
class test {
    public static String lcs(String s1, String s2) {
        String news1 = "", news2 = "";
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j <= s2.length(); j++) {
                news1 = s2.substring(i, j);
                System.out.println(news1);
                if(s1.contains(news1)) {
                    if (news1.length() > news2.length()) {
                        news2 = news1.replaceAll(" ","");
                    }
                }
            }
        }
        return news2;
    }
    public static void main(String[] args) {
        System.out.println(lcs("my name is slim shady", "what is your name"));
    }
}