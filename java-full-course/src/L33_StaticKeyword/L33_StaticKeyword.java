package L33_StaticKeyword;

public class L33_StaticKeyword {
    public static void main(String[] args) {
        // static = a keyword modifier, meaning a single copy of a variable/method is created and shared
        // The class "owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends);
        // System.out.println(friend1.numberOfFriends);

        Friend.displayFriends();
        
    }
}
