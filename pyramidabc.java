class pyramidabc{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
        //space
        
        for (int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //character
        for(char ch='A';ch<='A'+2*i;ch++){
            System.out.print(ch);
        }
        System.out.println();
        }
    }
}