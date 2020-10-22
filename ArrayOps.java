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
        arr[i]=sum(matrix[j]);
      }
    }
    return arr;
  }
}
