public class timecomplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        timecomplexity sc = new timecomplexity();
        System.out.println(sc.findSum(10));

        System.out.println("Time taken :"+(System.currentTimeMillis() - now) + "millisecs.");
    }
    public int findSum( int n )
    {
     //  return n*(n+1)/2;
     int sum =0;
         for(int i=1;i<=n;i++) {
        sum = sum + i;
     }
     return sum;
     }
    }
