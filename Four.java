public class Four {
    public static void main(String args[]){
        int number=3;
        int limit=10;
        System.out.println("Multiplication table of" +number+ ":");
        for(int i=limit;i>=1;i--){
            System.out.println(number + "x" + i + "=" +(number * i));
        }
    }
}
