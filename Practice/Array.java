package Practice;

public class Array {


    public static void main(String[] args) {
        int num[] = new int[3];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        int n = num.length;
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        
        String name = new String("Rifat");  

        char ch[] = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }

    
    
}
