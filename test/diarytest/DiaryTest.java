//package diarytest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class DiaryTest {
//    private DiaryInterface diary;
//    private Entry entry;
//
//    @BeforeEach
//    public void setUp(){
//        diary = new Diary();
//    }
//    @Test
//    public void testThatDiaryExists(){
//        assertNotNull(diary);
//    }
//    @Test
//    public void testThatDiaryIsEmpty(){
//        int noOfEntries = diary.getNoOfEntries();
//        assertEquals(0,noOfEntries);
//    }
//    @Test
//    public void testThatEntryCanBeAddedToDiaryAndEntrySizeIncrease(){
//     Entry entry = new Entry();
//     entry.setTopic("A native");
//     entry.setContent("A native has a laptop");
//     diary.addEntry(entry);
//     int noOfEntries = diary.getNoOfEntries();
//     assertEquals(1,noOfEntries);
//    }
//}
