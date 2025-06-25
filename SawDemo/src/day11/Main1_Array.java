package day11;

public class Main1_Array {
    public static void main(String[] args) {
//        int a,b,c,d,e;
//        a = 2;
//        b = 2;
//        c = 2;
//        d = 2;
//        e = 2;
        //square bracket
        int[] arr = new int[5]; //new->create
//        double[] arr = new double[5];
//        boolean[] arr = new boolean[5];

        //set first space as 66
        arr[0] = 66;
        arr[1] = 88;
        arr[2] = 22;
        arr[3] = 55;
        arr[4] = 11;

        System.out.println(arr);    //can't print arr directly

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
