import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class FileReview {
    private String filePath;

    public FileReview(String filePath) {
        this.filePath = filePath;
    }

    public Queue loadReview() {
        Queue reviews = new Queue();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, ",");
                if (token.countTokens() == 5) {
                    Product product = (Product) token.nextElement();
                    String title = token.nextToken();
                    String type = token.nextToken();
                    String description = token.nextToken();
                    int rating = Integer.parseInt(token.nextToken());

                    Review review = new Review(product, title, type, description, rating);
                    reviews.enqueue(review);
                }
            }
            return reviews;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return reviews;
    }
}
