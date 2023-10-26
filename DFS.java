package CoinChange;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        Integer [] pecahan = {2,1,5,3,4};
        int uang = 21;
        ArrayList<Integer> data = new ArrayList<>();

        while(uang>0){
            boolean adacoin = false;
            for(int i =0;i< pecahan.length;i++){
                if(pecahan[i]<=uang){
                    data.add(pecahan[i]);
                    uang = uang-pecahan[i];
                    adacoin = true;
                    break;
                }
            }
            if(uang==0){
                System.out.println("Selesai");
                for(int i = 0;i< data.size();i++){
                    if(i>0){
                        System.out.print(" + ");
                    }
                    System.out.print(data.get(i));
                }
            }else if(!adacoin){
                System.out.println("Tidak Ada Solusi");
                break;
            }
        }
    }
}
