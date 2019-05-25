import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        String listTime[] = s.split(":");
        String hour = listTime[0];
        String minute = listTime[1];
        String second = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        String result = "";
        int h = Integer.parseInt(hour);
        if (caser.equals("AM")) {
            if (h <= 12) {
                // hour = "00";
                result += hour + ":" + minute + ":" + second;
                System.out.println(hour + ":" + minute + ":" + second);
                System.out.println(result);
            }
        }
        else if (caser.equals("PM"))
        {
            if (h <= 12) {
                // int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            result = hour + ":" + minute + ":" + second;
            System.out.println(result);
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
