import java.util.ArrayList;
import java.util.List;

class BomRevision {
    private final List<BomLine> lines;

    BomRevision(List<BomLine> lines) {
        // List.copyOf(...) değiştirilemez (unmodifiable) bir kopya oluşturur
        this.lines = List.copyOf(lines);
    }

    List<BomLine> lines() {
        return lines;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        List<BomLine> original = new ArrayList<>();
        original.add(new BomLine("WOOD-A", 20, 5));

        BomRevision revision = new BomRevision(original);

        System.out.println("Before change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());

        // Orijinal listeyi değiştiriyoruz
        original.add(new BomLine("GLUE-A", 2, 0));

        System.out.println("After change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());

        // Korumalı listeyi doğrudan değiştirmeye çalışma testi
        try {
            System.out.println("\nRevision listesini temizleme testi:");
            revision.lines().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("HATA Yakalandı: List.copyOf() ile korunan liste değiştirilemez! (java.lang.UnsupportedOperationException)");
        }
    }
}