package intro.primitive;

public class Array03BooleanDefaultValues {
    public static void main(String[] args) {
        boolean[] isEnglishMeetings = new boolean[4];
        isEnglishMeetings[0] = true;

        for (int i = 0; i < isEnglishMeetings.length; i++) {
            System.out.println("isEnglishMeetings[" + i + "] = " + isEnglishMeetings[i]);
        }
    }
}
