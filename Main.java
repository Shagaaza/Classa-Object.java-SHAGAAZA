public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ST101", "Ahmed Hassan");
        Student student2 = new Student("ST102", "Amina Ali");
        Student student3 = new Student("ST103", "Mohamed Omar");

        Equipment equipment1 = new Equipment("EQ201", "Cisco Router", 5);
        Equipment equipment2 = new Equipment("EQ202", "Laptop", 3);
        Equipment equipment3 = new Equipment("EQ203", "Network Switch", 2);
        Equipment equipment4 = new Equipment("EQ204", "Printer", 0);

        System.out.println("===== UNIVERSITY LABORATORY SYSTEM =====");

        System.out.println("\nStudent Information:");
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student3.displayStudentDetails();

        System.out.println("\nEquipment Information:");
        equipment1.displayEquipmentDetails();
        System.out.println();
        equipment2.displayEquipmentDetails();
        System.out.println();
        equipment3.displayEquipmentDetails();
        System.out.println();
        equipment4.displayEquipmentDetails();

        System.out.println("\n===== BORROW EQUIPMENT =====");
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Equipment: " + equipment1.getEquipmentName());
        equipment1.borrowOneItem();

        System.out.println("\nUpdated Equipment Details:");
        equipment1.displayEquipmentDetails();

        System.out.println("\n===== RETURN EQUIPMENT =====");
        System.out.println("Equipment: " + equipment1.getEquipmentName());
        equipment1.returnOneItem();

        System.out.println("\nUpdated Equipment Details:");
        equipment1.displayEquipmentDetails();

        System.out.println("\n===== BORROW EQUIPMENT WITH ZERO QUANTITY =====");
        System.out.println("Student: " + student2.getStudentName());
        System.out.println("Equipment: " + equipment4.getEquipmentName());
        equipment4.borrowOneItem();

        System.out.println("\nUpdated Equipment Details:");
        equipment4.displayEquipmentDetails();
    }
}
