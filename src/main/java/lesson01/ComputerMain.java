package lesson01;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", 8, "i5", 500);
        Computer computer2 = new Computer("Lenovo", 16, "i9", 700);
        Computer computer3 = new Computer("Lenovo", 32, "i11", 900);

        printComputer(computer1);
        printComputer(computer2);
        printComputer(computer3);

        System.out.println("============================================");

        computer1.setCompany("Huawei");
        printComputer(computer1);

        computer2.setSdd(500);
        printComputer(computer2);

        computer3.setCpu("i9");
        printComputer(computer3);
    }

    private static void printComputer(Computer computer) {
        System.out.println(computer.getCompany() + ":" + computer.getRam() + ":"
                + computer.getCpu() + ":" + computer.getSdd());
    }
}
