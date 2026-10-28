import java.util.Scanner;

public class GroupScore11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Langkah 2: Input jumlah kelompok dan penilai
        System.out.print("Enter the number of groups: ");
        int numGroups = sc.nextInt();
        System.out.print("Enter the number of graders: ");
        int numGraders = sc.nextInt();

        // Validasi input awal
        if (numGroups <= 0 || numGraders <= 0) {
            System.out.println("Groups and graders must be > 0.");
        } else {
            // Langkah 3: Penyiapan variabel pelacak
            int groupNo = 1;
            double highestAverage = -1;
            int bestGroup = 0;

            // Langkah 4: Perulangan luar (proses tiap kelompok)
            while (groupNo <= numGroups) {
                System.out.println("Group " + groupNo);
                double totalScore = 0; // Reset total nilai tiap kelompok

                // Langkah 5: Perulangan tengah (proses penilai) & dalam (validasi nilai)
                for (int j = 1; j <= numGraders; j++) {
                    int score;
                    do {
                        System.out.print("  Score from Grader " + j + ": ");
                        score = sc.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.println("  Score must be 0-100. Retry!");
                        }
                    } while (score < 0 || score > 100);

                    totalScore += score;
                }

                // Langkah 6: Hitung dan tampilkan rata-rata
                double averageScore = totalScore / numGraders;
                System.out.println("Group " + groupNo + ": average score = " + averageScore);

                // Langkah 7: Cek dan perbarui kelompok terbaik
                if (averageScore > highestAverage) {
                    highestAverage = averageScore;
                    bestGroup = groupNo;
                }

                groupNo++; // Increment kelompok
            }

            // Langkah 8: Tampilkan hasil kelompok terbaik
            System.out.println("==============================");
            System.out.println("Best group      : " + bestGroup);
            System.out.println("Highest average : " + highestAverage);
        }

        sc.close();
    }
}
