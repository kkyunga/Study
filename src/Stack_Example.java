import java.io.*;
import java.util.ArrayList;

public class Stack_Example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] c = br.readLine().split(" ");
            if (c[0].equals("push")) {
                arr.add(Integer.valueOf(c[1]));
            }
            else if (c[0].equals("pop")) {
                if (arr.size() == 0) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(arr.remove(arr.size()-1)+"\n");
                }
            }
            else if (c[0].equals("size")) {
                bw.write(arr.size()+"\n");
            }
            else if (c[0].equals("empty")) {
                if (arr.size() == 0) {
                    bw.write(1+"\n");
                }
                else {
                    bw.write(0+"\n");
                }
            }
            else if (c[0].equals("top")) {
                if (arr.size() == 0) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(arr.get(arr.size() - 1)+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}