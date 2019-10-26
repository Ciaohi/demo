package Java.DataStructure;

/**
 * Created by ciaohi on 2019/10/26 20:19
 */
public class SparseArray {
     /**二维数组转换稀疏数组
     *创建二维稀疏数组
     *给二维稀疏数组赋值
      * * 遍历二维数组，把非0有效数据存储到二维稀疏数组
     * */
    public static int[][] parseSparseArr(int[][] arr) {
        //检测数组合法性
        checkArr(arr);
        //*遍历二维数组得到非0有效数据个数
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]!=0){
                    sum++;
                }
            }
        }
        //创建二维稀疏数组
        int[][] sparseArr=new int[sum+1][3];
        //给二维数组第一行赋值
        sparseArr[0][0]=arr.length;
        sparseArr[0][1]=arr[0].length;
        sparseArr[0][2]=sum;
        int count=0;
        //遍历二维数组,把非0有效数据存储到二维稀疏数组
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=arr[i][j];
                }
            }
        }
        return sparseArr;
    }

    private static void checkArr(int[][] arr) {
        if(arr==null){
            throw new IllegalArgumentException("arr can not be null");
        }
    }

    //稀疏数组转换二维数组
    public static int[][] formatArrToSparseArr(int[][] sparseArr){
        checkArr(sparseArr);
        return null;
    }
}
