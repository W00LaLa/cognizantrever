package multithreading;

public class FeeThread extends Thread {
	
	public FeeThread(String ftName) {
        super(ftName);
    }
	
    public void run() {
    	
        super.run();
        //System.out.println("fee dept sign-- no dues");
        try {
            Thread.sleep(1000);
            for(int i=1;i<6;i++){
                System.out.println(Thread.currentThread().getName()+"--"+i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}