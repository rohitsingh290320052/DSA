public class recusion {
    public static void main(String[] args) {
        //System.out.println(tilingproblem(5));
        printBinarystring(3,0,"");
    }
   /* public static int tilingproblem(int N){ // 2 * N (floor size)
        if(N==0 || N==1)
            return 1;
        //verticle choice
        int verticle=tilingproblem(N-1);
        //horizontal choice
        int horizontal=tilingproblem(N-2);
        int totalways=verticle+horizontal;
        return totalways;
    } */
    // Binary String without 1 (Paytm)
    public static void printBinarystring(int n, int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinarystring(n-1,0,str+"0");
        if(lastplace==0){
            printBinarystring(n-1,1,str+"1");


        }

    }
}
