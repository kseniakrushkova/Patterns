package project.structural.composite;

public class IntelProcessor  extends BaseProcessor{
    private String name;
private String core;
    public IntelProcessor(String core, int numberOfCores, int width, int height, String name) {
        super(core, numberOfCores, width, height);
        this.name = name;
    }

    public IntelProcessor(int numberOfCores, int width, int height, String name) {
        super(numberOfCores, width, height);
        this.name = name;
    }

    public IntelProcessor(int width, int height, String name) {
        super(width, height);
        this.name = name;
    }

    public IntelProcessor(int height, String name) {
        super(height);
        this.name = name;
    }

    public IntelProcessor(String name) {
        this.name = name;
    }
    public IntelProcessor() {
        this("name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getCore() {
        return "Intel";
    }

    @Override
    public int getWidth() {
        return 4;
    }

    @Override
    public int getHeight() {
        return 5;
    }
}
