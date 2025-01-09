package _0_VishwaSir;

public class _1_Loops {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=21;j++){
                if((j==3 && i>=3)||(i<4 && i==j)||((i==2 && j==4)||(i==1 && j==5))){
                    System.out.print("# ");
                } else if ((j==7||j==10)||((i==1||i==3)&&(j>6&&j<11))){
                    System.out.print("# ");
                } else if (((i==1||i==3||i==5)&&j>12&&j<17)||((i==2&&j==13)||(i==4&&j==16))) {
                    System.out.print("# ");
                } else if ((j==18||j==21)||(j>17&&i==3)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/* OR for A */

//else if ((i==3 && j>6&&j<12)||(i>3&&(j==7||j==11))||((i==2 &&(j==8||j==10))||(i==1&&j==9))){
//    System.out.print("# ");
//}
