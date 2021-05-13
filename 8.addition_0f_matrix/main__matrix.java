public class main__matrix {
    public static void main(String args[]){
        int a[][]=new int[20][30];
        int b[][]=new int[20][30];
        int c[][]=new int[20][30];
        System.out.println("order of two matrix should be same:");
        System.out.println("enter the no of rows in matrix:");
        String s=System.console().readLine();
        int m=Integer.parseInt(s);
        System.out.println("enter the no of columns in matrix:");
        String s1=System.console().readLine();
        int n=Integer.parseInt(s1);
        System.out.println("enter the elements of first matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                String e=System.console().readLine();
                a[i][j]=Integer.parseInt(e);
            }
        }
        System.out.println("enter the elements of second matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                String e=System.console().readLine();
                b[i][j]=Integer.parseInt(e);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("resultant matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
