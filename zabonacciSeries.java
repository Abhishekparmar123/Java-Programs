 class Result{
    public int zabonacciNumber(int n) throws Exception {
        int n1 = 1, n2 = 2, n3, i;
        System.out.print(n1 + " " + n2);

        if(n>2){
            for (i = 2; i < n; i++){
                n3 = (( n1 % 10000) * ( n2 % 10000)) % 10000;
                n1 = n2;
                n2 = n3;

                System.out.print(" " + n3);
            }
        }
        if(n<2){
            throw new Exception("The number of term at least two.");
        }

        return n2-n1;
    }
}

public class zabonacciSeries {
    public static void main(String[] args){
        System.out.println("Args value " + args.length);
        try{
            int n = Integer.parseInt(args[0]);

            Result Result = new Result();
            int result = Result.zabonacciNumber(n);
            System.out.println("\n\nThe Result : " + result);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
