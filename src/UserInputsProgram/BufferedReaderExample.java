package UserInputsProgram;

    import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	public class BufferedReaderExample {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Enter country name:");
	        String country = br.readLine(); // Corrected method name

	        System.out.println("Enter country code:");
	        int code = Integer.parseInt(br.readLine()); // Corrected method name

	        System.out.println("The country name is: " + country + " and the country code is " + code);
	    }
	}



