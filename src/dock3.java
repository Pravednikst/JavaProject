public class dock3 {
    public static void main(String[] args) {
     int x = 234543454;
     int b = x % 100;
     int e = b / 10;
     int c = x % 10;
     int d = e + c;
     if (x > 9)
         System.out.println(d);
     else System.out.println("число не двухзначное");
    }
}
