import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Data = new int[][]{{1, 2}, {3, 4}};
        char[] cmd = sc.next().toCharArray();
        for (int i = 0; i < cmd.length; i++)
            if (cmd[i] == 'H') {
                int[][] buffer = new int[][]{
                        {Data[1][0],Data[1][1]},
                        {Data[0][0],Data[0][1]}};
                Data=buffer;
            } else if (cmd[i] == 'V') {
                int[][] buffer = new int[][]{
                        {Data[0][1],Data[0][0]},
                        {Data[1][1],Data[1][0]}};
                Data=buffer;
            } else {
                System.out.print("Error Ctrl Char :" + cmd[i]);
            }
        for (int i = 0; i < Data.length; i++)
                System.out.print(Data[i][0]+" " + Data[i][1]+"\r\n");
        // write your code here
        //
    }
}
