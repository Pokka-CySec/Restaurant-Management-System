public class Review {
    private Product product;
    private String reviewTitle;
    private String reviewType;
    private String reviewDescription;
    private int rating;

    public Review(Product product, String title, String type, String description, int rate) {
        this.product = product;
        this.reviewTitle = title;
        this.reviewType = type;
        this.reviewDescription = description;
        this.rating = rate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }
    
    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public Product getProduct() {
        return product;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewType() {
        return reviewType;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public int getRating() {
        return rating;
    }
    
}
