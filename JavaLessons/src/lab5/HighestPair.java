package lab5;

public class HighestPair {
    public static void main(String[] args) {
        int[] tab = {1, 1};
        int highest = 0;
        for (int i = 0; i< tab.length-1;i++) {
            for(int j =i+1;j< tab.length;j++){
                if(tab[i] == -tab[j]){
                    if(highest<(Math.abs(tab[i]))){
                        highest = Math.abs(tab[i]);
                    }
                }
            }
        }
        if(highest!=0){
            System.out.println(highest +", "+ (-highest));
        }
        else {
            System.out.println("lack of pair");}
    }
}
