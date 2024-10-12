
public class MergeArray{
    public static void main(String[] args){
        int A[]={1,3,6,8,9};
        int B[]={2,3,4,5,6,7};
        int C[] =new int[11];
        int i=0;
        int j=0;
        int k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
            }
            else{
                C[k]=B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }

        for(int p=0;p<11;p++){
           System.out.println(C[p]);
       }
    }
}