package project.structural.composite;

public class BaseProcessor implements Processor {
    private String core;
    private int numberOfCores;
    private int width;
    private int height;

    public BaseProcessor(String core, int numberOfCores, int width, int height) {
        this.core = core;
        this.numberOfCores = numberOfCores;
        this.width = width;
        this.height = height;
    }

    public BaseProcessor(int numberOfCores, int width, int height) {
        this("Core", numberOfCores, width, height);
    }

    public BaseProcessor(int width, int height) {
        this("Core", 4, width, height);
    }

    public BaseProcessor(int height) {
        this("Core", 4, 5, height);
    }

    public BaseProcessor() {
        this("Core", 4, 5, 7);
    }

    public void setCore(String core) {
        this.core = core;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getCore() {
        return core;
    }

    @Override
    public void countElem(int processor) {
        numberOfCores++;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
