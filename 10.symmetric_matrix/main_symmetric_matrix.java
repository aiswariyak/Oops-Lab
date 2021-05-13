public class main_symmetric_matrix {
    public static void main(String[] args){
        int a[][]=new int[20][30];
        int flag=0;
        System.out.println("enter the no of rows in matrix:");
        String s=System.console().readLine();
        int m=Integer.parseInt(s);
        System.out.println("enter the no of columns in matrix:");
        String s1=System.console().readLine();
        int n=Integer.parseInt(s1);
        if (m!=n){
            System.out.println("the matrix is not a square matrix");
        }
        else{
        System.out.println("enter the elements of  matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                String e=System.console().readLine();
                a[i][j]=Integer.parseInt(e);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flag=0;
                if(a[i][j]!=a[j][i]){
                    flag=1;
                    break;
                }
            }
        }
       if(flag==1){
           System.out.println("Matrix is not  symmetric");
       }
       else{
           System.out.println("Matrix is  symmetric");
       }
    }

  }
 }
