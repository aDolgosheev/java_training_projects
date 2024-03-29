import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    private final int userId;
    private final int id;
    private final String title;
    private final String body;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") int id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String body
    ) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post:" +
                "\n userId=" + userId +
                "\n id=" + id +
                "\n title='" + title +
                "\n body='" + body;
    }
}
