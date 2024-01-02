package com.codility.easy;

import java.util.List;

/**
 * You would like to set a password for a bank account. However, there are three restrictions on the format of the password:
 * <p>
 * it has to contain only alphanumerical characters (a−z, A−Z, 0−9); there should be an even number of letters; there should be an odd number of
 * digits. You are given a string S consisting of N characters. String S can be divided into words by splitting it at, and removing, the spaces. The
 * goal is to choose the longest word that is a valid password. You can assume that if there are K spaces in string S then there are exactly K + 1
 * words.
 * <p>
 * For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid passwords: "5", "a0A" and "pass007". Thus the
 * longest password is "pass007" and its length is 7. Note that neither "test" nor "?xy1" is a valid password, because "?" is not an alphanumerical
 * character and "test" contains an even number of digits (zero).
 * <p>
 * Write a function: class Solution { public int solution(String S); }
 * <p>
 * that, given a non-empty string S consisting of N characters, returns the length of the longest word from the string that is a valid password. If
 * there is no such word, your function should return −1.
 * <p>
 * For example, given S = "test 5 a0A pass007 ?xy1", your function should return 7, as explained above.
 * <p>
 * Assume that: N is an integer within the range [1..200]; string S consists only of printable ASCII characters and spaces. In your solution, focus on
 * correctness. The performance of your solution will not be the focus of the assessment.
 */
public final class LongestPassword {

    // String S
    // String S consists of N characters
    // String S can be divided into words by splitting it at, and removing, the spaces
    // It has to contain only alphanumerical characters (a−z, A−Z, 0−9);
    // There should be an even number of letters;
    // There should be an odd number of digits.
    // Choose the longest word that is a valid password

    public int solution(String S) {
        var result = -1;
        if (!S.isBlank()) {

            final var words = splitWords(S.trim());

            if(numberOfWordsIsBetween1And200(words)) {
                final var word =
                        words.stream()
                                .sorted((str1, str2) -> Integer.compare(str2.length(), str1.length()))
                                .filter(this::isAlphanumeric)
                                .filter(this::hasEvenNumberOfLetters)
                                .filter(this::hasOddNumberOfDigits)
                                .findFirst()
                                .orElse(null);

                result = word != null ? word.length() : -1;
            }
        }

        return result;
    }

    public boolean isAlphanumeric(String value) {
        return !value.isBlank()
                && value.chars().allMatch(Character::isLetterOrDigit);
    }

    private boolean hasEvenNumberOfLetters(final String value) {
        final var result = removeNonLetters(value);
        return isEven(result);
    }

    private boolean hasOddNumberOfDigits(final String value) {
        final var result = removeNonDigits(value);
        return isOdd(result);
    }

    public String removeNonLetters(String input) {
        return input.replaceAll("[^a-zA-Z]", "");
    }

    public String removeNonDigits(String input) {
        return input.replaceAll("[^0-9]", "");
    }

    private boolean isEven(String value) {
        return value.length() % 2 == 0;
    }

    private boolean isOdd(String value) {
        return value.length() % 2 != 0;
    }

    private List<String> splitWords(final String value) {
        return value.contains(" ") ? List.of(value.split(" ")) : List.of(value);
    }

    private boolean numberOfWordsIsBetween1And200(final List<String> words) {
        return words.size() > 0 && words.size() <= 200;
    }
}
