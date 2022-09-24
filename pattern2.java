class pattern1{
    public static void main(String[] args){
        int i,j,n,m=9;
        for(i=0;i<5;i++){
            for(j=i;j<5;j++){
                System.out.print(" ");
            }
            int l = 9;
            for(int k = 0; k<=i;k++){
                if(i%2==0){
                    System.out.print(l);
                    l=l-2;
                }
                else{
                    System.out.print(m);
                }
            }
            System.out.println();
            m=m-2;
        }
    }
}

/*
     9
    77
   975
  3333
 97531
 
 */
