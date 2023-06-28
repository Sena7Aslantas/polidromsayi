
public class Main {

    static boolean isPolindrom(int number) {
        int temp=number, lastnumber,reversenumber=0;
        while(temp!=0){
            lastnumber=temp%10;
            reversenumber=(reversenumber*10)+lastnumber;
            temp=temp/10;
        }
        if(number==reversenumber)
           return true;
        else
            return false;
    }


    public static void main(String[] args) {
           System.out.println(isPolindrom(123));

    }
}
