public class HollowRectangle {
    public static void hollow_rectangle(int totrows,int totcols) {
        //Outer Loop
        for(int i= 1;i<=totrows;i++) {
            //Inner Column
            for( int j = 1;j<=totcols;j++) {
                //Cells(i,j)
                if(i==1||i==totrows||j==1||j==totcols) {
                   //Boundary Cells
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_rectangle(4,5);
    }
    
}
