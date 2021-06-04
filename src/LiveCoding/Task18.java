package LiveCoding;

import java.util.Objects;

public class Task18 {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i7", 16,
                "gtx1060", "Dell", "7577");
        Computer pc2 = new Computer("i5", 16,
                "gtx1060", "Lenovo", "laptop");
        System.out.println(pc1.equals(pc2));
        System.out.println("PC1: " + pc1.getCompany() + "\nPC2: " + pc2.getCompany());
        System.out.println(pc1.hashCode());
        System.out.println(pc1.toString());
    }
}

class Computer {

    String processor;
    int ram;
    String graphicsCard;
    String company;
    String model;

    public Computer(String processor, int ram, String graphicsCard,
                    String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram
                && processor.equalsIgnoreCase(computer.processor)
                && graphicsCard.equalsIgnoreCase(computer.graphicsCard)
                && company.equalsIgnoreCase(computer.company)
                && model.equalsIgnoreCase(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}