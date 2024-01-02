public class ThreadEvenOdd {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        Thread t1=new Thread(m::even,"EvenThread");

        Thread t2=new Thread(m::odd,"OddThread");
        t1.start();
        t2.start();


    }
}
class MyThread{
    private static int sequenc=23;
    int i=1;
    public void even() {
        while (i <= sequenc) {
            synchronized (this) {
if(i%2==0){
    System.out.println(Thread.currentThread().getName()+":"+ i++);
    this.notify();
}else{
    try{
        this.wait();
    }catch (InterruptedException e){
        e.printStackTrace();
    }
                }
            }
        }
    }

    public void odd() {
        while (i <= sequenc) {
            synchronized (this) {
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+":"+ i++);
                    this.notify();
                }else{
                    try{
                        this.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
