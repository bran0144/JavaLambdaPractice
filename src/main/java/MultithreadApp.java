public class MultithreadApp {

  Thread thread1;
  Thread thread2;

  public MultithreadApp() {
    thread1 = new Thread(new Runnable() {
      @Override
      public void run(){
        System.out.println("Thread #1 is running");
      }
    });
    thread2 = new Thread(() -> System.out.println("Thread #2 is running"));
  }

  public void startThreads() {
    thread1.start();
    thread2.start();

  }
}
