import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            String a=in.nextLine();
            String []b=a.split(" ");
            if(Integer.valueOf(b[0])==0){
                String r="0";
                for(int i=1;i<10;i++){
                    for(int j=0;j<Integer.valueOf(b[i]);j++){
                        r+=String.valueOf(i);
                    }
                }
                if(r.length()==1){
                    System.out.println("0");
                }else
                    System.out.println(r.substring(1));
            }else{
                int pro=0;
                for(int i=1;i<10;i++){
                    if(Integer.valueOf(b[i])!=0){

                        pro=i;
                        int o=Integer.valueOf(b[i]);
                        b[i]=String.valueOf(o-1);
                        break;
                    }
                }

                String r=String.valueOf(pro);
                for (int i = 0; i <10 ; i++) {
                    for(int j=0;j<Integer.valueOf(b[i]);j++){
                        r+=String.valueOf(i);
                    }

                }
                System.out.println(r);

            }


        }
    }
}