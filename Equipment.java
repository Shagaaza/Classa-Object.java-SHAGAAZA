public class Equipment {
    private String equipmentId;
    private String equipmentName;
    private int availableQuantity;

    public Equipment(String equipmentId, String equipmentName, int availableQuantity) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.availableQuantity = Math.max(0, availableQuantity);
    }

    public void displayEquipmentDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Available Quantity: " + availableQuantity);
    }

    public void borrowOneItem() {
        if (availableQuantity > 0) {
            availableQuantity--;
            System.out.println("Equipment Borrowed Successfully!");
            System.out.println("Remaining Quantity: " + availableQuantity);
        } else {
            System.out.println("Borrowing Failed! No items are available.");
        }
    }

    public void returnOneItem() {
        availableQuantity++;
        System.out.println("Equipment Returned Successfully!");
        System.out.println("Available Quantity: " + availableQuantity);
    }

    public String getEquipmentName() {
        return equipmentName;
    }
}
