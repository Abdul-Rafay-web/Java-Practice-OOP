package Arrays;

import java.util.Scanner;

public class Hotel {
    int floors;
    int roomsPerFloor;
    int[][] rooms;

    public Hotel(int floors, int roomsPerFloor) {
        this.floors = floors;
        this.roomsPerFloor = roomsPerFloor;
        rooms = new int[floors][roomsPerFloor];
    }

    public void bookAPerson(int floor, int room) {
        if (floor <= floors && room <= roomsPerFloor) {
            if (rooms[floor][room] == 0) {
                System.out.println("Room " + room + " has been booked Successfully");
            } else {
                System.out.println("Room " + room + " has already been booked");
            }
        }else{
            System.out.println("Invalid Floor or Room Number");
        }
    }
    public void findFirstAvailableRoom() {
        for (int i = 0; i < floors; i++) {
            for (int j = 0; j < roomsPerFloor; j++) {
                if (rooms[i][j] == 0) {
                    System.out.println("The First Aavailable Room is on Floor: "+(i)+" Room NO:"+(j+1));
                }
                break;
            }
        }
    }
    public void inputRoomsStatus(Scanner scan){
        for(int i=0;i<floors;i++){
            for(int j=0;j<roomsPerFloor;j++){
                System.out.println(" For Floor "+(i)+" Room NO:"+(j+1));
                rooms[i][j] = scan.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hotel hotel = new Hotel(2,4);
        hotel.inputRoomsStatus(scan);
        hotel.findFirstAvailableRoom();
        hotel.bookAPerson(1,3);
    }
}
