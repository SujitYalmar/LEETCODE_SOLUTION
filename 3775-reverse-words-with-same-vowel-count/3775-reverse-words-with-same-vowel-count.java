class Solution {
    public String reverseWords(String s) {
        String parivontel = s;

        String[] words = parivontel.split(" ");

        int firstVowelCount = 0;

        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            if (isVowel(c)) {
                firstVowelCount++;
            }
        }

        for (int i = 1; i < words.length; i++) {
            int vowelCount = 0;

            for (int j = 0; j < words[i].length(); j++) {
                if (isVowel(words[i].charAt(j))) {
                    vowelCount++;
                }
            }
            
            if (vowelCount == firstVowelCount) {
                char[] arr = words[i].toCharArray();
                int left = 0, right = arr.length - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                words[i] = new String(arr);
            }
        }
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}