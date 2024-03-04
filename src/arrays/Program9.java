package arrays;

class Expiry {
	   private Item item;
	   public Expiry(Item item) {
	       this.item = item;
	   }
	   public String expiryCheck() {
	       // Assuming the bestBefore string contains days left encoded as space-separated integers
	       String[] daysLeft = item.getBestBefore().split(" ");
	       int days = 0;
	       for (String day : daysLeft) {
	           if (!day.equals("10")) { // Assuming 10 denotes spoiled item
	               days++;
	           }
	       }
	       // Convert days to words
	       switch (days) {
	           case 0:
	               return "ZERO";
	           case 1:
	               return "ONE";
	           case 2:
	               return "TWO";
	           // Add cases for more days if needed
	           default:
	               return "UNKNOWN"; // Handle unexpected cases
	       }
	   }
	   public String itemToDiscard() {
	       // Corrected method to return the item name without special characters
	       return item.getItemName().replaceAll("[^a-zA-Z\\s]", "");
	   }
	}
	public class Program9 {
	   public static void main(String[] args) {
	       Item item = new Item("Blisk", "10100");
	       Expiry expiry = new Expiry(item);
	       String daysLeft = expiry.expiryCheck();
	       String itemName = expiry.itemToDiscard();
	       System.out.println(daysLeft); // Output: TWO
	       System.out.println(itemName); // Output: Blisk
	   }
	}



