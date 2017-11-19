public class Counting
{
	public static void main(String[] args) {
		count(100);
	}

    public static void count(int a) {
        try {
            for (int i = 0; i < a; i++) {
                System.out.println(a);
            }
        }
        catch (IOException e) {
            System.out.println("There is an error somewhere.")
        }
    }
}