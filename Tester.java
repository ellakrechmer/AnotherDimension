import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[][]  A = { {  1,  0, 12, -1 },
                   {  7, -2,  2,  1 },
                   { -5, -2,  2, -9 }
                 };
    int[] B  =  {1, 3, 5};
    int[][] C = { {  1,  2, 3, 4 },
                  {  2, 3,  4,  1 },
                  { 3, 4,  1, 2 } };
    int[][] D= { {  1,  1, 1 },
                 {  2, 2, 2 },
                 { 3,  3, 3 } };
    int[][] E={ {  2,  2, 2 },
                {  2, 2, 2 } };
    int[][] F={ {  2, 4, 2 },
                {  2, 2, 2 }};
    //part 4
    //a
    System.out.println(ArrayOps.sum(B));
    //b
    System.out.println(ArrayOps.largest(B));
    //c
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    //d
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    //e
    System.out.println(ArrayOps.sum(A));

    //part 5
    //a
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    //b
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
    System.out.println(ArrayOps.isRowMagic(E));
    //c
    System.out.println(ArrayOps.isColMagic(C));
    System.out.println(ArrayOps.isColMagic(D));
    System.out.println(ArrayOps.isColMagic(E));
    //d
    System.out.println(ArrayOps.isLocationMagic(F, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(F, 1, 1));
  }
}
