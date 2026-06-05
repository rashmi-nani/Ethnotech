import java.util.Scanner;

class Post {
    String content;
    Post prev;
    Post next;

    Post(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

public class SocialMediaFeed {

    static Post head = null;
    static Post tail = null;
    static Post current = null;

 
    static void addPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }

        System.out.println("Post added successfully.");
    }


    static void insertSponsoredPost(String content) {
        if (current == null) {
            System.out.println("No posts available.");
            return;
        }

        Post sponsored = new Post("[Sponsored] " + content);

        sponsored.next = current.next;
        sponsored.prev = current;

        if (current.next != null) {
            current.next.prev = sponsored;
        } else {
            tail = sponsored;
        }

        current.next = sponsored;

        System.out.println("Sponsored post inserted.");
    }

 
    static void deleteCurrentPost() {
        if (current == null) {
            System.out.println("No post to delete.");
            return;
        }

        Post temp = current;

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
            current = temp.next;
        } else {
            tail = temp.prev;
            current = temp.prev;
        }

        System.out.println("Post deleted.");
    }


    static void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current Post: " + current.content);
        } else {
            System.out.println("No next post.");
        }
    }

 
    static void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current Post: " + current.content);
        } else {
            System.out.println("No previous post.");
        }
    }


    static void displayFeed() {
        if (head == null) {
            System.out.println("Feed is empty.");
            return;
        }

        Post temp = head;

        System.out.println("\n--- Social Media Feed ---");
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SOCIAL MEDIA FEED =====");
            System.out.println("1. Add New Post");
            System.out.println("2. Delete Current Post");
            System.out.println("3. Insert Sponsored Post");
            System.out.println("4. Next Post");
            System.out.println("5. Previous Post");
            System.out.println("6. Display Feed");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Post Content: ");
                    String post = sc.nextLine();
                    addPost(post);
                    break;

                case 2:
                    deleteCurrentPost();
                    break;

                case 3:
                    System.out.print("Enter Sponsored Content: ");
                    String sponsored = sc.nextLine();
                    insertSponsoredPost(sponsored);
                    break;

                case 4:
                    nextPost();
                    break;

                case 5:
                    previousPost();
                    break;

                case 6:
                    displayFeed();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}