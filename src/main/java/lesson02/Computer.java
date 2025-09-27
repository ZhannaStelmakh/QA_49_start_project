package lesson02;

public class Computer {
    private String company;
    private int ram;
    private String cpu;
    private int sdd;

    public Computer() {
    }

    public Computer(String company, int ram, String cpu, int sdd) {
        //this.company = company;
        if (company == null || company.isBlank())// null   ""empty   "      "
            this.company = "unknown";
        else
            this.company = company;
        //this.ram = ram;
        if (ram > 0)
            this.ram = ram;
        //this.cpu = cpu;
        setCpu(cpu);
        //this.sdd = sdd;
        setSdd(sdd);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isBlank())// null   ""empty   "      "
            this.company = "unknown";
        else
            this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0)
            this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu == null || cpu.isBlank())
            this.cpu = "cpu";
        else
            this.cpu = cpu;
    }

    public int getSdd() {
        return sdd;
    }

    public void setSdd(int sdd) {
        if (sdd > 0)
            this.sdd = sdd;
    }
}
