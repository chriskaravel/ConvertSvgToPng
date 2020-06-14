import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class ConvertSvgToPng  {
    public static void main(String[] args) throws Exception {
    	
    	 int index;
    	 if(args.length<2)
    	 {
    		 System.out.println("You must execute the java script with TWO ARGUMENTS,the FIRST ARGUMENT is the path for the svg file you want to convert "
    	         		+ "and the SECOND ARGUMENT is the save location ");
    	 }
    	 else{
         for (index = 0; index < args.length; ++index)
         {
             System.out.println("args[" + index + "]: " + args[index]);
         }	
     	HashMap<Float, String>  map = new HashMap();
     	map.put((float)  0.75 * 90, "ldpi");
     	map.put((float)  1.00 * 90, "mdpi");
     	map.put((float)  1.50 * 90, "hdpi");
     	map.put((float)  2.00 * 90, "xhdpi");
     	map.put((float)  3.00 * 90, "xxhdpi");
     	map.put((float)  4.00 * 90, "xxxhdpi");
     	 try {
     		 
     		 for(Entry<Float, String> entry : map.entrySet()) {
     			 	Float key = entry.getKey();
     			    String value = entry.getValue();
         		    Process p = Runtime.getRuntime().exec("C:\\Program Files\\Inkscape\\inkscape.exe -z  -f \""+args[0]+"\"  -e \""+args[1]+"\\"+value+".png\" -d="+key+" -D "); 
         		    System.out.println("C:\\Program Files\\Inkscape\\inkscape.exe -z  -f \""+args[0]+"\"  -e \""+args[1]+"\\"+value+".png\" -d="+key+" -D ");
     		 }
     		  } catch(IOException ex) {
     		   ex.printStackTrace();
     		  }    
    	 }
    	 }
}
