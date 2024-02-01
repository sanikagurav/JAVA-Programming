public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        //outer loop
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }

        //0-1 Triangle
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print("1 "); 
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
