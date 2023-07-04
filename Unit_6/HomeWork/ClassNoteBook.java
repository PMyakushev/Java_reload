package HomeWork;

public class ClassNoteBook {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer id;
    private Integer HDD;
    private String brand;
    private String model;
    private boolean isBooked = false;
    public ClassNoteBook(String model, Integer id, String brand) {
        this.model = model;
        this.id = id;
        this.brand = brand;
        System.out.println(
                "Ноутбук мари: " + this.brand + ", Модель: " + this.model + ", С id: " + Integer.toString(this.id));
    }
    public String getColor() {
        return color;
    }
    public Integer getRAM() {
        return RAM;
    }
    public String getOS() {
        return OS;
    }
    public Integer getId() {
        return id;
    }
    public Integer getHDD() {
        return HDD;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Boolean isBooked() {
        return this.isBooked;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRAM(Integer RAM) {
       this.RAM = RAM;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void Book(boolean isBooked) {
        if (isBooked == false) {
            this.isBooked = true;
        } else {
            System.out.println("Ноутбук уже зарезервирован");
        }
    }
    @Override
    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("Ноутбук: ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append("");
        sb.append(System.lineSeparator());
        if (this.isBooked == false) sb.append("Не зарезервирован");
        else sb.append("Зарезервирован");
        return(sb.toString());
    }

}