public class StringExamples {
    public static void main(String[] args) {
        String str;
        str = "I am a student at Edge Tech Academy";
        System.out.println(str);
        System.out.println("length: " + str.length());
        String upper = str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());

        String sub = str.substring(18, 27);
        System.out.println(sub);

        String student = str.substring(7,14);
        System.out.println("Found the word = " + student);

        int whereIsEdge = str.indexOf("Edge");
        System.out.println("whereIsEdge = " + whereIsEdge);
        System.out.println(str.substring(whereIsEdge));
        String removed = str.replace("e", "_").replace("a", "$");
        System.out.println(removed);

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }}
