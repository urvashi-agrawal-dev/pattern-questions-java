class etoa{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            char start=(char) ('E'-i);
            for(char ch=start;ch<='E';ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}