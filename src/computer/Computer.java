package computer;

public class Computer {

    private String operatingSystem;
    private float processTact, memory;
    private int hardDrive;

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setProcessTact(float processTact) {
        this.processTact = processTact;
    }

    public float getProcessTact() {
        return processTact;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public float getMemory() {
        return memory;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public Computer(float processTact, float memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Computer(float processTact, float memory, int hardDrive, String operatingSystem) {
        this(processTact, memory, hardDrive);
        this.operatingSystem = operatingSystem;
    }

    public Computer() {
        this(2.4f, 16.0f, 500, "Linux");
    }

}
