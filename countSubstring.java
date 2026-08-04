public static void countSubstrings(String str, int k) {
    for (int i = 0; i <= str.length() - k; i++) {
        String sub = str.substring(i, i + k);
        int count = 0;

        for (int j = 0; j <= str.length() - k; j++) {
            if (str.substring(j, j + k).equals(sub)) {
                count++;
            }
        }

        boolean printed = false;
        for (int x = 0; x < i; x++) {
            if (str.substring(x, x + k).equals(sub)) {
                printed = true;
                break;
            }
        }

        if (!printed) {
            System.out.println(sub + " : " + count);
        }
    }
}