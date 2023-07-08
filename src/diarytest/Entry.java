package diarytest;

import java.time.LocalDate;
import java.util.Scanner;

public class Entry {
    private int id;
    private String topic;
    private String content;
    private LocalDate localDate = LocalDate.now();


    public Entry( String topic, String content, int id) {
        this.id = id;
        this.topic = topic;
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entry{");
        sb.append("id=").append(id);
        sb.append(", topic='").append(topic).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", localDate=").append(localDate);
        sb.append('}');
        return sb.toString();
    }

}
