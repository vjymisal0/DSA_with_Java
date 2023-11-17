import java.io.IOException;

class trurnoff {
    public static void main(String args[])
    {
        Runtime run=Runtime.getRuntime();
       try {
        run.exec("ShutDown /s");
       } catch (IOException e) {
           e.printStackTrace();
       }  
    }
}
