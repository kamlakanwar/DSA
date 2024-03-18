public class array {
    public void printArray(int[] arr) {
    int n = arr.length;
    for(int i=0 ; i<n ;i++) {
        System.out.println(arr[i] + " ");
    }
    System.out.println();
    }
    
    public void arrayDemo() {
        int[] myArray = new int [5];
        myArray[0]=9;
        myArray[1]=8;
        myArray[2]=7;
        myArray[3]=5;
        myArray[4]=3;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
        System.out.println(myArray[3]);
    }
    public static void main(String[] args) {
       array Array = new array();
        Array.arrayDemo();
    }
    
}
