import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
 
public class AsynchronousFileReadExample {
 
   
    public static void main(String[] args) {
	// address of the file
    	Path path = Paths.get("d:\\FileDemo.java");
    		    AsynchronousFileChannel fileChannel = null;
				try {
					// channel is always associated with the file
					fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 
			// buffer where channel is going to write file's contents
    		    ByteBuffer buffer = ByteBuffer.allocate(1024);
    		 // read from channel inside buffer from the file position given i.e. 0
    		    fileChannel.read(
    		      buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
    		 
    		        @Override
    		        public void completed(Integer result, ByteBuffer attachment) {
    		            // result is number of bytes read
    		                		           	System.out.println("Reading is done by thread\t"+Thread.currentThread().getName());
System.out.println("is it daemon thread\t"+Thread.currentThread().isDaemon());
    		        	System.out.println("Result is\t"+result);

    		        	// convert Bytebuffer into String which is a readable format
    		        	String str=new String(buffer.array(),0,buffer.array().length);
    		        	System.out.println("File Contents are\t"+str);
    		        	System.out.println(attachment);
    		        	 
    		        }
    		        @Override
    		        public void failed(Throwable exc, ByteBuffer attachment) {
    		 System.out.println("Failed to Read");
    		        }
    		    });
    		  
    		 	System.out.println("Other job is done by thread\t"+Thread.currentThread().getName());
    		    for(int i=0;i<4;i++)
    		    {
    		    	System.out.println("doing something else");
    		    }

    		  /* try
    		   {
    			   Thread.sleep(200);
    		   }
    		   catch(InterruptedException ie)
    		   {
    			   ie.printStackTrace();
    		   }*/
    		   System.out.println("Done All");
    		    
}
}
