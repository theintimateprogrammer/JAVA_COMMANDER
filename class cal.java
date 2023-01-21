public class cal{

     public static void main(String[] args) {

    String a = "106";
    String b = "90";

    int s = 4;

    switch (s) {

        case 1:
         int ans1 = Integer.parseInt(a)+Integer.parseInt(b);
         System.out.println("ans = "+ans1);
         break;

         case 2:
         int ans2 = Integer.parseInt(a)-Integer.parseInt(b);
         System.out.println("ans = "+ans2);
         break;

         case 3:
         int ans3 = Integer.parseInt(a)*Integer.parseInt(b);
         System.out.println("ans = "+ans3);
         break;

         case 4:
         Double ans4 = Double.parseDouble(a)/Double.parseDouble(b);
         System.out.println("ans = "+ans4);
         break;

         default:
         break;
        }
    }
}