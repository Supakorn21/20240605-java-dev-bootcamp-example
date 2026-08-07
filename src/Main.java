import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
void main() throws IOException {
//Create self introduction program
//        Scanner scanner = new Scanner(System.in);
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(inputStreamReader);
//        System.out.println("Hello, My name is Supakorn Charoen");
//        System.out.println("I'm living in Tokyo, Japan");
//
    System.out.print("Please provide any input 1: ");
    String text1 = br.readLine();
    System.out.println("User input 1: " + text1);
//
//        System.out.print("Please provide any input 2: ");
//        String text2 = scanner.nextLine();
//        System.out.println("User input 2: "+ text2);
}