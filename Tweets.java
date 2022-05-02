// EXAM INSTRUCTIONS:
// All of your code for Task 2 goes in this file.
// Add new method headers and implementations as appropriate to these classes
// Add examples to the ExamplesTweets class.
import tester.*;

interface Tweet {
    // Task 2.1: latestTweetOnThread
    // Your code here

    // Task 2.2: longestUsernameOnThread
    // Your code here

    // Provided methods, DO NOT MODIFY
    User getAuthor();
    String getContents();
    int getLikes();
    Tweet getReplyTo();
    String getDate();
}

// User class, DO NOT MODIFY
class User {
    String username, displayName;
    int followers;
    User(String username, String displayName, int followers) {
        this.username = username;
        this.displayName = displayName;
        this.followers = followers;
    }

    String toText() {
        return username + " @" + displayName;
    }
}

class TextTweet implements Tweet {
    User author;
    String contents;
    String date;
    int likes;

    TextTweet(String contents, User author, int likes, String date) {
        this.author = author;
        this.contents = contents;
        this.likes = likes;
        this.date = date;
        
    }

    // Task 2.1: latestTweetOnThread
    // Your code here

    // Task 2.2: longestUsernameOnThread
    // Your code here

    // Provided methods, DO NOT MODIFY
    public User getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }

    public int getLikes() {
        return likes;
    }

    public Tweet getReplyTo() {
        return null;
    }
    public String getDate(){
        return date;
    }

}

class ReplyTweet implements Tweet {
    User author;
    String contents;
    int likes;
    String date; 
    Tweet replyTo;

    ReplyTweet(String contents, User author, int likes, String date, Tweet replyTo) {
        this.author = author;
        this.contents = contents;
        this.likes = likes;
        this.date = date;
        this.replyTo = replyTo;
    }

    // Task 2.1: latestTweetOnThread
    // Your code here

    // Task 2.2: longestUsernameOnThread
    // Your code here

    // Provided methods, DO NOT MODIFY
    public User getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }

    public int getLikes() {
        return likes;
    }

    public Tweet getReplyTo() {
        return replyTo;
    }

    public String getDate(){
        return date;
    }
}

class ExampleTweets {
    // Video Task
    // Your code here
}
    
