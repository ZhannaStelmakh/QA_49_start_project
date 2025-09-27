package lesson02;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer("lenovo", 8, "i5", 512);
        Computer computer2 = new Computer("Apple", 16, "i9", 1024);
        Computer computer3 = new Computer("Asus", 32, "i7", 256);
        Computer computer4 = new Computer("lenovo", 16, "i3", 512);

        Computer computer5 = null;
        Computer computer6 = new Computer();
        System.out.println(computer2.getCompany() + ":" + computer2.getCpu());
        //System.out.println(computer5.getCompany());
        System.out.println(computer6.getCompany() + ":" + computer6.getRam());

        printComputer(computer1);
        printComputer(computer5);
        printComputer(computer6);
        System.out.println("====================================");
        Computer computer7 = new Computer("     ", -16, "", -512);
        printComputer(computer7);
    }

    public static void printComputer(Computer computer) {
        if (computer == null) {
            System.out.println("computer is null");
            return;
        }
        System.out.println(computer.getCompany() + ":" + computer.getRam() + ":"
                + computer.getCpu() + ":" + computer.getSdd());
    }

    private void method() {
        int a = 0;
        a = 33 / 3;
        System.out.println(a);
    }

}
