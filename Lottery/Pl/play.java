package Lottery.Pl;

import java.util.*;



public class play {

    private Random ran = new Random();

    public play(){

    }

    public String wPlay(){

        int[] w=new int[6];
        for(int i=0;i<w.length;i++){
            w[i]=0;
        }
        int sp=ranAns(8);

        for(int i=0;i<w.length;){

            int a=ranAns(38);

            if(isDup(w, a)){
                continue;
            }else{
                w[i]=a;
                i++;
            }

        }

        Arrays.sort(w);

        String s=Arrays.toString(w).replaceAll("\\[","").replaceAll("\\]","");
        String s2=String.valueOf(sp);

        return s+"    sp:"+s2;
    }

    public String dPlay(){

        int[] w=new int[6];
        for(int i=0;i<w.length;i++){
            w[i]=0;
        }


        for(int i=0;i<w.length;){

            int a=ranAns(49);

            if(isDup(w, a)){
                continue;
            }else{
                w[i]=a;
                i++;
            }

        }

        Arrays.sort(w);

        String s=Arrays.toString(w).replaceAll("\\[","").replaceAll("\\]","");

        return s;
    }

    public String fPlay(){

        int[] w=new int[5];
        for(int i=0;i<w.length;i++){
            w[i]=0;
        }

        for(int i=0;i<w.length;){

            int a=ranAns(39);

            if(isDup(w, a)){
                continue;
            }else{
                w[i]=a;
                i++;
            }

        }

        Arrays.sort(w);

        String s=Arrays.toString(w).replaceAll("\\[","").replaceAll("\\]","");


        return s;
    }

    public String gPlay(){

        int[] w=new int[10];

        for(int i=0;i<w.length;i++){
            w[i]=0;
        }


        for(int i=0;i<w.length;){

            int a=ranAns(100);

            if(isDup(w, a)){
                continue;
            }else{
                w[i]=a;
                i++;
            }

        }

        Arrays.sort(w);

        String s=Arrays.toString(w).replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","     ");


        return s;
    }

    private boolean isDup(int[] arr,int num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }

        return false;

    }


    private int ranAns(int num){

        int[] arr=new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }

        for(int i=0;i<10000000;i++){

            arr[ran.nextInt(num)]++;

        }

        int max=0;
        int maxNum=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
                maxNum=i;
            }

        }

        return maxNum+1;

    }


}
