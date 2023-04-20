package Seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Airplane{
    private final  long propellerChange;
    private final long cameraPrepare;
    public Airplane(long propellerSpeed, long cameraSpeed){
        propellerChange = 1000 / propellerSpeed;
        cameraPrepare = 1000 / cameraSpeed;
    }
    public void engineWorkProcess(){
        long nextChangePropeller = System.currentTimeMillis() + propellerChange;

        while (true){
            System.out.println("Closed");
            while (nextChangePropeller - System.currentTimeMillis() >= 0);
            nextChangePropeller += propellerChange;
            System.out.println("Opened");
            while (nextChangePropeller - System.currentTimeMillis() >= 0);
            nextChangePropeller += propellerChange;
        }
    }
    public void cameraWorkProcess(){
        long nextChangePropeller = System.currentTimeMillis() + propellerChange;
        long nextStart = nextChangePropeller - cameraPrepare;
        long nextPhoto;

        while (true){
            while (nextStart - System.currentTimeMillis() >= 0);
            nextChangePropeller += propellerChange;
            nextPhoto = System.currentTimeMillis() + cameraPrepare;
            while (nextPhoto < nextChangePropeller) {
                while (nextPhoto - System.currentTimeMillis() >= 0);
                System.out.println("Photo");
                nextPhoto += cameraPrepare;
            }
            nextChangePropeller += propellerChange;
            nextStart = nextChangePropeller - cameraPrepare;
        }
    }
}

class Test{
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> startEngine());
        pool.submit(() -> startCamera());

    }
    static Airplane airplane = new Airplane(1,2);
    static void startEngine(){
            airplane.engineWorkProcess();
    }
    static void startCamera(){
        airplane.cameraWorkProcess();
    }
}

