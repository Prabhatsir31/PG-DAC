public class Sample 
{
    // Declare native method
    public native void sayHello();

    // Load the DLL
    static 
    {
        System.loadLibrary("devpro");  // Will load hello.dll
    }

    public static void main(String[] args) 
    {
        new Sample().sayHello();  // Call native method
    }
}


