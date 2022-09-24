class pattern1{
    public static void main(String[] args){
        int i,j,n;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<5;k++){
                if(i%2==0){
                    if(k%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print("*");
                    }
                }
                else{
                    if(k%2!=0){
                        System.out.print("#");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
/*output

#*#*#
 #*#*
  #*#
   #*
    #
    
    */
