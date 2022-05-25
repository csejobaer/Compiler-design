import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
class Comment{
    int count = 0;
    int i = 0;
    int j = 0;
    int size = 0;
    public void commentChecker(String comment){
        char[] data = comment.toCharArray();
        size = data.length;
        for(i=1; i < size-1; i++){
            if(data[i-1] == '/'){
                if(data[i] == '/' ){
                    System.out.println("Single Line Comment Found");
                }
            }
            else if(data[i+1] == '*'){
                if(data[size-2] == '*')
                    if(data[size-1] == '/')
                        System.out.println("Multiline comment found");
            }
        }
    }
}
public class Main{
	public static void main(String[] args) {
        String reader;
        boolean siddhanto = true;
        int i =0;
	    try{
		File data = new File("comment.txt");
		FileWriter wirteFile = new FileWriter("comment.txt");
		boolean result = data.createNewFile();
		String info ="//Bangladesh University of Business and Technology\n//Rupnagar Mirpur\n/*Dhaka Bangladesh*/";
		wirteFile.write(info);
		wirteFile.close();
		Comment commentFineder = new Comment();
		Scanner read = new Scanner(data);
        while (read.hasNextLine()){
            reader = read.nextLine();
            System.out.println(reader);
            commentFineder.commentChecker(reader);
        }
	    }catch(Exception ee){
	        System.out.println("Exception found: "+ee);
	    }
	}
}

