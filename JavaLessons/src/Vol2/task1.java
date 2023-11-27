package Vol2;

public class task1 {
    public static String createString(int n){
        String result = "";
        for(int i=0;i<n;i++){
            if(i%2==0){
                result += "+";
            }
            else{
                result += "-";
            }
        }
        return (result);
    }

    public static void main(String[] args) {
        System.out.println(createString(5));
        System.out.println(createString(8));
    }
}
