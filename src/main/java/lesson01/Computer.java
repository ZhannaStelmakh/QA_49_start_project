package lesson01;

public class Computer {

    private String company;
    private int ram;
    private String cpu;
    private int sdd;

    public Computer(String company, int ram, String cpu, int sdd) {
        this.company = company;
        this.ram = ram;
        this.cpu = cpu;
        this.sdd = sdd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram <= 0)
            this.ram = 111;
        else
            this.ram = ram;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSdd() {
        if (sdd <= 0)
            this.sdd = 222;
        else
            this.sdd = sdd;
        return sdd;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }


}
