package ua.dp.zymokos.heorhii;

public class Main {
    public static void main(String[] args) {

        SamsungPhone samsung = new SamsungPhone("S21", 512, 16);
        NokiaPhone nokia = new NokiaPhone("9.3", 256, 8);

        System.out.println(samsung.toString());
        samsung.makeCall();
        samsung.sendMessage();
        samsung.takePhoto();
        samsung.makeVideo();

        System.out.println();

        System.out.println(nokia.toString());
        nokia.makeCall();
        nokia.sendMessage();
    }
}
