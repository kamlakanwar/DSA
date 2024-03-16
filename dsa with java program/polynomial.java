public class polynomial {
    // time complexity is time taken by algorithm to run..
public class timecomplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        
        System.out.println("Time taken :"+(System.currentTimeMillis() - now) + "millisecs.");
    }
    public void poly(int n ) {
        for(int i=1; i<=n ; i++) {
            for(int j=1;j<=n ;j++) {
                System.out.println("i=" +i + ", j=" +j);
            }
            System.out.println("End of the inner loop");
        }
        System.out.println("End of outerloop");
    }
     }
}