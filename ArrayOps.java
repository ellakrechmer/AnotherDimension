public class ArrayOps {
  //part 4
  public static int sum(int[] arr){
    int sum=0;
    for (int i =0; i<arr.length; i++) {
      sum+=arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int largest=0;
    for (int i=0; i<arr.length; i++){
      if (arr[i]>largest) largest=arr[i];
    }
    return largest;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] arr= new int[matrix.length];
    for(int i =0; i<matrix.length; i++) {
      arr[i]=sum(matrix[i]);
    }
    return arr;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] arr= new int[matrix.length];
    for(int i =0; i<matrix.length; i++) {
      arr[i]=largest(matrix[i]);
    }
    return arr;
  }
  public static int sum(int[][] arr) {
    int sum=0;
    for (int i =0; i<arr.length; i++) {
      sum+=sum(arr[i]);
    }
    return sum;
  }
  //part 5
  public static int[] sumCols(int[][] matrix) {
    int[] arr=new int[matrix[0].length];
    for (int i=0; i<matrix[0].length; i++) {
      for (int j=0; j<matrix.length; j++) {
        arr[i]+=(matrix[j][i]);
      }
    }
    return arr;
  }
  public static boolean isRowMagic(int[][] matrix) {
    int first=sum(matrix[0]);
    boolean magicRow=false;
    for (int i=1; i<matrix.length; i++) {
      if (sum(matrix[i])==first) magicRow=true;
      else {
        magicRow=false;
        break;
      }
    }
    return magicRow;
  }
  public static boolean isColMagic(int[][] matrix) {
    int first=sumCols(matrix)[0];
    boolean magicColumn=false;
    for (int i=1; i<matrix[0].length; i++) {
      if (sumCols(matrix)[i]==first) magicColumn=true;
      else {
        magicColumn=false;
        break;
      }
    }
    return magicColumn;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return (sum(matrix[row])==sumCols(matrix)[col]);
  }
}
