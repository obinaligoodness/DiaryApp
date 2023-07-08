package diarytest;

import java.util.ArrayList;
import java.util.List;

public class Diary implements DiaryInterface {
    private  List<Entry> entries = new ArrayList<>();
    private int count;

    @Override
    public void addEntry(String topic , String content) {
        int id = count+1;
        Entry entry = new Entry(topic, content, id);
        count++;
        entries.add(entry);
    }

    @Override
    public int getNoOfEntries() {
        return entries.size();
    }

    @Override
    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public Entry viewEntry(int idNo) {
        return entries.get(idNo-1);
    }

    @Override
    public void deleteEntry(int idNo) {
        for (int i = 0; i < entries.size(); i++) {
           if(i == idNo){Entry entry1 = entries.get(idNo);entries.remove(idNo);}
        }
    }

}
