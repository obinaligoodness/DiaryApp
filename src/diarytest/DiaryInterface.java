package diarytest;

import java.util.List;

public interface DiaryInterface {

    void addEntry(String topic, String content);
    int getNoOfEntries();
    List<Entry> getEntries();
    Entry viewEntry(int idNo);

    void deleteEntry(int idNo);
}
