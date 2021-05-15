import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller obj = new Hosteller();
        System.out.println("Modify Room Number(Y/N)");
        boolean updateRoom = sc.next().equals("Y");
        
        if(updateRoom){
            System.out.println("New Room Number");
            int room = sc.nextInt();
            obj.setRoomNumber(room);
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        boolean updatePhone = sc.next().equals("Y");
        
        if(updatePhone){
            System.out.println("New Phone Number");
            String phone = sc.next();
            obj.setPhone(phone);
        }
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(String.valueOf(obj.getStudentId()))
                .add(obj.getName())
                .add(String.valueOf(obj.getDepartmentId()))
                .add(obj.getGender())
                .add(obj.getPhone())
                .add(obj.getHostelName())
                .add(String.valueOf(obj.getRoomNumber()));

        System.out.println("The Student Details:");
        System.out.println(stringJoiner.toString());
    }
    public static Hosteller getHostellerDetails(){
        Scanner scanner = new Scanner(System.in);
        Hosteller obj = new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = scanner.nextInt();

        System.out.println("Student Name");
        String name = scanner.next();

        System.out.println("Department Id");
        int department = scanner.nextInt();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Phone Number");
        String phNo = scanner.next();

        System.out.println("Hostel Name");
        String hostel = scanner.next();

        System.out.println("Room Number");
        int room = scanner.nextInt();
        
        obj.setStudentId(id);
        obj.setName(name);
        obj.setDepartmentId(department);
        obj.setGender(gender);
        obj.setPhone(phNo);
        obj.setHostelName(hostel);
        obj.setRoomNumber(room);
        
        return obj;
    }
}
