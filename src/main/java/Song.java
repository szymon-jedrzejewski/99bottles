public class Song {
    public String getVerse(int verse) {
        if (verse < 0 || verse > 99) {
            throw new IllegalArgumentException();
        }
        return getAmountOfBottles(verse) + " of beer on the wall. " + getAmountOfBottles(verse) + " of beer.\n" +
                getActivity(verse) + ". " + getAmountOfBottles(verse - 1) + " of beer on the wall.";
    }

    private String getActivity(int verse) {
        return verse == 0 ? "Go to the store and buy some more" : "Take one down and pass it around";
    }

    private String getAmountOfBottles(int verse) {
        if (verse == -1) return "99 bottles";
        if (verse == 0) return "No more bottles";
        if (verse == 1) return verse + " bottle";

        return verse + " bottles";
    }

    public String getVerses(int start, int end) {
        String verses = "";
        for (int i = start; i >= end; i--) {
            verses += getVerse(i) + "\n\n";
        }
        return verses.substring(0, verses.length() - 2);
    }

    public String getWholeSong() {
        return getVerses(99, 0);
    }
}
