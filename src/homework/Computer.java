package homework;

public class Computer {
    public static void main(String[] args) {
        /*create a class Computer
        create a main method

        declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card,
        price, number of USB slots, has Bluetooth
        create a summary of the information and print it. Be creative*/
        String brand,processor, ramMemory, storageMemory;

        brand="HP";
        processor="AMD Ryzen 3 ";
        ramMemory= "8GB DDR-3200 (2x4 GB)";
        storageMemory= "256GB M2 SSD";
        double price=689.99;
        byte numberOfUSBSlots=4;
        boolean hasMonitor=false;
        boolean hasWifiCard=true;
        boolean hasBluetooth=true;
        String report="Computer "+
                "\n"+"Brand: "+brand+
                "\n"+"Processor:"+processor+
                "\n"+"Ram memory: "+ramMemory+
                "\n"+"Storage memory: "+storageMemory+
                "\n"+"Price: "+price+
                "\n"+"Number of USB slots: "+numberOfUSBSlots+
                "\n"+"Has monitor: "+hasMonitor+
                "\n"+"Has wifi card: "+hasWifiCard+
                "\n"+"Has Bluetooth: "+hasBluetooth;
        System.out.println(report.trim());








    }
}
