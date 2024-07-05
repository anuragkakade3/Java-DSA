public class Duplicates {
    public static void isduplicate(String str, int idx, StringBuilder sb, boolean map[]) {
        // Base case
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        // Working
        char currentchar = str.charAt(idx);
        if (map[currentchar - 'a'] == true) {
            isduplicate(str, idx + 1, sb, map);
        } else {
            map[currentchar - 'a'] = true;
            isduplicate(str, idx + 1, sb.append(currentchar), map);
        }

    }

    public static void main(String[] args) {
        String str = "appnacollege";
        isduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }

}
