//creating thread by implementing runnable interface
// class runnablex implements Runnable{
    class runnablex extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.printf("\nFrom Runnablex: i= "+i);
        }
    }
}
// class runnabley implements Runnable{
    class runnabley extends Thread{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.printf("\nFrom Runnabley: j= "+j);
        }
    }
}
// class runnablez implements Runnable{
    class runnablez extends Thread{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.printf("\nFrom Runnablez: k= "+k);
        }
    }
}
class Runnabledemo
{
    public static void main(String args[])
    {
        runnablex x1=new runnablex();
        runnabley y1=new runnabley();
        runnablez z1=new runnablez();
        x1.setPriority(Thread.MIN_PRIORITY);
        y1.setPriority(Thread.MAX_PRIORITY);
        z1.setPriority(Thread.NORM_PRIORITY);
        x1.run();
        y1.run();
        z1.run();

    }
}
