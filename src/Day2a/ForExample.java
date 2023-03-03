package Day2a;

public class ForExample {
    public static void main(String[] args) {
        //In ra các số từ 1->9
        for(int i=1; i<=10;i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        //In ra các số 1, 3, 5, 7, 9, ,,99
        for(int i=1; i<=99; i=i+2){
            System.out.print(i + "\t");
        }

    }
}
