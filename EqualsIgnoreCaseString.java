public class EqualsIgnoreCaseString {
    public static void main(String[] args) {
        String string1 = "dit";
        String string2 = "dit";
        String string3 = "Dit";
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string3));
    }

}