import java.io.*;

public class STI {

public static int getNumber(String number){

int result = 0;

for (int i = 0; i < number.length(); i++){

result = result * 10 + number.charAt(i)- '0';

}

return result;

}

public static void main(String[] args) {

System.out.println(getNumber("34560"));
}

}
