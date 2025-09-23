public class Introduction {
    public static void main(String[] args) {
        System.out.println("Ha Hoang Kim Chi\t24021393\tK69I-CS5\thhkc861\thahoangkimchi1608@gmail.com");

        System.out.println();

        for(int i = 9; i >= 1; i--){
            if(i > 1){
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.");
            }
            System.out.println();
        }
    }
}