class prime {

    public static void main(String[] args) {

        int n = 20;
        int m = 25;

        for (int i = n; i <= m; i++) {

            int count = 0;

           
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {

                System.out.println(i);

                int num = i;
                int sum = 0;

                
                while (num > 0) {
                    int digit = num % 10;
                    sum = sum + digit;
                    num = num / 10;
                }

                System.out.println("Sum: " + sum);

               
                int sumcount = 0;

                for (int t = 1; t <= sum; t++) {
                    if (sum % t == 0) {
                        sumcount++;
                    }
                }

                if (sumcount == 2) {
                    System.out.println("Digit sum is prime");
System.out.println(i);
                } else {
                    System.out.println("Digit sum is not prime");
                }
            }
        }
    }
}