package ua.dp.zymokos.heorhii;

public class NokiaPhone extends Phone implements PhoneConnection {

    public NokiaPhone(String phoneModel, int phoneMemory, int phoneRAM) {
        this.phoneBrand = "Nokia";
        this.phoneModel = phoneModel;
        this.phoneMemory = phoneMemory;
        this.phoneRAM = phoneRAM;
    }

    public NokiaPhone() {
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneModel = phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(int phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public int getPhoneRAM() {
        return phoneRAM;
    }

    public void setPhoneRAM(int phoneRAM) {
        this.phoneRAM = phoneRAM;
    }

    @Override
    public String toString() {
        return "Brand: " + phoneBrand + ", Model: " + phoneModel + ", Memory: " + phoneMemory + "Mb, RAM: " + phoneRAM + "Mb";
    }

    @Override
    public void makeCall() {
        System.out.println(getPhoneBrand() + " " + getPhoneModel() + " " + "calling...");
    }

    @Override
    public void sendMessage() {
        System.out.println(getPhoneBrand() + " " + getPhoneModel() + " " + "sending a message...");
    }
}
