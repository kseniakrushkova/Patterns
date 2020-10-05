package project.structural.composite;

public class PhoneProcessor extends BaseProcessor{
    private String phoneType;

    public PhoneProcessor(String core, int numberOfCores, int width, int height, String phoneType) {
        super(core, numberOfCores, width, height);
        this.phoneType = phoneType;
    }

    public PhoneProcessor(int numberOfCores, int width, int height, String phoneType) {
        super(numberOfCores, width, height);
        this.phoneType = phoneType;
    }

    public PhoneProcessor(int width, int height, String phoneType) {
        super(width, height);
        this.phoneType = phoneType;
    }

    public PhoneProcessor(int height, String phoneType) {
        super(height);
        this.phoneType = phoneType;
    }

    public PhoneProcessor(String phoneType) {
        this.phoneType = phoneType;
    }
    public PhoneProcessor() {
        this("phoneType");
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public int getWidth() {
        return 3;
    }

    @Override
    public int getHeight() {
        return 3;
    }
}
