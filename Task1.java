package String;
import java.util.Scanner;

public class Task3 {
    
   

public class JavaExample
{
    public static void main(String args[])
    {
    	
       int computer = (int) (Math.random() * 100);
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int user = -1;

        while (user != computer) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
            user = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + Guess(user, computer, count));
            count++;
        }
    }
        public static String Guess(int user,int computer,int count) {

            if (user > 100 || user < 0) {
                return "Opps! Your guess is invalid";

            } else if (user == computer) {
                return "Congratulations! " + count;

            } else if (user > computer) {
                return "Opps! Your Guess is too high try again " + count;
            } else {
                return "Opps! Your Guess is too low try again " + count;
            }
}
}
