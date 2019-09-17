
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    static class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        List<String> res = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int m = input.nextInt();
            int n = input.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int f = input.nextInt();
                int s = input.nextInt();
                list.add(new Pair(Math.min(f,s),Math.max(f,s)));
            }

            int mid = 0;
            String s = "IMPOSSIBLE";
            for (int j = 0; j < n; j++) {
                if(list.get(j).first == 1 && list.get(j).second == m) {
                    s = "POSSIBLE";
                    break;
                } else if (list.get(j).first == 1 ) {
                    if(list.get(j).second == mid){
                        s = "POSSIBLE";
                        break;
                    } else {
                        mid = list.get(j).second;
                    }

                } else if(list.get(j).second == m) {
                    if(list.get(j).first == mid) {
                        s = "POSSIBLE";
                        break;
                    }else
                        mid = list.get(j).first;
                }
            }
            res.add(s);
        }
        for(String x : res) System.out.println(x);
    }
}
