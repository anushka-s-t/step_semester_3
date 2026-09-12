class ExamHall {
    String hallName;
    int seatsFilled;
}

public class hall {
    public static void main(String[] args) {
        // Create two separate ExamHall objects
        ExamHall hallA = new ExamHall();
        ExamHall hallB = new ExamHall();
        
        // Initialize names
        hallA.hallName = "Block-3 Hall A";
        hallB.hallName = "Block-3 Hall B";
        
        // Increment seatsFilled for hallA only, four separate times
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        
        // Print both halls' seatsFilled values
        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
