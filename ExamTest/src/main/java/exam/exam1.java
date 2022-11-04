package exam;//Create a PUBLIC repository in GitLab
//Test the exam function using parameters
// Upload your solution to the master or main branch
//Create the branch "Mock"
//Test the exam function using mocks and imagine that "oneHalf" and "getRestZero" are under development
//Upload this solution to the "Mock" branch
//Create a TestSuite to run both tests in the "Mock" branch
//Share with me your PUBLIC repository (only the link)
//Upload your complete solution to Mudle

public class exam1 {

    public static boolean exam(int n){
        int i,m=0;
        boolean flag=true;
        m=oneHalf(n);
        if(n==0||n==1){
            flag=false;
        }else{
            for(i=2;i<=m;i++){
                if(getRestZero(n,i)){
                    flag=false;
                    break;
                }
            }

        }
        return flag;
    }

    static boolean getRestZero(int a, int b) {
        return a % b == 0;
    }

    public static int oneHalf (int n) {
        return n/2;
    }

}
