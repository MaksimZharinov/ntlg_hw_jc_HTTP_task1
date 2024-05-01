import com.fasterxml.jackson.annotation.JsonProperty;

public class Rspns {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Rspns(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Fact about " + getType() +
                " from " + getUser() + ":\n" +
                getText() + "\n" +
                "Upvotes: " + getUpvotes() + "\n" +
                "Post ID: " + getId() + "\n";
    }
}
