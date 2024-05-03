public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hello How Are You Ditia";
        String GantiKarakter = string1.replace('H', 'P');
        String GantiKalimat = string1.replace("How", "What");
        System.out.println("Untuk replace karakter:" + GantiKarakter);
        System.out.println("Untuk replace kalimat:" + GantiKalimat);

    }

}