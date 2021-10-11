package ReadWriteFile;


	import java.io.FileWriter;
	import java.io.IOException;
	 
	
	public class WriteFile {
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("myFile.txt", true);
	            writer.write("Writing");
	            writer.write("System");   
	            writer.write("Thank you!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
}
