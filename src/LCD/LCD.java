package LCD;

public class LCD {
    String Status; // Menentukan tipe data Status
    int Volume; // Menentukan tipe data Volume
    int Brightness; // Menentukan tipe data Brightness
    String Cable; // Menentukan tipe data Cable

    // Method untuk Status LCD mati
    public void turnOff() {
        this.Status = "Mati"; // Menentukan Status LCD Mati
    }

    // Method untuk Status LCD hidup
    public void turnOn() {
        this.Status = "Hidup"; // Menentukan Status LCD Hidup
    }

    // Method untuk Status LCD freeze
    public void Freeze() {
        this.Status = "Freeze"; // Menentukan Status LCD Freeze
    }

    // Method untuk menaikkan volume
    public void volumeUp() {
        this.Volume++; // Menaikkan volume
    }

    // Method untuk mengurangi volume
    public void volumeDown() {
        this.Volume--; // Mengurangi volume
    }

    // Method untuk menentukan volume berdasarkan angka yang diinputkan
    public void setVolume(int Volume) {
        this.Volume = Volume; // Menentukan volume
    }

    // Method untuk menaikkan brightness
    public void brightnessUp() {
        this.Brightness++; // Menaikkan brightness
    }

    // Method untuk mengurangi brightness
    public void brightnessDown() {
        this.Brightness--; // Mengurangi rightness
    }

    // Method untuk menentukan brightness berdasarkan angka yang diinputkan
    public void setBrightness(int brightness) {
        this.Brightness = brightness; // Menentukan brightness
    }

    // Method untuk menentukan kabel
    public void setCable(int option) {
        String[] cables = {"VGA", "DVI", "HDMI", "Display Port"}; // Array cables yang berisi kabel-kabel
        if (option >= 0 && option < cables.length) { // Menentukan kabel yang digunakan dari option berdasarkan angka yang diinputkan pada Main
            this.Cable = cables[option]; // Menentukan kabel yang digunakan dari option
        }
    }
    
    // Method untuk menampilkan hasil output
    public void displayMessage() {
        System.out.println("LCD Status: " + Status); // Untuk menampilkan hasil output status LCD
        System.out.println("Volume: " + Volume); // Untuk menampilkan hasil output volume
        System.out.println("Brightness: " + Brightness); // Untuk menampilkan hasil output brightness
        System.out.println("Cable: " + Cable); // Untuk menampilkan hasil output cable
    }
}