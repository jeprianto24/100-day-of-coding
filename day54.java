package paket1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class day54 {

    public static void main(String[] args) {
        String url = "https://id.wikipedia.org/wiki/Novel";

        try {
            Document document = Jsoup.connect(url).get();

            String pageText = document.text();

            Map<String, Integer> wordFrequency = calculateWordFrequency(pageText);

            System.out.println("Frekuensi Kata:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> calculateWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency;
    }
}
