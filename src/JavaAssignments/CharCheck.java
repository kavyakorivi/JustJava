package JavaAssignments;
import java.util.Scanner;
public class CharCheck  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char letter = scanner.next().charAt(0);

        int index=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Given character, \""+letter+ "\" is in the string and the index is: "+index);
        }
        else{
            System.out.println("Given character is not present in the string.");
        }

    }
}
