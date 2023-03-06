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
         String p ="";
         for(int assd = 0; assd<k;assd++){
             p+=n;
         }
         
         while(p.length()>1){
             int sum = 0;
             for(int i = 0;i<p.length();i++){
                 sum+= Character.getNumericValue(p.charAt(i)) ;
             }
             
             p= String.valueOf(sum);
         }
         int superD = Integer.valueOf(p);
         
         
    return superD;
    }

}
