package Playround;

public class debug {

    public static void main(String[] args) {
        String door1, door2, window1, window2, window3, window4;
        window1 = window2 = window3 = window4 = "Shut";
        door1 = door2 = "Shut";
        if ((window1 == "Shut") && (window2 == "Shut") && (window3 == "Shut") && (window4 == "Shut")) {
            if (door1 == "Shut" && door2 == "Shut") {
                System.out.println("Alarm armed");
            } else {
                System.out.println("Not all doors closed");
            }
        } else {
            System.out.println("Not all windows closed");
        }

    }
}
