
class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters: 
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
    
    
    if(n.length()*k>1){
        long sum = 0;
        for(int i=0;i<n.length();i++){
            sum+=Character.getNumericValue(n.charAt(i)) ;
        }
        sum = sum*k;
        String p = String.valueOf(sum);
        return superDigit(p, 1);
    }
    return Integer.valueOf(n);
    
    }

}
