
public class Problem12 {

	public void printarrays(int[] jhin, int[] yasuo) {
		int x = 0;
		int y = 0;
		while (x < jhin.length || y < yasuo.length) {
			if (x == jhin.length) {
				System.out.print(yasuo[y]);
				y++;
			}
			else if (y == yasuo.length) {
				System.out.print(jhin[x]);
				x++;
			}
			else {
				if (jhin[x] <= yasuo[y]) {
					System.out.print(jhin[x]);
					x++;
				}
				else {
					System.out.print(yasuo[y]);
					y++;
				}
			}
		}
	}
}	