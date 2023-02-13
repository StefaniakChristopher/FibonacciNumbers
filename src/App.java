public class App {
    public static void main(String[] args) throws Exception {
        int inputValue = Integer.parseInt(args[0]);
        System.out.println(F(inputValue));
    }

    public static int F(int n){
        if (n == 1) {
            return 1;
        }
        else if (n == 0) {
            return 0;
        }
        int answer = F(n - 1) + F(n - 2);
        return answer;
    }
}
