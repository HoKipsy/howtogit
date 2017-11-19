public class Buzzing
{
	public static void main(String[] args) {
		countBuzz(100);
	}

    public static void countBuzz(int a) {
        try {
            for (int i = 0; i < a; i++) {
                if (a % 4) {
                    System.out.println("buzz")
                }
                else {
                    System.out.println(a);
                }
            }
        }
        catch (IOException e) {
            System.out.println("There is an error somewhere.")
        }
    }
}