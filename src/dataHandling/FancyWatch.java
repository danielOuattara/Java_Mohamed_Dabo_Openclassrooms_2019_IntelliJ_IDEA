package dataHandling;

import java.net.PortUnreachableException;

public class FancyWatch {

    static int count = 0;
    int usages = 0;

    public FancyWatch() {
        count += 1;
    }

    public void wear() {
        this.usages += 1;
    }

    public static void main(String[] args) {
        FancyWatch myWatch = new FancyWatch();

        System.out.println(myWatch.count);
        System.out.println(myWatch.usages);

        FancyWatch joeWatch = new FancyWatch();

        for (int i = 0; i < 5; i++) {

            joeWatch.wear();

        }

        FancyWatch jennyWatch = new FancyWatch();
        System.out.println(myWatch.count);
    }
}
